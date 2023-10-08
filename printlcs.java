public class Solution {
    public static String findLCS(int n, int m, String s1, String s2){
        // Write your code here.
        String s="";
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int i=n;
        int j=m;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                s=s1.charAt(i-1)+s;
                i--;
                j--;
            }
            else{
                if(dp[i][j-1]>dp[i-1][j]){
                    s=b.charAt(j-1)+s;
                    j--;
                }
                else{
                    s=a.charAt(i-1)+s;
                    i--;
                }
            }
        }
        return s;

    }
}
