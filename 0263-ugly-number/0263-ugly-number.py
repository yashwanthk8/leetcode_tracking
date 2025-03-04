class Solution:
    def isUgly(self, n: int) -> bool:
        if n<=0:
            return False
        for facto in [2,3,5]:
            while(n%facto==0):
                n//=facto  
        return n==1