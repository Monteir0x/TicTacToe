import java.util.Scanner;

public class Game {
    private Table table;
    private int round = 1, time = 1;
    private Player player1;
    private Player player2;

    public Scanner sc = new Scanner(System.in);


    public Game() {
        table = new Table();
        initPlayers();
        while (Play()) ;
    }

    public void initPlayers() {
        this.player1 = new Players(1);
        this.player2 = new Players(2);
    }

    public boolean Play() {
        if (win() == 0) {
            System.out.println("--------------------");
            System.out.println("Rodada " + round);
            System.out.println("É a vez do jogador " + time());

            if (time() == 1) {
                player1.Play(table);
            } else {
                player2.Play(table);
            }

            if (table.completeTable()) {
                System.out.println("Empate");
                return false;
            }
            time++;
            round++;
            return true;
        } else {
            if (win() == -1) {
                System.out.println("Primeiro Jogador Ganhou");
            } else {
                System.out.println("Segundo Jogador Ganhou");
            }
            return false;
        }
    }


    public int time() {
        if (time % 2 == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    public int win() {
        if (table.checkLine() == 1) {
            return 1;
        }
        if (table.checkColumn() == 1) {
            return 1;
        }
        if (table.checkDiagonal() == 1) {
            return 1;
        }

        if (table.checkLine() == -1) {
            return -1;
        }
        if (table.checkColumn() == -1) {
            return -1;
        }
        if (table.checkDiagonal() == -1) {
            return -1;
        }
        return 0;
    }
}
