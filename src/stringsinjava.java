public class stringsinjava {
    public static boolean isPalindrome(String str){
        int n = str.length();
        for (int i=0; i<n/2; i++){
            if (str.charAt(i)!=str.charAt(n-1-i)){
                //if words don't match......
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
     String str = "noon";
        System.out.println(isPalindrome(str));
    }
}
