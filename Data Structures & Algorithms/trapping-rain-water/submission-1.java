class Solution {
    public int trap(int[] height) {
        int n=height.length;

        int prefixMaxIndex[]=new int[n];
        int suffixMaxIndex[]=new int[n];
        int lastMaxIndex=0;
        int lastMaxIndexFromLast=n-1;
        suffixMaxIndex[n-1]=lastMaxIndexFromLast;

        for(int currentIndex=1;currentIndex<n;currentIndex++){
            if(height[currentIndex]>height[lastMaxIndex]){
                lastMaxIndex=currentIndex;
            }
            prefixMaxIndex[currentIndex]=lastMaxIndex;
            if(height[n-currentIndex-1]>height[lastMaxIndexFromLast]){
                lastMaxIndexFromLast=n-currentIndex-1;
            }
            suffixMaxIndex[n-currentIndex-1]=lastMaxIndexFromLast;

        }
       
        int totalWaterTrapped=0;
        for(int currentIndex=0;currentIndex<n;currentIndex++){
            totalWaterTrapped+=Math.min(height[prefixMaxIndex[currentIndex]],height[suffixMaxIndex[currentIndex]])-height[currentIndex];
        }
        return totalWaterTrapped;
        
    }
}
