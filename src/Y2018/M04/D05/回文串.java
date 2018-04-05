package Y2018.M04.D05;

import java.util.Scanner;

/*
题目描述
给定一个字符串，问是否能够通过添加一个字母将其变成“回文串”。 “回文串”是指正着和反着读都一样的字符串。
如：”aa”,”bob”,”testset”是回文串，”alice”,”time”都不是回文串。

输入
一行一个有小写字母构成的字符串，字符串长度不超过10。

输出
如果输入字符串可以通过添加一个字符，则输出”YES”，否则输出”NO”。

样例输入
coco

样例输出
YES
 */
public class 回文串 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chars ;//= new char[105];
        chars = in.nextLine().toCharArray();
        boolean res1,res2,res3;
//        res1 = isReverse(chars,0,chars.length-2);
//        res2 = isReverse(chars,1,chars.length-1);
        res3 = isReverse(chars,0,chars.length-1);
        if (res3){
            System.out.println("Yes");
        }else System.out.println("No");
        //要求输出YES实际上是Yes，坑啊
    }
    public static boolean isReverse(char[] chars,int start,int end){
        int diff=0;
        while (start<end){
            if (chars[start]!=chars[end]){
                diff++;
                if (chars[start+1]==chars[end]){
                    end++;
                }else if (chars[start]==chars[end-1]){
                    start--;
                }
            }
            start++;
            end--;
            if (diff>1) return false;
        }
        return true;
    }
}