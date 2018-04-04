package Y2018.M04.D04;

import java.util.List;
import java.util.Scanner;

/*
你知道行编辑器吗？不知道也没关系，现在我会告诉你：
     1.如果你收到一个’#’，那么你应该删掉一个你已经收到的字符，不包括’#’;
     2.如果你收到一个’@’，那么你应该把你收到的一整行都删掉。
    (‘#’和‘@’都为不可见字符。)
    你明白了吗？现在轮到你去解决这个问题啦！
输入
    第一行是一个整数T，代表有T组数据。
    每组数据的开始时一个字符串，字符串长度小于100，每个字符一定是(‘a’~’z’,’A’~’Z’,’*’,’!’,’(‘,’)’,’+’,’@’,’#’)中的一个
    输出
    每组数据输出一行经过行编辑器编辑过的字符串，具体可以看样例

样例输入
3
whli##ilr#e(s#*s)
outcha@putchar(*s=#++)
returnWA##A!!##C
样例输出
    while(*s)
    putchar(*s++)
    returnAC
*/
public class 行编辑器 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while (n > 0) {
            String str = in.nextLine();
            char chars[] = str.toCharArray();
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == '#') {
                    for (int j = i-1; j >= 0; j--) {
                        if (chars[j]!='#'){
                            chars[j] = '#';
                            break;
                        }
                    }
                } else if (chars[i] == '@') {
                    for (int j = 0; j <= i; j++) {
                        chars[j] = '#';
                    }
                }
            }
            for (char c : chars) {
                if (c == '#') {
                    continue;
                }
                System.out.print(c);
            }
            System.out.println();
            n--;
        }
    }
}
