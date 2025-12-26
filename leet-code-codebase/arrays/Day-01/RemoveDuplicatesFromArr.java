class RemoveDuplicatesFromArr {
    public int removeDuplicates(int[] arr) {
        int i=1;
        int j=1;
        while(i<arr.length){
            if(arr[i]!=arr[i-1]){
              arr[j]=arr[i];
              j++;
            }
            i++;
        }
        return j;
    }
}