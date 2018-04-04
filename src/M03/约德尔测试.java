package D201803;

import java.util.Scanner;

/**
 * acmcoder
 * test input:
 *
 * @!%12dgsa 010111100
 */
public class 约德尔测试 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        char[] binaris = scanner.nextLine().toCharArray();
        int equals = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z')
                    || (chars[i] >= 'A' && chars[i] <= 'Z')
                    || (chars[i] >= '0' && chars[i] <= '9')) {
                chars[i] = '1';
            } else chars[i] = '0';
            if (chars[i] == binaris[i]) {
                equals++;
            }
        }
        float res = 100 * ((float) equals / (float) chars.length);
        System.out.println(String.format("%.2f",res)+"%");
    }
}
/// Accepted in ansi C
//#include <stdio.h>
//        #include <stdlib.h>
//        #define MAX_LEN 1005
//        int main(void) {
//        char chars[MAX_LEN];
//        char binaries[MAX_LEN];
//        scanf("%s",chars);
//        scanf("%s",binaries);
//        int i,equals=0;
//        int length = strlen(chars);
//        for(i=0;i<length;i++){
//        if ((chars[i] >= 'a' && chars[i] <= 'z')|| (chars[i] >= 'A' && chars[i] <= 'Z')|| (chars[i] >= '0' && chars[i] <= '9')){
//        chars[i] = '1';
//        }else chars[i]='0';
//        if(chars[i]==binaries[i]){
//        equals++;
//        }
//        }
//        printf("%.2f%%",100*(float)equals/(float)length);
//        return EXIT_SUCCESS;
//        }
