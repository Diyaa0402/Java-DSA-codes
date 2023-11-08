import java.util.ArrayList;

public class Pairsumarraylist {
    //Brute code
    // public static boolean pairsum( ArrayList<Integer> List , int target){
    //     for(int i = 0; i<List.size(); i++){
    //         for(int j= i+1 ; j< List.size(); j++){
    //             if(List.get(i) + List.get(j) == target){
    //                 return true;
    //             }else{
                    
    //             }
    //         }
    //     }
    // return false;
    // }

    //2 pointer approach
    public static boolean pairsum (  ArrayList<Integer> List , int target){
int lp = 0;
int rp= List.size()-1;
// TC = O(n)
while(lp< rp){
if(List.get(lp) + List.get(rp) == target){
    return true;
}
else if(List.get(lp) + List.get(rp) <target){
    lp++;
}
else {
    rp--;
}
}
return false;
    }


public static boolean pairsum2 (  ArrayList<Integer> List , int target){
    int bp =-1;
    for(int i=0; i<List.size(); i++){
if(List.get(i) > List.get(i+1)){
    bp =i;
    break;
}
    }

int lp= bp+1;
int rp=bp;

while(lp!=rp){
    // Case 1
    if( List.get(lp) + List.get(rp) == target ){
        return true;

    }else if(List.get(lp) + List.get(rp) < target){
        lp = (lp+1)% List.size();
    }else{
        rp = (rp+ List.size()-1)% List.size();
    }
}
  return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        //SORTED LIST
        // List.add(1);
        // List.add(2);
        // List.add(3);
        // List.add(4);
        // List.add(5);
        // List.add(6);

        //SORTED AND ROTATED LIST
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);

        int target = 16;
       // System.out.println(pairsum(List, target));
    System.out.println(pairsum2(List, target));
        


        
    }
    
}
