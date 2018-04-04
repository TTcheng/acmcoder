package Y2018.M04.D03;

import java.util.Scanner;

/**
 * 有一楼梯共m级，刚开始时你在第一级，若每次只能跨上一级或二级，要走上第m级，共有多少走法？
 * 注：规定从一级到一级有0种走法。
 * 典型的递推问题  上n阶的方法 = 上n-1的基础上跨1级 + 上n-2的基础上跨2级
 * 递推模型为f(n) = f(n-1) +f(n-2)  n>3
 */
public class 上台阶 {
    public static void main(String[] args) {
        //get all results ready
        int[] res = new int[41];
        res[1] = res[0] = 0;
        res[2] = 1;
        res[3] = 2;
        for (int i = 4; i <=40; i++) {
            res[i] = res[i-1]+res[i-2];
        }
        //get input and output
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (;n>0;n--){
            int m = in.nextInt();
            System.out.println(res[m]);
        }
    }
}
