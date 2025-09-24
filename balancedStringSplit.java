//1221
class Solution {
    public int balancedStringSplit(String s) {
        int bl=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                bl++;
            }
            else{
                bl--;
            }
            if(bl==0){
                count++;
            }
        }
        return count;
    }
}
