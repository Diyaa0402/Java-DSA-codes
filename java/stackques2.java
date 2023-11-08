import java.util.*;
public class stackques2 {

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            //opening bracket
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                //closing

            if(s.empty()){
                return false;
            }

            if((s.peek() == '(' && ch==')') ||(s.peek() == '{' && ch=='}') ||( s.peek() == '[' && ch==']')) {
                s.pop();
            }else{
                return false;
            }
        }

    }
    if(s.empty()){
        return true;
    }else{
        return false;
    }
        }

        public static boolean isDuplicate(String s){
            Stack<Character> d = new Stack<>();
            for(int i=0; i<s.length(); i++){
                char ch= s.charAt(i);

                //closing
                if(ch==')'){
                    int count= 0;
                    while( d.peek() !='('){
                        d.pop();
                        count++;
                }
                if(count< 1){
                    return true; // duplicate
                }else{
                    d.pop(); //opening pair
                }
            }else{
                //opening
                d.push(ch);

                }
            }
            return false;
        }

        // TC= O(n) IMPORTANT
        public static void maxAreaHistogram(int height[]){
        int maxArea =0;
        int NextSmallerL[]= new int[height.length];
        int NextSmallerR[]= new int[height.length];

        Stack<Integer> s = new Stack<>();

        //NextSmallerRight
    for(int i=height.length-1; i>=0; i--){
                while(!s.empty() && height[s.peek()] >= height[i]){
                    s.pop();
                }
                if(s.empty()){
                    NextSmallerR[i]= height.length;
                }else{
                    NextSmallerR[i]= s.peek();
                }
            s.push(i);
    }


        //NextSmallerLeft
        s = new Stack<>();
for(int i=0; i<height.length; i++){
                while(!s.empty() && height[s.peek()] >= height[i]){
                    s.pop();
                }
                if(s.empty()){
                    NextSmallerL[i]= -1;
                }else{
                    NextSmallerL[i]= s.peek();
                }
            s.push(i);
            }
        



        //Current area = height * width    [width = j-i-1 -> nsr[i] - nsl[j]- 1]

        for(int i= 0; i<height.length; i++){
            int H = height[i];
            int W = NextSmallerR[i] - NextSmallerL[i] - 1;
            int currArea = (H*W);

            maxArea = Math.max(currArea , maxArea);
        }

        System.out.println("Max area in histogram =" +maxArea);



        }
public static void main(String args[]) {

    int height []={2, 1, 5, 6, 2, 3};
    maxAreaHistogram(height);


    // String str = "({})[]"; // true
   // System.out.println(isValid(str));

    // String s= "((a+b))";
    // String s1 = "(a-b)";
    // System.out.println(isDuplicate(s));
    // System.out.println(isDuplicate(s1));

}
    
}
