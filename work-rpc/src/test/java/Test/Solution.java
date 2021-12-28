package Test;

import java.util.*;
public class Solution {
    static int res[][];
    static int n,m;

    public static void main(String[] args) {
        int res = main1();
        System.out.println(res);
    }
    public static void floyd() {
        for(int k=1; k <= n;k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (res[i][j] == 0 && res[i][k] == 1 && res[k][j] == 1) res[i][j] = 1;
                }
            }
        }
    }
    // 这个main方法名字换成解题界面里的那个名字
    public static int main1() {
        // write your code here
        Scanner in=new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        res = new int[n+1][n+1];

        for(int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            res[a][b]=1;
        }
        floyd();
        int count = 0;
        for(int i = 1;i <= n; i++) {
            int sum = 0;
            for(int j = 1;j <= n;j++) {
                if(res[i][j]==1 || res[j][i]==1) sum++;
            }
            if(sum == n-1) count++;
        }

        return count;

    }
}