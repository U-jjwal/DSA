class Solution{

public int[] twoSum(int[] nums, int tar) {
    //TWO POINTER APPROCH
    int[] ans = new int[2];
    int l = 0;
    int r = nums.length - 1;
    while(l < r){
        int sum = nums[l] + nums[r];
        if(sum == tar) return new int[]{l + 1, r + 1};
        if(sum > tar) {
            r--;
            continue;
        }
        l++;
        
    }
    return new int[]{};
}
}
