class Solution {
    public int scoreOfString(String s) {
        int count=0;
        char[]arr=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            count+=Math.abs(arr[i]-arr[i+1]);
        }
        return count;
    }
}
