class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i)-'a'+1);
        }
        String num=sb.toString();
        int ans=0;
        while(k-->0){
            int sum=0;
            for(char ch:num.toCharArray()){
                sum=sum+ch-'0';

            }
            num=String.valueOf(sum);

        }
        return Integer.parseInt(num);
        
    }
}