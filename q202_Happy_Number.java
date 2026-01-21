class Solution {
    public boolean isHappy(int n) {
        int p,r;
        while(n!=1&&n!=4){
            p=0;
            while(n!=0){
            r=n%10;
            p=p+(int)Math.pow(r,2);
            n=n/10;
           
            }
            n=p;
            
        }
       return n==1;
      }
}
