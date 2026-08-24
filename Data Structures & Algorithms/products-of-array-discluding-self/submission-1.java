class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int n=nums.length;
        int index=0;
        int prefix=1;
        //left to right
        for(int i=0;i<n;i++)
        {
            output[i]=prefix;//there is nothing before index 0 so we assign 1 
            prefix *= nums[i];
            // result = nums[i]*nums[i+1];
            // for(int j=0;j<nums.length;j++)
            // {
            //     if(i==j)
            //     {
            //         continue;
            //     }
            //     result*=nums[j];
            // }
            // output[i]=result;
        }
        //right to left
        int suffix=1;
        for(int i=n-1;i>=0;i--)
        {
            index=i;
            output[i] *= suffix;
            suffix *= nums[i];
        }
        return output;
    }
}  
