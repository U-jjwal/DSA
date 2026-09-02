class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] nums2 = new int[n];
        
        // Finding the index of any odd number in the array
        int oddIndex = -1;
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 != 0) {
                oddIndex = i;
                break;
            }
        }
        
        // If no odd number exists the array is already all even 
        if (oddIndex == -1) {
            return true; 
        }
        
        //Construct nums2 making everything ODD
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 != 0) {
                // If it is already odd keep it
                nums2[i] = nums1[i]; 
            } else {
                // If it is even subtract the odd element to force it to be odd
                nums2[i] = nums1[i] - nums1[oddIndex]; 
            }
        }
        
        // Since we successfully made everything odd, it's always possible
        return true; 
    }
}
