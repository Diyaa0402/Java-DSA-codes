import java.util.*;
public class shortestpath {
    public static float getshortestpath(String path){
        int x=0, y=0; 

        for(int i=0; i<path.length(); i++){
            char dir= path.charAt(i);

            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;  
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }
            }
            float X2= x*x;
            float Y2= y*y;
            return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path= "WNEENESENNN";
        System.out.println(getshortestpath(path));

    }
    
}
