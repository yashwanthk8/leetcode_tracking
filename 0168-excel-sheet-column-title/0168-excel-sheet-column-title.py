class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        res=""
        while(columnNumber>0):

            columnNumber-=1
            rem=columnNumber%26
            res=chr(rem+ord('A'))+res
            columnNumber=columnNumber//26
        
        return res    