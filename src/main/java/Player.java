import java.util.Scanner;

public class Player implements Runnable {
    Scanner scanner = new Scanner(System.in);
    private String playerName;
    private static final int SLEEP_TIME = 2000;
    private String userKick = "";
    private boolean finish;

    Player(String name) {
        playerName = name;
    }

    public void run() {
        System.out.println(playerName + " подает");

        while (finish != true) {
            System.out.println("bamm");
            System.out.println("Введите любой символ и нажмите <Enter>");
            userKick = scanner.nextLine();

            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (userKick.equals("")) {
                System.out.println("Вы проиграли. Игра закончена");
                finish = true;
            } else userKick = "";

        }

    }
}