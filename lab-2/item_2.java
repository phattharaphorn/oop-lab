import java.util.Scanner;

public class item_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = input.nextInt();
        if (player < 0 || player > 2) {
            System.out.print("Error, please input number between 0-2");
            return;
        }
        System.out.print("The computer is ");
        switch (computer) {
            case 0:
                System.out.print("scissor.");
                break;
            case 1:
                System.out.print("rock.");
                break;
            case 2:
                System.out.print("paper.");
        }

        System.out.print(" You are ");
        switch (player) {
            case 0:
                System.out.print("scissor");
                break;
            case 1:
                System.out.print("rock");
                break;
            case 2:
                System.out.print("paper ");
        }

        if (computer == player)
            System.out.println(" too. It is a draw");
        else {
            boolean win = (player == 0 && computer == 2) || (player == 1 && computer == 0)
                    || (player == 2 && computer == 1);
            if (win)
                System.out.println(". You won");
            else
                System.out.println(". You lose");
        }
    }
}