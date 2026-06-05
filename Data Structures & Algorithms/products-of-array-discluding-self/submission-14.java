class Solution {
    public int[] productExceptSelf(int[] nums) {
          int n=nums.length;
       int i;
        int [] pre= new int [n];
        int [] suf=new int [n];
        int prod=1;
        for(i=0;i<=n-1;i++){
            prod*=nums[i];
            pre[i]=prod;
        }
        prod=1; 
        for(i=n-1;i>=0;i--){
            prod*=nums[i];
            suf[i]=prod;
        }
        nums[0]=suf[1];
        nums[n-1]=pre[n-2]; 
        for(i=1;i<=n-2;i++){
            nums[i]=pre[i-1]*suf[i+1];
        }
        return nums;
    }
}  
