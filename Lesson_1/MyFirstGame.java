public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 72;
        int playerNumber = 1;

        while (playerNumber != secretNumber) {
            if (playerNumber < secretNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            }
            
            
            playerNumber += 1;
            
            if (playerNumber > 100) {
                break; // Выход из цикла, чтобы избежать зацикливания
            }
        }

        System.out.println("Вы победили! Загаданное число: " + secretNumber);
    }
}






