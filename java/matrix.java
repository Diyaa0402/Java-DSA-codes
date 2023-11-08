import java.util.*;
public class matrix {
    public static void largest(int matrixe[][]){
        int large= Integer.MIN_VALUE;
        for(int i=0; i<matrixe.length;i++){
            for(int j=0; j<matrixe[0].length; i++){
                large= Math.max(large, matrixe[i][j]);

            }
            System.out.print("Largest number=" +large);
}        }
    
    public static boolean search(int matrixe[][], int key){
        int n= matrixe.length;
        int m= matrixe[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrixe[i][j]==key){
                    System.out.println("key is at index=("+i+ "," +j+ ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrixe[][]= new int [3][3];
        Scanner sc= new Scanner(System.in); 
        int n= matrixe.length;
        int m= matrixe[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrixe[i][j]= sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrixe[i][j]+ " ");
            }
            System.out.println();

        }
        //search(matrixe, 9);
        largest(matrixe);
    }
    
}
