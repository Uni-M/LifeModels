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
public class SimkinGliderGun extends Gun {

    private final String name = "Simkin Glider Gun";

    @Override
    public boolean[][] create() {

        boolean[][] cells = new boolean[SIZE_WIDTH][SIZE_HEIGHT];
        for (int i = 0; i < SIZE_WIDTH / DOT_SIZE; i++) {
            for (int j = 0; j < SIZE_HEIGHT / DOT_SIZE; j++) {
                int x = i * DOT_SIZE;
                int y = j * DOT_SIZE;

                if (x == 14 * DOT_SIZE && y == 5 * DOT_SIZE) cells[x][y] = true;

                if (x == 14 * DOT_SIZE && y == 6 * DOT_SIZE) cells[x][y] = true;
                if (x == 15 * DOT_SIZE && y == 6 * DOT_SIZE) cells[x][y] = true;
                if (x == 16 * DOT_SIZE && y == 6 * DOT_SIZE) cells[x][y] = true;

                if (x == 17 * DOT_SIZE && y == 7 * DOT_SIZE) cells[x][y] = true;

                if (x == 16 * DOT_SIZE && y == 8 * DOT_SIZE) cells[x][y] = true;
                if (x == 17 * DOT_SIZE && y == 8 * DOT_SIZE) cells[x][y] = true;




                if (x == 11 * DOT_SIZE && y == 12 * DOT_SIZE) cells[x][y] = true;

                if (x == 5 * DOT_SIZE && y == 13 * DOT_SIZE) cells[x][y] = true;
                if (x == 6 * DOT_SIZE && y == 13 * DOT_SIZE) cells[x][y] = true;
                if (x == 10 * DOT_SIZE && y == 13 * DOT_SIZE) cells[x][y] = true;
                if (x == 14 * DOT_SIZE && y == 13 * DOT_SIZE) cells[x][y] = true;
                if (x == 15 * DOT_SIZE && y == 13 * DOT_SIZE) cells[x][y] = true;
                if (x == 16 * DOT_SIZE && y == 13 * DOT_SIZE) cells[x][y] = true;

                if (x == 5 * DOT_SIZE && y == 14 * DOT_SIZE) cells[x][y] = true;
                if (x == 6 * DOT_SIZE && y == 14 * DOT_SIZE) cells[x][y] = true;
                if (x == 9 * DOT_SIZE && y == 14 * DOT_SIZE) cells[x][y] = true;
                if (x == 16 * DOT_SIZE && y == 14 * DOT_SIZE) cells[x][y] = true;

                if (x == 10 * DOT_SIZE && y == 15 * DOT_SIZE) cells[x][y] = true;
                if (x == 16 * DOT_SIZE && y == 15 * DOT_SIZE) cells[x][y] = true;

                if (x == 11 * DOT_SIZE && y == 16 * DOT_SIZE) cells[x][y] = true;
                if (x == 12 * DOT_SIZE && y == 16 * DOT_SIZE) cells[x][y] = true;
                if (x == 14 * DOT_SIZE && y == 16 * DOT_SIZE) cells[x][y] = true;
                if (x == 15 * DOT_SIZE && y == 16 * DOT_SIZE) cells[x][y] = true;



                if (x == 32 * DOT_SIZE && y == 21 * DOT_SIZE) cells[x][y] = true;
                if (x == 33 * DOT_SIZE && y == 21 * DOT_SIZE) cells[x][y] = true;

                if (x == 32 * DOT_SIZE && y == 22 * DOT_SIZE) cells[x][y] = true;
                if (x == 33 * DOT_SIZE && y == 22 * DOT_SIZE) cells[x][y] = true;

                if (x == 29 * DOT_SIZE && y == 24 * DOT_SIZE) cells[x][y] = true;
                if (x == 30 * DOT_SIZE && y == 24 * DOT_SIZE) cells[x][y] = true;
                if (x == 36 * DOT_SIZE && y == 24 * DOT_SIZE) cells[x][y] = true;
                if (x == 37 * DOT_SIZE && y == 24 * DOT_SIZE) cells[x][y] = true;

                if (x == 29 * DOT_SIZE && y == 25 * DOT_SIZE) cells[x][y] = true;
                if (x == 30 * DOT_SIZE && y == 25 * DOT_SIZE) cells[x][y] = true;
                if (x == 36 * DOT_SIZE && y == 25 * DOT_SIZE) cells[x][y] = true;
                if (x == 37 * DOT_SIZE && y == 25 * DOT_SIZE) cells[x][y] = true;
            }
        }
        return cells;
    }

    @Override
    public JLabel getLabel() {
        ImageIcon icon = new ImageIcon(SimkinGliderGun.class.getClassLoader().getResource("simkin_gun.gif"));
        return new JLabel(icon);
    }
}
