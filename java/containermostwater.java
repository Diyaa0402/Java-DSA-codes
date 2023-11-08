import java.util.ArrayList;

public class containermostwater {
// public static int storewater(ArrayList<Integer> height){
// int maxwater = 0;   
// // brute force TC = O(n^2)
//         for(int i= 0; i<height.size(); i++){
//             for(int j=i+1; j<height.size(); j++){
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int wd = j-i;
//                 int waterarea= (ht*wd);
//                 maxwater = Math.max(maxwater, waterarea);
//             }
//         }
//         return maxwater;
//     }


//2 pointer approach
//TC = 0(n)
public static int storewater(  ArrayList<Integer> height){
    int maxwater =0;
    int Lp =0;
    int Rp = height.size() -1;

    while(Lp< Rp){
        // calculate water area
int ht = Math.min(height.get(Lp) , height.get(Rp));
int wd = Rp - Lp;
int waterarea = ht*wd;
maxwater = Math.max(maxwater, waterarea);

//update ptr
if(height.get(Lp) < height.get(Rp)){
    Lp++;
}else{
    Rp--;
}
    }
    return maxwater;
}
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

    System.out.println(storewater(height)); 

    }
}
