class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int zeros=0;
        int n=nums.length;
        if(n==1){
            return nums;
        }
        int prefixProd[]=new int[n];
        prefixProd[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixProd[i]=prefixProd[i-1]*nums[i];
        }
        int suffixProd[]=new int[n];
        suffixProd[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixProd[i]=suffixProd[i+1]*nums[i];
        }
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                result[i]=suffixProd[i+1];
            }
            else if(i==n-1){    
                result[i]=prefixProd[i-1];
            }
            else{
                result[i]=suffixProd[i+1]*prefixProd[i-1];
            }
        }
        return result;
        
    }
}  
