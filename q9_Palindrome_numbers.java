class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int r=0,rev=0;

        int t=x;
        while(x!=0){
            r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
       return t==rev;
    }
}
