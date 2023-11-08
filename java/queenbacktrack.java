public class queenbacktrack {

    public static boolean issafe(char chessboard[][], int row , int col){
        //vertically up
        for(int i=row-1; i>=0; i--){
            if(chessboard[i][col]=='Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1,j=col+1; i>=0 && j<chessboard.length; i--,j++){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
return true;
    }

    public static void nqueens(char chessboard[][], int row){
        //base case
        if(row == chessboard.length){
            printchessboard(chessboard);
            count++;
            return;
        }
        //columns loops
        for(int j=0; j<chessboard.length; j++){
        if( issafe( chessboard, row , j)){
            chessboard[row][j]='Q';
            nqueens(chessboard, row+1); //function call
            chessboard[row][j]='x';    // bcktracking step
        }
    }
}
    
    public static void printchessboard( char chessboard[][]){ 
        System.out.println("------------chessboard-----------");
        for(int i=0; i<chessboard.length; i++){
            for(int j=0; j<chessboard.length; j++){
                System.out.print(chessboard[i][j]+ " ");
            }
        System.out.println();
    }
}
static int count =0;


    public static void main(String args[]){
        int n=5;
        char chessboard[][]= new char[n][n];
        // initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
            chessboard[i][j]='x';
        }

    }nqueens(chessboard , 0);
System.out.println(count);
    
}
}
