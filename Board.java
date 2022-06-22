public class Board {
    
    //Creates an empty array used as the board
    public void createBoard(char [] arr){
        for(int i = 0; i < 9; i++){
            arr[i] = ' ';
        }
    }

    //Places piece in board
    public void setBoard(int move, char piece, char [] arr){
        arr[move] = piece;
    }

    //Used to see if there is a piece in that spot or not
    public boolean spotChecker(int move, char [] arr){
        if(arr[move] != ' '){
            return false;
        }
        return true;
    }

    //Prints the board
    public void printBoard(char [] board){
        System.out.println("=========================================");
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8] + " ");
        System.out.println("=========================================");
    }
}