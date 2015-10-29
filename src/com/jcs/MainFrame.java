package com.jcs;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Anderson on 29.10.2015.
 */
public class MainFrame extends JFrame {
    private Panels LeftPenel;
    public MainFrame(String title) {
        this.setTitle(title);
        this.setSize(1080, 720); // размер главной формы
        // this.pack(); - устанавливает оптимальный размер окна, чтобы все компоненты помещались
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // приложение завершается при нажатии на кретиск
        this.setLocationRelativeTo(null); // выравнивание по центру
        this.setLayout(new GridBagLayout()); // выравнивание внутри формы

        LeftPenel = new Panels();
        String[] data = {"Dropbox", "Yandex.disk", "Google Drive"};
        JList<String> accountList = new JList<>(data); // список аккаунтов

        LeftPenel.add(accountList);
        //new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.PAGE_START,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,2),0,0)); //

        LeftPenel.setVisible(true);
        this.add(LeftPenel);









        this.setVisible(true);
    }
}
