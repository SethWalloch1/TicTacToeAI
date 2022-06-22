public class AI{
    
    //My commented out code is my attempt at using a depth-limited search along with using 
    //a heurisitic value system. When I did this I just couldn't get it figured out. 
    //I kept getting stuck in infinite loops and when I didn't then the AI kept making the same moves.
    //My AI now is at least more interesting because it actually can make different moves.
    //Right now my AI will check if there is a block or win available and if there is then it
    //will move accordingly. If there isn't then it just randomly chooses. 
    public int getAIMove(char [] arr, char piece, char opponentPiece){
        int nodeCounter = 0;
        int min = 0;
        int max = 8;
        int aiMove = (int)Math.floor(Math.random()*(max-min+1)+min);

        //int heurisiticValue;
        aiMove = getDesiredMove(arr, piece, opponentPiece);
        if(aiMove == 9){
            aiMove = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        System.out.println("Nodes Expanded: " + nodeCounter);

        // if(desiredMove < 9){
        //     System.out.println("Nodes Expanded: " + nodeCounter);
        //     return desiredMove;
        // }

        // int bestMove = 0;
        // for(int i = 0; i < 9; i++){
        //     if(arr[i] == ' '){
        //         arr[i] = piece;
        //         nodeCounter = nodeCounter + 1;
        //         heurisiticValue = heuristic(arr);
        //         if(heurisiticValue > bestMove){
        //             bestMove = heurisiticValue;
        //             aiMove = i;
        //         }
        //         arr[i] = ' ';
        //     }
        // }

        // System.out.println("Nodes Expanded: " + nodeCounter);

        //Makes sure no moves can overtake an already played move
        while(arr[aiMove] != ' ' || arr[aiMove] == opponentPiece || arr[aiMove] == piece){
            aiMove = (int)Math.floor(Math.random()*(max-min+1)+min);
        }    
        return aiMove;
    }

    //Attempt at getting the heurisitic values of the possible moves
    //I want the computer to go for the win before going for the block
    //That is why I set the wins value higher than the blocks value
    // public int heuristic(char [] arr, char piece, char opponentPiece){
    //     int value = 0;
    //     for(int i = 0; i < 3; i++){
    //         if(arr[i] == piece && arr[i + 1] == ' '){
    //             value = 10;
    //         }else if(arr[i] == piece && arr[i + 1] == piece && arr[i + 2] == ' '){
    //             return value = 20;
    //         }else if(arr[i] == piece && arr[i * 2] == ' '){
    //             value = 10;
    //         }else if(arr[i] == piece && arr[i * 2] == piece && arr[i * 3] == ' '){
    //             return value = 20;
    //         }else if(arr[i] == piece && arr[i * 2 + 1] == piece && arr[i * 3 + 2] == ' '){
    //             return value = 20;
    //         }else if(arr[i * 3] == piece && arr[i * 2 + 1] == piece && arr[i + 2] == ' '){
    //             return value = 20;
    //         }else if(arr[i] == piece && arr[i * 2 + 1] == ' '){
    //             value = 10;
    //         }else if(arr[i * 3] == piece && arr[i * 2 + 1] == ' '){
    //             value = 10;
    //         }

    //         if(arr[i] == opponentPiece && arr[i + 1] == opponentPiece && arr[i + 2] == ' '){
    //             return value = 19;
    //         }else if(arr[i] == opponentPiece && arr[i * 2] == opponentPiece && arr[i * 3] == ' '){
    //             return value = 19;
    //         }else if(arr[i] == opponentPiece && arr[i * 2 + 1] == opponentPiece && arr[i * 3 + 2] == ' '){
    //             return value = 19;
    //         }else if(arr[i * 3] == opponentPiece && arr[i * 2 + 1] == opponentPiece && arr[i + 2] == ' '){
    //             return value = 19;
    //         }

    //     }
    //     return value;
    // }

    public int getDesiredMove(char [] arr, char piece, char opponentPiece){
        // //Going for the win
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

        //Blocking
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