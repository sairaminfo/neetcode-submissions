class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap=new PriorityQueue<>(
            (a,b) -> b.getValue()-a.getValue()
        );
        for(int i:nums){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        maxHeap.addAll(freqMap.entrySet());
        System.out.println(maxHeap);
        int result[]=new int[k];
        int index=0;
        while(!maxHeap.isEmpty() && index<k){
            Map.Entry<Integer,Integer> polledValue=maxHeap.poll();
            result[index]=polledValue.getKey();
            index++;

        }
        return result;

        
    }
}
