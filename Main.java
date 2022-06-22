import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Moves moves = new Moves();

        //Getting the user's choice
        System.out.println("=========================================");        
        Scanner scan = new Scanner(System.in);
        System.out.println("Select the AI's opponent");
        System.out.println("[1] Human");
        System.out.println("[2] AI");
        System.out.print("==> ");
        String userChoice = scan.nextLine();
        int userChoiceint = Integer.parseInt(userChoice);

        //Making sure user either chooses 1 or 2
        while(userChoiceint > 2 && userChoiceint > 0){
            System.out.println("Please enter either 1 or 2");
            System.out.print("==> ");
            userChoice = scan.nextLine();
            userChoiceint = Integer.parseInt(userChoice);
        }
        
        moves.getUserMove(userChoiceint);
    }
}