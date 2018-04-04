package Y2018.M04.D04;

import java.util.Scanner;
/*
    欢迎大家参加奇虎360 2016校招在线招聘考试，首先预祝大家都有个好成绩!
    我相信参加本次在线招聘考试的有不少研究生同学。我们知道，就计算机相关专业来说，考研有4门科目，分别是政治（满分100分），
英语（满分100分），数学（满分150分）和专业课（满分150分）。
    某校计算机专业今年录取研究生的要求是：政治、英语每门课成绩不低于60分，数学和专业课不低于90分，总成绩不低于310分。并且规定：
在满足单科以及总成绩最低要求的基础上，350分以上（含350分）为公费（Gongfei），310分~349分为自费(Zifei)。
3
61 62 100 120
80 80 120 100
55 90 130 130

 */
public class 研究生考试 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n > 0) {
            int politics = in.nextInt(),
                    english = in.nextInt(),
                    math = in.nextInt(),
                    profession = in.nextInt();
            int sum = politics + english + math + profession;
            if (politics < 60 || english < 60 || math < 90 || profession < 90) {
                System.out.println("Fail");
            }else {
                if (sum < 310)
                    System.out.println("Fail");
                else if (sum < 350)
                    System.out.println("Zifei");
                else System.out.println("Gongfei");
            }
            n--;
        }
    }
}
