public class Table {
    private int[][] table = new int[3][3];

    public Table() {
        initTable();
    }

    public void initTable() {
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                table[line][column] = 0;
            }
        }
    }

    public int checkLine() {
        for (int line = 0; line < 3; line++) {
            if ((table[line][0] + table[line][1] + table[line][2]) == -3) {
                return -1;
            }
            if ((table[line][0] + table[line][1] + table[line][2]) == 3) {
                return 1;
            }
        }
        return 0;
    }

    public int checkColumn() {
        for (int column = 0; column < 3; column++) {
            if ((table[0][column] + table[1][column] + table[2][column]) == -3) {
                return -1;
            }
            if ((table[0][column] + table[1][column] + table[2][column]) == 3) {
                return 1;
            }
        }
        return 0;
    }

    public int checkDiagonal() {
        if ((table[0][0] + table[1][1] + table[2][2]) == -3) {
            return -1;
        }
        if ((table[0][0] + table[1][1] + table[2][2]) == 3) {
            return 1;
        }
        if ((table[0][2] + table[1][1] + table[2][0]) == -3) {
            return -1;
        }
        if ((table[0][2] + table[1][1] + table[2][0]) == 3) {
            return 1;
        }
        return 0;
    }

    public boolean completeTable() {
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                if (table[line][column] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getPosition(int[] trying) {
        return table[trying[0]][trying[1]];
    }

    public void setPosition(int[] trying, int player) {
        if (player == 1) {
            table[trying[0]][trying[1]] = -1;
        } else {
            table[trying[0]][trying[1]] = 1;
        }
    }
}