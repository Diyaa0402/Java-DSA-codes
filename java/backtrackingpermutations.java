public class backtrackingpermutations {

    public static void findpermutations(String str , String ans){
        // base case 
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // recursion
        // time complexity -> O(n*n!)
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //abcde= ab + de......if we have to remove a character from a string
        String Newstr= str.substring(0, i)+ str.substring(i+1);
            findpermutations(Newstr , ans + curr);
        }
    }
    public static void main(String args[]){
        String str= "abc";
        findpermutations(str , "");
    }
    
}
