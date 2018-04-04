package Y2018.M04.D02;

import java.util.Scanner;

/**
 * 请设计一个程序计算出今天距离未来的某一天还剩多少天。
 * 假设今天是2015年10月18日。
 * Sample input：2015-10-19
 * Sample output:1
 */
public class 日期倒计时 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String date = s.nextLine();
        String[] dateSplited = date.split("-");
        int year = Integer.parseInt(dateSplited[0]);
        int month = Integer.parseInt(dateSplited[1]);
        int day = Integer.parseInt(dateSplited[2]);

        MyDate someday = new MyDate(year, month, day);
        System.out.println(someday.getDaysFromToday());

//        Date today = new Date(2015,10,18);
//        Date someday = new Date(
//                Integer.parseInt(dateSplited[0]),
//                Integer.parseInt(dateSplited[1]),
//                Integer.parseInt(dateSplited[2]));
//        System.out.println((someday.getTime()-today.getTime())/(86400000));
    }
}

class MyDate {
    //Today is 2015-10-18
    public static final int TODAY_FIRSTDAY = 291;   //20150101-20151018
    public static final int MONTH_DAYS[] = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDaysFromYear() {
        int days = 0;
        for (int i = 0; i < getMonth() - 1; i++) {
            days += MONTH_DAYS[i];
        }
        days += getDay();
        if (isLeapYear(getYear()) && getMonth() > 2) {
            days += 1;
        }
        return days;
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        return false;
    }

    public int getDaysFromToday() {
        int days = getDaysFromYear();
        for (int i = 2015; i < getYear(); i++) {
            if (isLeapYear(i)) {
                days += 366;
            } else days += 365;
        }
        days -= TODAY_FIRSTDAY;
        return days;
    }
    public void printDate(){
        System.out.println(getYear()+"-"+getMonth()+"-"+getDay());
    }
}