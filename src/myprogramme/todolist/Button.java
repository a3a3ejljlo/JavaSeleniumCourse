package myprogramme.todolist;

import myprogramme.MainMenu;

import javax.swing.*;


public class Button {
    //TODO в процессе...
    MainMenu mainMenu = new MainMenu();
    JFrame frame = new JFrame();

    JButton jButton = new JButton("Кнопка для теста");

    public Button(String s) {
        JButton jButton = new JButton(s);
        showButton(jButton);
    }

    void showButton(JButton jButton) {
        frame.getContentPane().add(jButton);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}
