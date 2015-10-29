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
        this.setSize(1080, 720); // ������ ������� �����
        // this.pack(); - ������������� ����������� ������ ����, ����� ��� ���������� ����������
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���������� ����������� ��� ������� �� �������
        this.setLocationRelativeTo(null); // ������������ �� ������
        this.setLayout(new GridBagLayout()); // ������������ ������ �����

        LeftPenel = new Panels();
        String[] data = {"Dropbox", "Yandex.disk", "Google Drive"};
        JList<String> accountList = new JList<>(data); // ������ ���������

        LeftPenel.add(accountList);
        //new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.PAGE_START,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,2),0,0)); //

        LeftPenel.setVisible(true);
        this.add(LeftPenel);









        this.setVisible(true);
    }
}
