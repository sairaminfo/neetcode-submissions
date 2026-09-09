class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        s=s.toLowerCase();

        while(start<end){
            
            while(start<end && !isAlphaNumeric(s.charAt(start))){
                start++;
            }
            while(start<end && !isAlphaNumeric(s.charAt(end))){
                end--;
            }
            if(start<end && (s.charAt(start)!=s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;

        
    }

    public boolean isAlphaNumeric(char c){
        if((c>='a'&& c<='z') || (c>='A'&& c<='Z') || (c>='0'&& c<='9')){
            return true;

        }
        return false;
    }
}
