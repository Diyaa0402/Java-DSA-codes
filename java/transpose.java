import java.util.*;
public class transpose {
    public static void tranposee(int matrix[][]){
        int transposee[][]= new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                transposee[i][j]=matrix[j][i];
            System.out.print(transposee[i][j] + " ");
        }
System.out.println();
    }


    }
    public static void printoriginalmatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
                            for(int j=0; j<matrix[0].length; j++){
                                System.out.print(matrix[i][j]+ " ");
                            }
                        System.out.println();

    }
}
    public static void main(String args[]){
        int matrix[][]= {{1,2,3},
                        {4,5,6}}; //2*3
                        printoriginalmatrix(matrix); //2*3
                    tranposee(matrix); //3*2
    }
    
}
