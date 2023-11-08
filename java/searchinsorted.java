import java.util.*;
public class searchinsorted {
    public static boolean staircaseSearch(int matrix[][], int key){
        int row=0 , col= matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("key found at ( " +row+ "," +col +")");
                return true;
            }
            else if(key< matrix[row][col]){
                col--;
            }
            else if( key > matrix[row][col]){;
            row++;
        }
    }
    System.out.println("key not found");
    return false;
        }


        public static boolean staircaseSearch1(int matrix[][], int key){
            int row= matrix.length-1, col=0;

            while(row>=0 && col< matrix[0].length){
                if(matrix[row][col]==key){
                    System.out.print("key found at (" +row+ "," +col+ ")");
                    return true;
                }
                else if(key > matrix[row][col]){
                    col++;
                }
                else if( key < matrix[row][col]){
                    row--;
                }
            }
            System.out.println("key does not found");
            return false;
        }



    public static void main(String args[]){
        int matrix[][]={{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10 ,11, 12},
                        {13, 14, 15, 16}};
                        int key=2;
                       // staircaseSearch(matrix, key);
                    staircaseSearch1(matrix, key);
    }
}

