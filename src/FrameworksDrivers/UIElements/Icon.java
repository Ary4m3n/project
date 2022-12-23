package FrameworksDrivers.UIElements;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Icon {
    ImageIcon icon;

    public ImageIcon getIcon(){
        return icon;
    }

    public Image createIcon(String iconFilePath){
        icon = new ImageIcon(Objects.requireNonNull(this.getClass().getResource(iconFilePath)));
        return icon.getImage();
    }
}
