import java.util.Stack;
public class stackques1 {
    public static void StockSpanProb(int Stock[] , int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<Stock.length; i++){
            int currPrice = Stock[i];

            while(!s.empty() && currPrice > Stock[s.peek()]){
                s.pop();
            }

            if(s.empty()){
                span[i]= i+1;
            }else{
                int prevHigh = s.peek();
                span[i]= i- prevHigh;
            }

            s.push(i);
        }
        
    }

    public static void nextGreater(int arr[], int nextGreat[]){
        Stack<Integer> ng = new Stack<>();
int n=arr.length;
//next Greater right
        for(int i=n-1; i>=0; i--){
            while(!ng.empty() && arr[ng.peek()]<=arr[i]){
                ng.pop();
            }
            if(ng.empty()){
                nextGreat[i]= -1;
            }else{
                nextGreat[i] = arr[ng.peek()];
            }

            ng.push(i);
        }

        //next greater left -> line 30 reverse i.e from 0 to n-1
        //next smaller right -> line 31 condn change arr[ng.peek()]>=arr[i]
        //next smaller left-> line 30 and line 31 both will change as per above statements
}

    public static void main(String[] args) {
        // int Stock []= {100 , 80, 60, 70, 60, 85, 100};
        // int span[] = new int[Stock.length];
        // //StockSpanProb(Stock, span);

        // for(int i=0; i<span.length; i++){
        //     System.out.println(span[i]+ " ");
        // }

        int arr[] ={7, 9, 10, 1, 2, 8};
        int nextGreat[]= new int[arr.length];

        nextGreater(arr, nextGreat);
        for(int i=0; i<nextGreat.length; i++){
    System.out.println(nextGreat[i]+ " ");
    }
}
}
