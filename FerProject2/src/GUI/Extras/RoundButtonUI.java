package GUI.Extras;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class RoundButtonUI extends BasicButtonUI {
    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        AbstractButton button = (AbstractButton) c;
        button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Optional: Adjust padding
        button.setContentAreaFilled(false);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int diameter = Math.min(c.getWidth(), c.getHeight());
        int x = (c.getWidth() - diameter) / 2;
        int y = (c.getHeight() - diameter) / 2;
        Shape circle = new Ellipse2D.Float(x, y, diameter, diameter);
        g2.setColor(c.getBackground());
        g2.fill(circle);
        super.paint(g2, c);
    }
}