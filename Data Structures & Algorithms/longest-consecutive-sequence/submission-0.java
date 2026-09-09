class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int longest=0;
        for(int num:nums){
            int inc=1;
            int currentLongest=1;
            if(set.contains(num)){
                while(set.contains(num-inc)){
                    set.remove(num-inc);
                    inc++;
                    currentLongest++;
                }
                inc=1;
                while(set.contains(num+inc)){
                    set.remove(num+inc);
                    inc++;
                    currentLongest++;

                }
            }
            if(currentLongest>longest){
                longest=currentLongest;
            }
            
        }
        return longest;

        
    }
}
