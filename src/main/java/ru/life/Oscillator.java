package ru.life;

import javax.swing.*;
import java.io.IOException;
import java.net.MalformedURLException;

public abstract class Oscillator {

    public abstract String getName();

    public abstract boolean[][] create();

    public abstract JLabel getLabel() throws IOException;
}
