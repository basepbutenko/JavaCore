package GameLauncher;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        boolean p1isRigt = false;
        boolean p2isRigt = false;
        boolean p3isRigt = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("я загадываю число от 0 до 9...");
        while (true) {
            System.out.println("Число, которое необходимо угадать, - " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);
            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);
            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);
            if (guessp1 == targetNumber) {
                p1isRigt = true;
            }
            if (guessp2 == targetNumber) {
                p2isRigt = true;
            }
            if (guessp3 == targetNumber) {
                p3isRigt = true;
            }
            if (p1isRigt || p2isRigt || p3isRigt) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + p1isRigt);
                System.out.println("Второй игрок угадал?" + p2isRigt);
                System.out.println("Третий игрок угадал?" +p3isRigt);
                System.out.println("The and");
                break;
            } else {
                System.out.println("Игроки должны попробывать еще раз.");

            }
        }
    }
}
