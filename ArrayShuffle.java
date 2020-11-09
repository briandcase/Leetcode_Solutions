class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j;
      
        int[] results = new int[nums.length];
      
        while ( i < n ) {
          j = 2 * i + 1;
          
          results[2 * i] = nums[i];
          results[j] = nums[i + n];
          
          i++;
        }
      
        return results;
        
    }
}