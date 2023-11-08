import java. util.*;
public class diagonalsum {
    public static void diagsum(int matrix[][]){
        int sum=0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         if(i+j==matrix.length-1){
        //             sum+= matrix[i][j];
        //         }
        //     } 
        // }
        // System.out.print("Sum of diagonals ="+(sum));
        // System.out.println();
        for(int i=0; i<matrix.length; i++){
            //pd
            sum += matrix[i][i];
            //sd
            if(i!= matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];
            }
System.out.print("Sum of diagonal="+sum);
        System.out.println();

    }
    
    public static void main(String args[])
{
    int matrix[][]={{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    { 9, 10, 11, 12},
                {13, 14, 15 , 16}};
                diagsum(matrix);
}
}
