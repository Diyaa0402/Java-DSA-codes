import java.util.ArrayList;

public class MultiDimentionalarraylist {

    public static void main(String args[]){
        ArrayList< ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList <Integer> List = new ArrayList<>();
        List.add(1); List.add(2);  List.add(3); List.add(4); List.add(5);
        mainList.add(List);

            ArrayList <Integer> List2= new ArrayList<>();
            List2.add(2);
            List2.add(4);
            List2.add(6);
            List2.add(8);
            List2.add(10);
            mainList.add(List2);

            
            ArrayList <Integer> List3= new ArrayList<>();
            List3.add(3);
            List3.add(6);
            List3.add(9);
            List3.add(12);
            List3.add(15);
            mainList.add(List3);

            for(int i=0 ; i<mainList.size(); i++){
                    ArrayList <Integer> currlist= mainList.get(i);
                    for(int j=0 ; j<currlist.size() ; j++){
                        System.out.print(currlist.get(j)+ " ");
                    }
                    System.out.println();
                    

            }
            System.out.println(mainList);
    }
    
}
