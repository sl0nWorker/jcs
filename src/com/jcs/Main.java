package com.jcs;

import com.jcs.MainFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new MainFrame("JCS - multicloud system"); // ������� ����� ����������, � ����������




     //   JPanel RightPanel = new JPanel(); // ������ ��� ���� ��������� ���������
      //  RightPanel.setBackground(Color.BLUE);
       // frame.add(RightPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.VERTICAL, new Insets(2, 2, 2, 2), 0, 0)); // ������������ �� ������
        String[] data2 = {"folder1", "folder2", "file.txt"};
        JList <String> folderList = new JList<>(data2);
       // folderList.setSize(500,100);
      //  frame.add(folderList, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.PAGE_START, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0)); // ������������ �� ������ ����

       // frame.pack();
        frame.setVisible(true);
    }
}
