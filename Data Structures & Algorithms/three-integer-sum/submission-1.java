class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<ArrayList<Integer>> triplets=new HashSet<>();
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int twoSum=nums[i]+nums[j];
                freqMap.put(nums[i],freqMap.get(nums[i])-1);
                freqMap.put(nums[j],freqMap.get(nums[j])-1);
                int third=twoSum*(-1); 
                if(freqMap.get(third)!=null && freqMap.get(third)>0){
                    ArrayList<Integer> list=new ArrayList<>(Arrays.asList(nums[i],nums[j],third));
                    Collections.sort(list);
                    triplets.add(list);
                }
                freqMap.put(nums[i],freqMap.get(nums[i])+1);
                freqMap.put(nums[j],freqMap.get(nums[j])+1);

            }
        }
        List<List<Integer>> result=new ArrayList<>();
        result.addAll(triplets);
        return result;
        

        
    }
}
