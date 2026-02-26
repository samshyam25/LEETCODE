// Last updated: 2/26/2026, 9:53:20 AM
class Solution {
    public int largestMagicSquare(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int kmax=Math.min(n,m);
        int ans=1;
        for(int k=kmax;k>=2;k--){
            for(int i=0;i+k-1<n;i++){
                for(int j=0;j+k-1<m;j++){
                    if(checkmagic(i,j,i+k-1,j+k-1,grid,k)){
                        ans=Math.max(k,ans);
                    }
                }
            }
        }
        return ans;
    }
    public boolean checkmagic(int top,int left,int bottom,int right,int[][] grid,
    int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=grid[top][i+left];
        }
        //check for every row
        for(int i=top;i<=bottom;i++){
            int rsum=0;
            for(int j=left;j<=right;j++){
                rsum+=grid[i][j];
            }
            if(rsum!=sum) return false;
        }
        //check for every col
        for(int i=left;i<=right;i++){
            int csum=0;
            for(int j=top;j<=bottom;j++){
                csum+=grid[j][i];
            }
            if(csum!=sum) return false;
        }
        //check for left diagonal
        int dlsum=0;
        for(int i=0;i<k;i++){
            dlsum+=grid[i+top][i+left];
        }
        if(dlsum!=sum) return false;
        //check right diagonal 
        int drsum=0;
        for (int i = 0; i < k; i++) {
            drsum += grid[top + i][right - i];
        }
        if (drsum != sum) return false;
        return true;
    }
}