import java.util.Scanner;
//This is the class that will handle taking in the users 
//choice of where to put their x or o

public class Moves {
    Board board = new Board();
    WinChecker winChecker = new WinChecker();
    AI test = new AI();
    Main main = new Main();

    int moveCounter = 1;
    int move;
    boolean spotChecker;
    int firstUserChoice;
    
    public int getUserMove(int firstUserChoice){
        //Creating and printing board
        char arr[] = new char[9];
        board.createBoard(arr);
        board.printBoard(arr);
        Scanner scan = new Scanner(System.in);
        String player = "1";
        char piece = ' ';
        boolean win = winChecker.gameOver(arr);

        //Loop to make sure game keeps going until it ties or results in a win/loss
        while(!win){
            //To keep track of what player is going and what piece is being used
            if(moveCounter % 2 == 0){
                player = "2";
                piece = 'O';
                System.out.println("Player " + player + "'s turn...");
                move = test.getAIMove(arr, piece, 'X');
                int row = getRow(move);
                int col = getCol(move);
                System.out.println("(" + row + "," + col + ")");
            }else{
                player = "1";
                piece = 'X';
                System.out.println("Player " + player + "'s turn...");
                if(firstUserChoice == 2){
                    move = test.getAIMove(arr, piece, 'O');
                    int row = getRow(move);
                    int col = getCol(move);
                    System.out.println("(" + row + "," + col + ")");  
                }else{
                    System.out.print("Enter row [0 to 2]: ");
                    String srow = scan.nextLine();
                    int row = Integer.parseInt(srow);
                    while(row > 2 || row < 0){
                        System.out.println("Please choose either row 0, 1, or 2");
                        System.out.print("Enter row [0 to 2]: ");
                        srow = scan.nextLine();
                        row = Integer.parseInt(srow);
                    }
                    
                    System.out.print("Enter col [0 to 2]: ");
                    String scol = scan.nextLine();
                    int col = Integer.parseInt(scol);
                    while(col > 2 || col < 0){
                        System.out.println("Please choose either col 0, 1, or 2");
                        System.out.print("Enter col [0 to 2]: ");
                        scol = scan.nextLine();
                        col = Integer.parseInt(scol);
                    }
                
                    move = getMovePlacement(row, col);
                    spotChecker = board.spotChecker(move, arr);
                    while(!spotChecker){
                        System.out.println("Please pick a spot that doesn't already have a move in it");
                        board.printBoard(arr);
                        System.out.println("Player " + player + "'s turn...");
                        System.out.print("Enter row [0 to 2]: ");
                        srow = scan.nextLine();
                        System.out.print("Enter col [0 to 2]: ");
                        scol = scan.nextLine();
                        row = Integer.parseInt(srow);
                        col = Integer.parseInt(scol);
                        move = getMovePlacement(row, col);
                        spotChecker = board.spotChecker(move, arr);
                    }
                }
            }

            //Updating board and printing it
            board.setBoard(move, piece, arr);
            board.printBoard(arr);
            win = winChecker.gameOver(arr);
            moveCounter = moveCounter + 1;
            
            //Prints who won or a tie if the game ended in a tie
            if(win){
                System.out.println("Player " + player + " Wins!");
            }else if(arr[0] != ' ' && arr[1] != ' ' && arr[2] != ' ' && arr[3] != ' ' && arr[4] != ' ' && arr[5] != ' ' && arr[6] != ' ' && arr[7] != ' ' && arr[8] != ' '){
                System.out.println("Tie Game!");
                return 0;
            }
        }
        return move;
    }

    //Converts row and column into a placement on the board
    public int getMovePlacement(int row, int col){
        int playerMove = (1 * (row * 3)) + col;
        return playerMove;
    }

    //Converts placement on the board to rows
    public int getRow(int move){
        int row = move / 3;
        return row;
    }

    //Converts placement on the board to cols
    public int getCol(int move){
        int col = move % 3;
        return col;
    }

}