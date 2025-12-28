class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=nums[0]+nums[1]+nums[2];
         for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<Math.abs(close-target)){
                    close=sum;
                }
                if(sum<target){
                    j++;

                }
                else if(sum>target){
                    k--;
                }
                else{
                    return sum;
                }

            }

         }
         return close;
    }
}