import java.util.Scanner;

public class Players extends Player {
    public Scanner sc = new Scanner(System.in);

    public Players(int player) {
        super(player);
        this.player = player;
        System.out.println("Player Created");
    }

    @Override
    public void Play(Table table) {
        Trying(table);
        table.setPosition(trying, player);
    }

    @Override
    public void Trying(Table table) {
        do {
            do {
                System.out.println("Line: ");
                trying[0] = sc.nextInt();

                if (trying[0] > 3 || trying[0] < 1) {
                    System.out.println("Invalid Line. Just Input 1, 2 or 3");
                }
            } while (trying[0] > 3 || trying[0] < 1);
            do {
                System.out.println("Column: ");
                trying[1] = sc.nextInt();
                if (trying[1] > 3 || trying[1] < 1) {
                    System.out.println("Invalid Column. Just Input 1, 2 or 3");
                }
            } while (trying[1] > 3 || trying[1] < 1);
            trying[0]--;
            trying[1]--;

            if (!checkTry(trying, table)) {
                System.out.println("Try another place, this place is just checked");
            }
        } while (!checkTry(trying, table));
    }
}
