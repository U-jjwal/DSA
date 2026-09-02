class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1 ;
        while(l < r){
           if(!Character.isLetterOrDigit(s.charAt(l))){ 
               l++;
               continue;
            }
           if(!Character.isLetterOrDigit(s.charAt(r))){
               r--;
               continue;
               
            } 
            char lC = Character.toLowerCase(s.charAt(l));
            char rC = Character.toLowerCase(s.charAt(r));
           
           if(lC != rC){
                return false;
            }
            l++;
            r--;
        }
    return true;
          
    } 

}
