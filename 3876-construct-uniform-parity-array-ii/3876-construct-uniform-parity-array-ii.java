class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        
        // Find the smallest odd number in the entire array
        for (int num : nums1) {
            if (num % 2 != 0) { // Check if odd
                minOdd = Math.min(minOdd, num);
            }
        }
        
        //If there is a mixed array check if any even number is smaller than minOdd
        for (int num : nums1) {
            if (num % 2 == 0 && minOdd != Integer.MAX_VALUE && num < minOdd) {
                // If an even number is smaller than the smallest odd subtraction goes negative!
                return false; 
            }
        }
        
        return true;
    }
}
