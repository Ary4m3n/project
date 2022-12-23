package FrameworksDrivers.UIElements;

import javax.swing.*;
import java.awt.*;

public class Button {
    JButton button;

    public JButton getButton(){
        return button;
    }

    public void createButton(JPanel jPanel, String buttonText, int boundX, int boundY, int boundWidth, int boundHeight){
        button = new JButton(buttonText);
        jPanel.add(button);
        button.setBounds(boundX, boundY, boundWidth, boundHeight);
        button.setLocation(new Point(boundX, boundY));
    }
}
