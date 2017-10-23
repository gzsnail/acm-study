import java.io.*;
import java.util.*;

public class p75 {
    public static void main(String args[]) throws Exception{
        Scanner scin = new Scanner(System.in);
        int i = scin.nextInt(), j = 0;
        int year, month, day;
        int[] months={0,31,59,90,120,151,181,212,243,273,304,334};
        do{
            year = scin.nextInt();
            month = scin.nextInt();
            day = scin.nextInt();
            int days=leapyear(year);
            System.out.println(days);
            days = days + months[month-1] + day;
            System.out.println(days);
            j = j+1;
        }while(j<i);
    }

    public static int leapyear(int year){
        int x,y;
        x = year / 400;
        if (x*4==year) return 1;
        x = year / 100;
        y = year / 4;
        if (y*4==year && x*100!=year)return 1;
        return 0;
    }

}

