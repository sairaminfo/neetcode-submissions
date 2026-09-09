class Solution {
    public int characterReplacement(String s, int k) {
        
       int freqArr[]=new int[26];
       int result=0;
       int left=0;
       int maxFreq=0;
       for(int right=0;right<s.length();right++){
            freqArr[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,freqArr[s.charAt(right)-'A']);
            if((right-left+1)-maxFreq>k){
                freqArr[s.charAt(left)-'A']--;
                left++;
            }
            result=Math.max(result,right-left+1);
       }
       return result;
    }
}
