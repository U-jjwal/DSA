class Solution {
    public static void backtrack(int[] nums, List<Integer> current, boolean[] used,List<List<Integer>> ans){
        if(current.size() == nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0;i < nums.length;i++){
            //check its used or not
            if(used[i]){
                continue;
            } 
            // add the no which is not used till now
            current.add(nums[i]);
            used[i] = true; // updated that it's used
            
            backtrack(nums, current, used, ans);
            //backtracking
            current.remove(current.size() - 1); // remove the no. already used
            used[i] = false; // remove the used sign which is already used
               
        }
         
       

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, current, used, ans);
        return ans;
    }
}