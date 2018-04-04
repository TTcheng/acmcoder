package D201803;

/**
 * acmcoder
 * AC 768ms
 */

import java.util.Arrays;
import java.util.Scanner;

public class 翻转数组 {
    public static void main(String[] args) {
        int n;
//        boolean enable = true;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        long arr[] = new long[n];
        long sortedArr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);
        int start = 0, end = n - 1;
        while (start + 1 <= n && arr[start] == sortedArr[start]) {
            start++;
        }
        while (end - 1 >= start && arr[end] == sortedArr[end]) {
            end--;
        }
        while (start < end && sortedArr[start] == arr[end]) {
            end--;
            start++;
        }
        if (end - start <= 0)
            System.out.println("yes");
        else System.out.println("no");
    }
}
