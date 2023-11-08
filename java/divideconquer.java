public class divideconquer {


    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    public static void mergesort(int arr[], int si, int ei){

if(si>=ei){
    return ;
}
int mid = si +((ei-si)/2);
mergesort(arr , si, mid); // left side arr
mergesort(arr, mid+1, ei); // right side arr
mergearr(arr , si, mid, ei);
    }


    public static void mergearr(int arr[], int si, int mid, int ei){
int temparr[]= new int[ei-si+1];
int i = si; // iterator for left part
int j = mid +1; // iterator for right part
int k= 0; // iterator for temp arr

while(i<=mid && j<=ei){
if(arr[i]< arr[j]){  
    temparr[k]= arr[i];
    i++;
    
}else{
    temparr[k]=arr[j];
    j++;
}
k++;
}
    // left part
    while(i<= mid){
        temparr[k++]= arr[i++];
    }
    while(j<=ei){
        temparr[k++]=arr[j++];
    }
    // copy to original array
    for(k=0, i=si; k<temparr.length; k++ ,i++){
        arr[i]=temparr[k];

    }
}


    public static void main(String args[]){
        int arr[]={6, 3, 9, 5, 2, 8};
        mergesort(arr,0,arr.length-1);
        printarr(arr);

    }
    
}
