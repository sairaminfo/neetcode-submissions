class Solution {
    public int maxArea(int[] heights) {
        int maxIndex=0;
        int maxContainer=Integer.MIN_VALUE;
        int start=0,end=heights.length-1;
        while(start<end){

            maxContainer=Math.max(maxContainer,((end-start))*Math.min(heights[start],heights[end]));
            if(heights[start]<=heights[end]){
                start++;
            }else{
                end--;
            }
           
        }
        return maxContainer;
    }
}
