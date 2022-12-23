package FrameworksDrivers.UIElements;

import javax.swing.*;
import java.awt.*;

public class Label {
    JLabel label;

    public JLabel getLabel(){
        return label;
    }

    public void createLabel(int boundX, int boundY, int boundWidth, int boundHeight, JPanel jPanel, String text){
        label = new JLabel(text);
        label.setBounds(boundX, boundY, boundWidth, boundHeight);
        if (jPanel != null){
            jPanel.add(label);
        }
    }

    public void setText(String text){
        this.label.setText(text);
    }

    public void setSize(int width, int height){
        this.label.setPreferredSize(new Dimension(width, height));
    }

    public void setFontSize(int size){
        this.label.setFont(new Font("", Font.PLAIN, size));
    }
}
