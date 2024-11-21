package GUI.Extras;
import java.awt.datatransfer.DataFlavor;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class ImageFileTransferHandler extends TransferHandler {
    private JPanel imagePanel;
    private byte[] imageByteArray; // Variable to store image bytes

    public ImageFileTransferHandler(JPanel imagePanel) {
        this.imagePanel = imagePanel;
    }

    @Override
    public boolean canImport(TransferSupport support) {
        return support.isDataFlavorSupported(DataFlavor.javaFileListFlavor);
    }

    @Override
    public boolean importData(TransferSupport support) {
        if (!canImport(support)) {
            return false;
        }
        try {
            List<File> files = (List<File>) support.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
            if (files.size() == 1) {
                File file = files.get(0);
                String fileName = file.getName().toLowerCase();
                if (fileName.endsWith(".jpg") || fileName.endsWith(".png") || fileName.endsWith(".jpeg")) {
                    ImageIcon originalImageIcon = new ImageIcon(file.getAbsolutePath());

                    // Calculate the new size maintaining the aspect ratio
                    int panelWidth = imagePanel.getWidth();
                    int panelHeight = imagePanel.getHeight();
                    int originalWidth = originalImageIcon.getIconWidth();
                    int originalHeight = originalImageIcon.getIconHeight();
                    double aspectRatio = (double) originalWidth / originalHeight;
                    int newWidth = panelWidth;
                    int newHeight = (int) (panelWidth / aspectRatio);
                    if (newHeight > panelHeight) {
                        newHeight = panelHeight;
                        newWidth = (int) (panelHeight * aspectRatio);
                    }

                    // Scale the image to fit within the imagePanel
                    Image scaledImage = originalImageIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
                    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

                    // Convert the image to a BufferedImage
                    BufferedImage bufferedImage = new BufferedImage(originalImageIcon.getIconWidth(), originalImageIcon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
                    bufferedImage.getGraphics().drawImage(originalImageIcon.getImage(), 0, 0, null);

                    // Convert BufferedImage to byte array
                    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                        ImageIO.write(bufferedImage, "jpg", baos);
                        baos.flush();
                        imageByteArray = baos.toByteArray();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    // Remove any existing components in the imagePanel
                    imagePanel.removeAll();

                    // Create a new JLabel with the scaled image and add it to the imagePanel
                    JLabel imageLabel = new JLabel(scaledImageIcon);
                    imagePanel.add(imageLabel);

                    // Refresh the imagePanel to display the new image
                    imagePanel.revalidate();
                    imagePanel.repaint();

                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Please drop a valid image file.", "Invalid File", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public byte[] getImageByteArray() {
        return imageByteArray;
    }
}