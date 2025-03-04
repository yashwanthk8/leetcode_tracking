class Solution:
    def getLucky(self, s: str, k: int) -> int:
        nustr=""
        for ch in s:
            nustr=nustr+str(ord(ch)-ord('a')+1)
        while(k>0):
            sumy=0
            for cha in nustr:
                sumy=sumy+int(cha)
            nustr=str(sumy)
            k=k-1
        return int(nustr)            
        