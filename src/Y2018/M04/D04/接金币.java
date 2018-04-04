package Y2018.M04.D04;

import java.util.Scanner;

/*
小赛非常喜欢玩游戏，最近喜欢上了一个接金币的游戏。在游戏中，使用帽子左右移动接金币，金币接的越多越好，但是金币掉到地上就不能再接了。
为了方便问题的描述，我们把电脑屏幕分成11格，帽子每次能左右移动一格。现在给电脑屏幕如图标上坐标：
也就是说在游戏里，金币都掉落在0-10这11个位置。开始时帽子刚开始在5这个位置，因此在第一秒，帽子只能接到4,5,6这三个位置中其中一个位置上的金币。
问小赛在游戏中最多可能接到多少个金币？（假设帽子可以容纳无穷多个金币）。

输入
输入数据有多组。每组数据的第一行为以正整数n (0＜n＜100000)，表示有n个金币掉在屏幕上上。在结下来的n行中，
每行有两个整数x,T (0＜T＜100000),表示在第T秒有一个金币掉在x点上。同一秒钟在同一点上可能掉下多个金币。n=0时输入结束。输入数据以空格隔开

输出
每一组输入数据对应一行输出。输出一个整数m，表示帽子最多可能接到m个金币。

样例输入
7
6 3
8 2
9 3
7 1
6 2
5 1
7 2

样例输出
3

解题思路：典型的动态规划问题，参考https://blog.csdn.net/ttchengcheng/article/details/50374520
        核心算法
        from max_t to 1:
            from 1 to 10:
                dp[t][x]+=max(dp[t+1][x-1],dp[t+1][x],dp[t+1][x+1])
 */
public class 接金币 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //dp[i][j]  coming coins in j)th position i)th second
        int dp[][] = new int[n+5][11]; //n+5 in case index out of boundary
        //set all dp[i][j] = 0
        for (int i = 0; i < n+5; i++) {
            for (int j = 0; j < 11; j++) {
                dp[i][j] = 0;
            }
        }
        //records coins
        int x, t;
        int max_time = 0;
        for (int i = 1; i <= n; i++) {
            x = in.nextInt();
            t = in.nextInt();
            dp[t][x]++;     //multi coins in the same place and same time
            if (max_time < t) max_time = t;
        }
        //from the last seconds to first
        for (int i = max_time; i > 0; i--) {
            //position 0-10
            for (int j = 0; j < 11; j++) {
                if (j==0){
                    dp[i][j]+=Math.max(dp[i+1][j+1],dp[i+1][j]);
                }else if (j==10){
                    dp[i][j]+=Math.max(dp[i+1][j-1],dp[i+1][j]);
                }else {
                    dp[i][j]+=Math.max(Math.max(dp[i+1][j-1],dp[i+1][j]),dp[i+1][j+1]);
                }
            }
        }
        System.out.println(dp[1][5]);
    }
}
