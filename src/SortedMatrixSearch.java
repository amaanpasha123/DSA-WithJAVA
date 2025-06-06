public class SortedMatrixSearch {
    public static void main(String args[]){
        int matrix[][] ={{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        int key = 33;
        SearchSorting(matrix, 33);
    }

    public static boolean SearchSorting(int matrix[][], int key){
        int raw =0, col = matrix[0].length;
        while (raw< matrix.length && col>0){
            if (matrix[raw][col]==key){
                System.out.println("raw " +raw+ " col "+col);
                return true;
            }
            else if(key<matrix[raw][col]){
                col--;
            }
            else {
                raw++;
            }
        }
        System.out.println("key is not found over here");
        return false;
    }


}
