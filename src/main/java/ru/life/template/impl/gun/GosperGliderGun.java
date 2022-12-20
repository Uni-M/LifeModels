package ru.life.template.impl.gun;

import lombok.Getter;
import org.springframework.stereotype.Component;
import ru.life.template.type.Gun;

import javax.swing.*;

import static ru.life.constant.Size.DOT_SIZE;
import static ru.life.constant.Size.SIZE_HEIGHT;
import static ru.life.constant.Size.SIZE_WIDTH;

@Getter
@Component
public class GosperGliderGun extends Gun {

    private final String name = "Gosper Glider Gun";

    @Override
    public boolean[][] create() {

        boolean[][] cells = new boolean[SIZE_WIDTH][SIZE_HEIGHT];
        for (int i = 0; i < SIZE_WIDTH / DOT_SIZE; i++) {
            for (int j = 0; j < SIZE_HEIGHT / DOT_SIZE; j++) {
                int x = i * DOT_SIZE;
                int y = j * DOT_SIZE;

                if (x == 29 * DOT_SIZE && y == 5 * DOT_SIZE) cells[x][y] = true;

                if (x == 27 * DOT_SIZE && y == 6 * DOT_SIZE) cells[x][y] = true;
                if (x == 29 * DOT_SIZE && y == 6 * DOT_SIZE) cells[x][y] = true;

                if (x == 17 * DOT_SIZE && y == 7 * DOT_SIZE) cells[x][y] = true;
                if (x == 18 * DOT_SIZE && y == 7 * DOT_SIZE) cells[x][y] = true;
                if (x == 25 * DOT_SIZE && y == 7 * DOT_SIZE) cells[x][y] = true;
                if (x == 26 * DOT_SIZE && y == 7 * DOT_SIZE) cells[x][y] = true;
                if (x == 39 * DOT_SIZE && y == 7 * DOT_SIZE) cells[x][y] = true;
                if (x == 40 * DOT_SIZE && y == 7 * DOT_SIZE) cells[x][y] = true;

                if (x == 16 * DOT_SIZE && y == 8 * DOT_SIZE) cells[x][y] = true;
                if (x == 20 * DOT_SIZE && y == 8 * DOT_SIZE) cells[x][y] = true;
                if (x == 25 * DOT_SIZE && y == 8 * DOT_SIZE) cells[x][y] = true;
                if (x == 26 * DOT_SIZE && y == 8 * DOT_SIZE) cells[x][y] = true;
                if (x == 39 * DOT_SIZE && y == 8 * DOT_SIZE) cells[x][y] = true;
                if (x == 40 * DOT_SIZE && y == 8 * DOT_SIZE) cells[x][y] = true;

                if (x == 5 * DOT_SIZE && y == 9 * DOT_SIZE) cells[x][y] = true;
                if (x == 6 * DOT_SIZE && y == 9 * DOT_SIZE) cells[x][y] = true;
                if (x == 15 * DOT_SIZE && y == 9 * DOT_SIZE) cells[x][y] = true;
                if (x == 21 * DOT_SIZE && y == 9 * DOT_SIZE) cells[x][y] = true;
                if (x == 25 * DOT_SIZE && y == 9 * DOT_SIZE) cells[x][y] = true;
                if (x == 26 * DOT_SIZE && y == 9 * DOT_SIZE) cells[x][y] = true;

                if (x == 5 * DOT_SIZE && y == 10 * DOT_SIZE) cells[x][y] = true;
                if (x == 6 * DOT_SIZE && y == 10 * DOT_SIZE) cells[x][y] = true;
                if (x == 15 * DOT_SIZE && y == 10 * DOT_SIZE) cells[x][y] = true;
                if (x == 19 * DOT_SIZE && y == 10 * DOT_SIZE) cells[x][y] = true;
                if (x == 21 * DOT_SIZE && y == 10 * DOT_SIZE) cells[x][y] = true;
                if (x == 22 * DOT_SIZE && y == 10 * DOT_SIZE) cells[x][y] = true;
                if (x == 27 * DOT_SIZE && y == 10 * DOT_SIZE) cells[x][y] = true;
                if (x == 29 * DOT_SIZE && y == 10 * DOT_SIZE) cells[x][y] = true;

                if (x == 15 * DOT_SIZE && y == 11 * DOT_SIZE) cells[x][y] = true;
                if (x == 21 * DOT_SIZE && y == 11 * DOT_SIZE) cells[x][y] = true;
                if (x == 29 * DOT_SIZE && y == 11 * DOT_SIZE) cells[x][y] = true;

                if (x == 16 * DOT_SIZE && y == 12 * DOT_SIZE) cells[x][y] = true;
                if (x == 20 * DOT_SIZE && y == 12 * DOT_SIZE) cells[x][y] = true;

                if (x == 17 * DOT_SIZE && y == 13 * DOT_SIZE) cells[x][y] = true;
                if (x == 18 * DOT_SIZE && y == 13 * DOT_SIZE) cells[x][y] = true;
            }
        }
        return cells;
    }

    @Override
    public JLabel getLabel() {
        ImageIcon icon = new ImageIcon(GosperGliderGun.class.getClassLoader().getResource("gosper_gun.gif"));
        return new JLabel(icon);
    }
}
