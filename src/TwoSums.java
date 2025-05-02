public class TwoSums {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            int l = 0;
            int r = n-1;
            while(l<r){
                int sum = nums[l] + nums[r];

                if(target == sum){
                    return new int [] {l,r};
                }
                else if(target<sum){
                    r--;
                }
                else{
                    l++;
                }

            }

            return new int [] {};
        }
    }
