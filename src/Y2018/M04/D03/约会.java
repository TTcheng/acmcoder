package Y2018.M04.D03;
/**
 * Yes 和 No 的首字母必须大写  真太tm坑了
 */

import java.util.Scanner;
import java.lang.Math;
public class 约会 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int s = in.nextInt();
            int leastSteps = Math.abs(a) + Math.abs(b);
            s = Math.abs(s);
            if (s >= leastSteps && (s - leastSteps) % 2 == 0) {
                System.out.println("Yes");
            } else System.out.println("No");
        }
    }
}
