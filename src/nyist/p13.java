import java.io.*;
import java.util.*;

public class p13 {
    public static void main(String args[]) throws Exception{
        Scanner scin = new Scanner(System.in);
        int i = scin.nextInt(), j = 0, t=0;
        do{
            t = scin.nextInt();
            System.out.println(Fibonacci(t));
            j = j+1;
        }while(j<i);
    }

    public static int Fibonacci(int nth){
        if (nth == 1) return 1;
        if (nth == 2) return 1;
        return Fibonacci(nth - 1) + Fibonacci(nth - 2);
    }
}