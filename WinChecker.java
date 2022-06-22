//Made to check if the game is over or not
public class WinChecker {
    
    public boolean gameOver(char [] board){
        boolean result = false;

        if(board[0] == 'X' && board[1] == 'X' && board[2] == 'X'){
            result = true;
        }else if(board[3] == 'X' && board[4] == 'X' && board[5] == 'X'){
            result = true;
        }else if(board[6] == 'X' && board[7] == 'X' && board[8] == 'X'){
            result = true;
        }else if(board[0] == 'X' && board[3] == 'X' && board[6] == 'X'){
            result = true;
        }else if(board[1] == 'X' && board[4] == 'X' && board[7] == 'X'){
            result = true;
        }else if(board[2] == 'X' && board[5] == 'X' && board[8] == 'X'){
            result = true;
        }else if(board[0] == 'X' && board[4] == 'X' && board[8] == 'X'){
            result = true;
        }else if(board[6] == 'X' && board[4] == 'X' && board[2] == 'X'){
            result = true;
        }

        if(board[0] == 'O' && board[1] == 'O' && board[2] == 'O'){
            result = true;
        }else if(board[3] == 'O' && board[4] == 'O' && board[5] == 'O'){
            result = true;
        }else if(board[6] == 'O' && board[7] == 'O' && board[8] == 'O'){
            result = true;
        }else if(board[0] == 'O' && board[3] == 'O' && board[6] == 'O'){
            result = true;
        }else if(board[1] == 'O' && board[4] == 'O' && board[7] == 'O'){
            result = true;
        }else if(board[2] == 'O' && board[5] == 'O' && board[8] == 'O'){
            result = true;
        }else if(board[0] == 'O' && board[4] == 'O' && board[8] == 'O'){
            result = true;
        }else if(board[6] == 'O' && board[4] == 'O' && board[2] == 'O'){
            result = true;
        }

        return result;
    }
}