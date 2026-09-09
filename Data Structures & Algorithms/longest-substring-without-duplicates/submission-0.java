class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int current=0;
        int start=0;
        int currentMaxWindow=0;
        while(current<s.length()){
            Character c=s.charAt(current);
            while(!set.isEmpty() && set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            currentMaxWindow=Math.max(currentMaxWindow,current-start+1);
            current++;

        }
        return currentMaxWindow;
        
    }
}
