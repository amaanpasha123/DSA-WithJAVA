import javax.swing.*;
import java.util.Arrays;

public class sorting {

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; j++ ){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            int maxElement = 0;
            for (int j=0; j<=n-1-i; j++){
                if (arr[j]>arr[maxElement]){
                    maxElement = j;
                }
            }
            //swap maxelement with j;
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[maxElement];
            arr[maxElement] = temp;
        }
    }

    public static void countingSorting(int arr[]){
        //by this we getting both frequency as well as sorted array
        int n = arr.length;
        int maxvalue = arr[0];
        for (int i=0; i<n-1; i++){
            maxvalue = Math.max(maxvalue, arr[i]);
        }

        //Calculating the frequency....
        int freq [] = new int[maxvalue+1];
        for(int i =0; i<n; i++){
            int currVal = arr[i];
            freq[currVal]++;
        }

        //using the frequency array get sorted
        int index =0;
        for(int i = 0; i<freq.length; i++){
            for (int j =0; j<freq[i]; j++){
                arr[index++] = i;
            }
        }
    }
    public static void main(String [] args){
        int arr[] = {3,34,5,3,5,3,5,3,26,5,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
