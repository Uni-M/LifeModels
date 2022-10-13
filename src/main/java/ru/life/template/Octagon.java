package ru.life.template;

import lombok.Getter;
import org.springframework.stereotype.Component;
import ru.life.Oscillator;

import javax.swing.*;

import static ru.life.constant.Size.DOT_SIZE;
import static ru.life.constant.Size.SIZE_HEIGHT;
import static ru.life.constant.Size.SIZE_WIDTH;

@Getter
@Component
public class Octagon extends Oscillator {

    private final String name = "Octagon";

    @Override
    public boolean[][] create() {
        boolean[][] cells = new boolean[SIZE_WIDTH][SIZE_HEIGHT];
        for (int i = 0; i < SIZE_WIDTH / DOT_SIZE; i++) {
            for (int j = 0; j < SIZE_HEIGHT / DOT_SIZE; j++) {
                int x = i * DOT_SIZE;
                int y = j * DOT_SIZE;

                if (x == 6 * DOT_SIZE && y == 5 * DOT_SIZE) cells[x][y] = true;
                if (x == 9 * DOT_SIZE && y == 5 * DOT_SIZE) cells[x][y] = true;

                if (x == 5 * DOT_SIZE && y == 6 * DOT_SIZE) cells[x][y] = true;
                if (x == 7 * DOT_SIZE && y == 6 * DOT_SIZE) cells[x][y] = true;
                if (x == 8 * DOT_SIZE && y == 6 * DOT_SIZE) cells[x][y] = true;
                if (x == 10 * DOT_SIZE && y == 6 * DOT_SIZE) cells[x][y] = true;

                if (x == 6 * DOT_SIZE && y == 7 * DOT_SIZE) cells[x][y] = true;
                if (x == 9 * DOT_SIZE && y == 7 * DOT_SIZE) cells[x][y] = true;

                if (x == 6 * DOT_SIZE && y == 8 * DOT_SIZE) cells[x][y] = true;
                if (x == 9 * DOT_SIZE && y == 8 * DOT_SIZE) cells[x][y] = true;

                if (x == 5 * DOT_SIZE && y == 9 * DOT_SIZE) cells[x][y] = true;
                if (x == 7 * DOT_SIZE && y == 9 * DOT_SIZE) cells[x][y] = true;
                if (x == 8 * DOT_SIZE && y == 9 * DOT_SIZE) cells[x][y] = true;
                if (x == 10 * DOT_SIZE && y == 9 * DOT_SIZE) cells[x][y] = true;

                if (x == 6 * DOT_SIZE && y == 10 * DOT_SIZE) cells[x][y] = true;
                if (x == 9 * DOT_SIZE && y == 10 * DOT_SIZE) cells[x][y] = true;
            }
        }
        return cells;
    }

    @Override
    public JLabel getLabel() {
        ImageIcon icon = new ImageIcon(Octagon.class.getClassLoader().getResource("octagon.gif"));
        return new JLabel(icon);
    }
}
