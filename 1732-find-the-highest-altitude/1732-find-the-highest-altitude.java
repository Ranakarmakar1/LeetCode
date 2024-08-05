class Solution {
    public int largestAltitude(int[] gain) {
        
        int n=gain.length;
        int ans[] = new int [n+1];
        
        ans[0]=0;
        
        for(int i=1;i<n+1;i++){
            ans[i]= ans[i-1]+gain[i-1];
        }
        
        int max=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        
        return max;
    }
}