package ru.life.template;

import javax.swing.*;
import java.io.IOException;

public interface Colony {

    String getName();

    boolean[][] create();

    JLabel getLabel() throws IOException;
}
