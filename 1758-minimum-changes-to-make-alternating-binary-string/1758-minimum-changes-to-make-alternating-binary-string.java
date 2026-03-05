class Solution {
    public int minOperations(String s) {
        int diffCnt1=0,diffCnt2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)-'0'!=i%2)
            {
                diffCnt1++;
            }
            if('1'-s.charAt(i)!=i%2)
            {
                diffCnt2++;
            }
        }
        if(diffCnt1<diffCnt2)
        {
            return diffCnt1;
        }
        else{
            return diffCnt2;
        }
    }
}