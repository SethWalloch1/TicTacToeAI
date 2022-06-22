public class AI{
    
    //My AI will check if there is a block or win available and if there is then it
    //will move accordingly. If there isn't then it just randomly chooses. 
    public int getAIMove(char [] arr, char piece, char opponentPiece){
        int min = 0;
        int max = 8;
        int aiMove = (int)Math.floor(Math.random()*(max-min+1)+min);

        aiMove = getDesiredMove(arr, piece, opponentPiece);
        if(aiMove == 9){
            aiMove = (int)Math.floor(Math.random()*(max-min+1)+min);
        }

        //Makes sure no moves can overtake an already played move
        while(arr[aiMove] != ' ' || arr[aiMove] == opponentPiece || arr[aiMove] == piece){
            aiMove = (int)Math.floor(Math.random()*(max-min+1)+min);
        }    
        return aiMove;
    }

    //large if statement chunk to see if there is a win available to either players
    public int getDesiredMove(char [] arr, char piece, char opponentPiece){
        // Checking to see if there is a win for the AI
        if(arr[0] == piece && arr[1] == piece && arr[2] == ' '){
            return 2;
        }else if(arr[1] == piece && arr[2] == piece && arr[0] == ' '){
            return 0;
        }else if(arr[0] == piece && arr[2] == piece && arr[1] == ' '){
            return 1;
        }else if(arr[3] == piece && arr[4] == piece && arr[5] == ' '){
            return 5;
        }else if(arr[4] == piece && arr[5] == piece && arr[3] == ' '){
            return 3;
        }else if(arr[3] == piece && arr[5] == piece && arr[4] == ' '){
            return 4;
        }else if(arr[6] == piece && arr[7] == piece && arr[8] == ' '){
            return 8;
        }else if(arr[7] == piece && arr[8] == piece && arr[6] == ' '){
            return 6;
        }else if(arr[6] == piece && arr[8] == piece && arr[7] == ' '){
            return 7;
        }else if(arr[0] == piece && arr[3] == piece && arr[6] == ' '){
            return 6;
        }else if(arr[3] == piece && arr[6] == piece && arr[0] == ' '){
            return 0;
        }else if(arr[0] == piece && arr[6] == piece && arr[3] == ' '){
            return 3;
        }else if(arr[1] == piece && arr[4] == piece && arr[7] == ' '){
            return 7;
        }else if(arr[4] == piece && arr[7] == piece && arr[1] == ' '){
            return 1;
        }else if(arr[1] == piece && arr[7] == piece && arr[4] == ' '){
            return 4;
        }else if(arr[2] == piece && arr[5] == piece && arr[8] == ' '){
            return 8;
        }else if(arr[8] == piece && arr[5] == piece && arr[2] == ' '){
            return 2;
        }else if(arr[2] == piece && arr[8] == piece && arr[5] == ' '){
            return 5;
        }else if(arr[0] == piece && arr[4] == piece && arr[8] == ' '){
            return 8;
        }else if(arr[4] == piece && arr[8] == piece && arr[0] == ' '){
            return 0;
        }else if(arr[0] == piece && arr[8] == piece && arr[4] == ' '){
            return 4;
        }else if(arr[6] == piece && arr[4] == piece && arr[2] == ' '){
            return 2;
        }else if(arr[4] == piece && arr[2] == piece && arr[6] == ' '){
            return 6;
        }else if(arr[6] == piece && arr[2] == piece && arr[4] == ' '){
            return 4;
        }

        //Checking to see if the opponents next move could win the game (Looking for a block if needed)
        if(arr[0] == opponentPiece && arr[1] == opponentPiece && arr[2] == ' '){
            return 2;
        }else if(arr[1] == opponentPiece && arr[2] == opponentPiece && arr[0] == ' '){
            return 0;
        }else if(arr[0] == opponentPiece && arr[2] == opponentPiece && arr[1] == ' '){
            return 1;
        }else if(arr[3] == opponentPiece && arr[4] == opponentPiece && arr[5] == ' '){
            return 5;
        }else if(arr[4] == opponentPiece && arr[5] == opponentPiece && arr[3] == ' '){
            return 3;
        }else if(arr[3] == opponentPiece && arr[5] == opponentPiece && arr[4] == ' '){
            return 4;
        }else if(arr[6] == opponentPiece && arr[7] == opponentPiece && arr[8] == ' '){
            return 8;
        }else if(arr[7] == opponentPiece && arr[8] == opponentPiece && arr[6] == ' '){
            return 6;
        }else if(arr[6] == opponentPiece && arr[8] == opponentPiece && arr[7] == ' '){
            return 7;
        }else if(arr[0] == opponentPiece && arr[3] == opponentPiece && arr[6] == ' '){
            return 6;
        }else if(arr[3] == opponentPiece && arr[6] == opponentPiece && arr[0] == ' '){
            return 0;
        }else if(arr[0] == opponentPiece && arr[6] == opponentPiece && arr[3] == ' '){
            return 3;
        }else if(arr[1] == opponentPiece && arr[4] == opponentPiece && arr[7] == ' '){
            return 7;
        }else if(arr[4] == opponentPiece && arr[7] == opponentPiece && arr[1] == ' '){
            return 1;
        }else if(arr[1] == opponentPiece && arr[7] == opponentPiece && arr[4] == ' '){
            return 4;
        }else if(arr[2] == opponentPiece && arr[5] == opponentPiece && arr[8] == ' '){
            return 8;
        }else if(arr[8] == opponentPiece && arr[5] == opponentPiece && arr[2] == ' '){
            return 2;
        }else if(arr[2] == opponentPiece && arr[8] == opponentPiece && arr[5] == ' '){
            return 5;
        }else if(arr[0] == opponentPiece && arr[4] == opponentPiece && arr[8] == ' '){
            return 8;
        }else if(arr[4] == opponentPiece && arr[8] == opponentPiece && arr[0] == ' '){
            return 0;
        }else if(arr[0] == opponentPiece && arr[8] == opponentPiece && arr[4] == ' '){
            return 4;
        }else if(arr[6] == opponentPiece && arr[4] == opponentPiece && arr[2] == ' '){
            return 2;
        }else if(arr[4] == opponentPiece && arr[2] == opponentPiece && arr[6] == ' '){
            return 6;
        }else if(arr[6] == opponentPiece && arr[2] == opponentPiece && arr[4] == ' '){
            return 4;
        }
        return 9;
    }
}