import java.util.Arrays;

public class Target {
    public static int Binarysearch(int arr [], int target){
        int L = 0;
        int R = arr.length-1;
        while (L<=R){
            int mid = (L+R)/2;
            if (arr[mid]>target){
                R = mid-1;
            } else if (arr[mid]<target) {
                L = mid + 1;
            } else if (arr[mid]==target) {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int arr [] = {1,23,4,5,3,66,45};
        Arrays.sort(arr);
        int index = Binarysearch(arr, 45);
        if (index != -1){
            System.out.println("Here are your value at index "+index);
        }
        else {
            System.out.println("It doesn't exists");
        }
    }
}
