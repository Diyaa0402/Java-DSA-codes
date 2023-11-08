import java.util.*;
public class Numof7 {
    public static void printtotal7(int matrix[][]){
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if( matrix[i][j]==7){
                    count++;
                }
            }
        }
            System.out.println("Number of 7's =" +count);
        }

    public static void main(String args[]){
        int matrix[][]={{4,7,8},
                        {8,8,7}};
                        printtotal7(matrix);
    }
}
