package D201803;

import java.util.Scanner;

public class 股神 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int value = 1;
            int addDays = 1;
            for (int i = 2; i <= n; i++) {
                for (int j = 0; j < addDays; j++) { //increase
                    ++value;
                    if (++i > n)
                        break;
                }
                if (i > n)
                    break;
                --value;                            //decrease
                addDays++;                          //increasing value +1
            }
            System.out.println(value);
            System.out.println();
        }
    }
}

/**
 * TimeLimitExceeded
 */
/*
public class 股神 {
    public static final int MAX_LEN = 100000005;

    public static void main(String[] args) {
        int values[] = new int[MAX_LEN];
        values[1] = values[0] = 1;
        int valueYesterday = 1, addDays = 1;
        for (int i = 2; i < MAX_LEN; i++) {
            for (int j = 0; j < addDays; j++) { //increase
                values[i] = ++valueYesterday;
                if (++i >= MAX_LEN)
                    break;
            }
            if (i >= MAX_LEN)
                break;
            values[i] = --valueYesterday;        //decrease
            addDays++;                          //increasing value +1
        }
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNextInt()){
            System.out.println(values[scanner.nextInt()]);
        }
    }
}
 */