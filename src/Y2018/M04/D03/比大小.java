package Y2018.M04.D03;

import java.util.Scanner;

/**
 * 现在有"abcdefghijkl”12个字符，将其所有的排列中按字典序排列，给出任意一种排列，说出这个排列在所有的排列中是第几小的？
 * input:
 * 第一行有一个整数n（0＜n＜=10000）;
 * 随后有n行，每行是一个排列；
 * output:
 * 输出一个整数m，占一行，m表示排列是第几位；
 * Sample input :
 * 3
 * abcdefghijkl
 * hgebkflacdji
 * gfkedhjblcia
 * Smaple output:
 * 1
 * 302715242
 * 260726926
 */
public class 比大小 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        //idx[i] = (11-i)!
        int idx[] = {39916800, 3628800, 362880, 40320, 5040, 720, 120, 24, 6, 2, 1, 1};
        boolean isUsed[];
        while (n > 0) {
//            reset used flag
            isUsed = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};
            int ans = 1;
            String str = s.nextLine();
            for (int i = 0; i < 12; i++) {  //add up position by position
                char c = str.charAt(i);
                isUsed[c - 'a'] = true;
                //get the numbers of used chars before current char in lexicographical order
                int usages = 0;
                for (int j = 0; j < c - 'a'; j++) {
                    if (isUsed[j]) {
                        usages++;
                    }
                }
                ans += (c - 'a' - usages) * idx[i];
            }
            System.out.println(ans);
            n--;
        }
    }
}
/*
3
abcdefghijkl
hgebkflacdji
gfkedhjblcia

 */