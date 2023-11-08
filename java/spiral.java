import java .util.*;
public class spiral {
    public static void spiralmatrix(int matrix[][]){
        int n=matrix.length;
        int m= matrix[0].length;
        int SR=0;
        int SC=0; 
        int ER= n-1;
        int EC= m-1;
        while(SR<=ER && SC<=EC){
            //TOP
            for(int j=SC; j<=EC; j++){
                System.out.print(matrix[SR][j]+ " ");
            }
            //RIGHT
            for(int i=SR+1; i<=ER; i++){
                System.out.print(matrix[i][EC] +" ");
            }
            //BOTTOM
            for(int j=EC-1; j>=SC; j-- ){
                if(SR==ER){
                    break;
                }
                System.out.print(matrix[ER][j] +" ");
            }
            //LEFT
            for(int i=ER-1; i>=SR+1; i--){
                if(SC==EC){
                    break;
                }
                System.out.print(matrix[i][SC] +" ");
            }
            SR++;
            ER--;
            SC++;
            EC--;

        }
        System.out.println();
    }



    public static void main(String args[]){
        int matrix[][]={{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10 ,11, 12},
                        {13, 14, 15, 16}};
    spiralmatrix(matrix);

        
    }
    
}
