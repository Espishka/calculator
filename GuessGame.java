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

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

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
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("У нас есть победитель! ");
                if (p1isRight && p2isRight && p3isRight)
                    System.out.println("ВОТ ЭТО ДА! Все игроки угадали! Прямо чудо какое-то!");

                else if (p1isRight && p2isRight)
                    System.out.println("Редко такое встретишь! Первый игрок и второй игрок угадали! ");
                else if (p2isRight && p3isRight)
                    System.out.println("И не один, а сразу два! Второй игрок и третий игрок угадали!");
                else if (p3isRight && p1isRight)
                    System.out.println("Поправочка, победителИ! Первый и третий игрок угадали!");
                System.out.println("Спасибо за игру.");
                break;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("У нас есть победитель! ");
                if (p1isRight)
                System.out.println("Первый игрок угадал!");
                else if (p2isRight)
                System.out.println("Второй игрок угадал!" );
                else if (p3isRight)
                System.out.println("Третий игрок угадал!");
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз.");
            }
        }
    }
}

