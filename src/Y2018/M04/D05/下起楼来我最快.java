package Y2018.M04.D05;

/*
题目描述

小赛是一名机智的程序员，他的机智主要表现在他下楼的速度特别快( > c < )。
小赛的家住在第n层，他可以选择从电梯下楼（假设只有小赛一个人会用电梯）或者走楼梯下楼。
当前电梯停在第m层，如果他从电梯下到第1层，需要：电梯先到达这一层->开门->关门->电梯再到达第一层->开门（最后的开门时间也要计算在内）。
现在告诉你——
小赛的家在楼层n，当前电梯停在的楼层m，
以及电梯每经过一层楼的时间t1，开门时间t2，关门时间t3，还有小赛每下一层楼的时间t4，
让你帮小赛计算一下，他最快到达第1层的时间。

输入
第一行两个整数n，m，其中n表示小赛家在的楼层，m表示当前电梯停在的楼层，
第二行四个整数，t1，t2，t3，t4，其中t1表示电梯每经过一层楼的时间，t2表示开门时间，t3表示关门时间，t4表示小赛每下一层楼的时间。
数据保证——
对于80%的测试点，1<=n,m<=10，1<=t1,t2,t3,t4<=100
对于100%的测试点，1<=n,m<=100000，1<=t1,t2,t3,t4<=100000

输出
输出一行，含有一个整数，表示小赛最快到达第1层的时间。

样例输入
5 10
1 5 5 4

样例输出
16
 */

import java.util.Scanner;

public class 下起楼来我最快 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt(),//Xiaosai's floor
                m = scanner.nextInt();//elevator's floor
        long t1 = scanner.nextInt(),//elevator time per floor
                t2 = scanner.nextInt(),//elevator time for open door
                t3 = scanner.nextInt(),//elevator time for close door
                t4 = scanner.nextInt();//xiaosai go down time per floor
        long totalTimeSai = (n - 1) * t4, totalTimeElevator = 0;
        if (m < n) {
            totalTimeElevator = (n - m + n - 1) * t1 + 2 * t2 + t3;
        } else totalTimeElevator = (m - 1) * t1 + 2 * t2 + t3;
        System.out.println(totalTimeSai < totalTimeElevator ? totalTimeSai : totalTimeElevator);
    }
}
