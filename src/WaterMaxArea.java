public class WaterMaxArea {
    public int MaxArea(int [] height){
        int n = height.length;
        int r = n -1;
        int l = 0;
        int maxarea = 0;

        while (l<r){
            int h = Math.min(height[r], height[l]);
            int w = r-l;
            int currArea = h*w;
            maxarea = Math.max(currArea,maxarea);
            if (height[r]<height[l]){
                r--;
            }
            else {
                l++;
            }
        }
        return maxarea;
    }
    public static void main(String [] args){

    }
}
