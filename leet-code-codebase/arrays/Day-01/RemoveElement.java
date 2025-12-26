// Leetcode problem 27
// Remove Element
class RemoveElement {
	// method to remove element
    public int removeElement(int[] nums, int val) {
		// check the value in array and remove it by skipping it 
       int index=0;
       for(int i=0;i<nums.length;i++){
          if(nums[i]!=val){
            nums[index++]=nums[i];
          }
       }
	   // return the index 
       return index;
    }
}