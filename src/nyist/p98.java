import java.io.*;
import java.util.*;

public class p98 {
    public static void main(String args[]) throws Exception{
        Scanner scin = new Scanner(System.in);
        int i = scin.nextInt(), j = 0, t=0;
        char[] result = {'E','E','E','E','E','E','D','C','B','A','A'};
        do{
            t = scin.nextInt();
            t = t / 10;
            System.out.println(result[t]);
            j = j+1;
        }while(j<i);
    }
}