package ru.life.template;

import javax.swing.*;

public interface Colony {

    String getName();

    boolean[][] create();

    JLabel getLabel();
}
