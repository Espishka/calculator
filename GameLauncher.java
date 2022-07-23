import java.util.Scanner;
 class Player {
    int number = 0;

    public void guess() {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.println("Думаю это число " + number);
    }
}
public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
