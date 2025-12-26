// Program to find the next permutation
class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
		
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                pivot = i - 1;
                break;
            }
        }
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                 int temp = nums[i];
                 nums[i] = nums[pivot];
                 nums[pivot] = temp;
                 break;
            }
        }
        reverse(nums,pivot+1,n-1);
    }

    public static void reverse(int[] nums, int i, int j) {

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

    }
}