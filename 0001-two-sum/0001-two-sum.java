class Solution {
    public int[] twoSum(int[] nums, int target) {
        int prac[]=new int[2];
        Map<Integer,Integer>pracMap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(pracMap.containsKey(target-nums[i]))
            {
                prac[1]=i;
                prac[0]=pracMap.get(target-nums[i]);
                return prac;
            }
            pracMap.put(prac[i],i);
        }
        return prac;
    }
}