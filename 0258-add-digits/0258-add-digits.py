class Solution:
    def addDigits(self, num: int) -> int:
      
        while(num>=10):
            sumy=0
            while(num>0):
                sumy+=num%10
                num=num//10
            num=sumy    
        return num
            

        