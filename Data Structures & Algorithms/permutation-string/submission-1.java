class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }

        int need[]=new int[26];
        int window[]=new int[26];
        for(int i=0;i<s1.length();i++){
            need[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(need,window)){
            return true;
        }
        int n=s1.length();
        for(int i=n;i<s2.length();i++){
            window[s2.charAt(i)-'a']++;
            window[s2.charAt(i-n)-'a']--;
            if(Arrays.equals(need,window)){
                return true;
            }
        }
        return false;
        
    }
}
