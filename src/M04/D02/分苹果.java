package Y2018.M04.D02;


import java.util.Scanner;

/**
 * 果园里有堆苹果，N（1＜N＜9）只熊来分。第一只熊把这堆苹果平均分为N份，多了一个，它把多的一个扔了，拿走了一份。第二只熊把剩下的苹果又平均分成N份，
 * 又多了一个，它同样把多的一个扔了，拿走了一份，第三、第四直到第N只熊都是这么做的，问果园里原来最少有多少个苹果？
 * Sample  input:5
 * Sample output:3121
 */
public class 分苹果 {
    public static void main(String[] args) {
        int arr[] = new int[9];
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int init_per = 1;
        int per;
        while (true) {
            per = init_per;
            int i;
            for (i = 0; i < n-1; i++) {
                per = per * n + 1;
                if (per % (n - 1) == 0) {
                    per /= n - 1;
                } else {
                    init_per++;
                    break;
                }
            }
            if (i==n-1){
                break;
            }
        }
        System.out.println(per*n+1);
    }
}