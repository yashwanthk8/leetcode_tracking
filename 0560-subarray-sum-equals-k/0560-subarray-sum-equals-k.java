class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length,sum=0;
        int count=0;
        HashMap<Integer,Integer>hmap=new HashMap<>();
        hmap.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            if(hmap.containsKey(sum-k))
            {
                count+=hmap.get(sum-k);
            }
           hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}