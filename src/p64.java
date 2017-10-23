import java.io.*;
import java.util.*;

public class p64 {
    public static void main(String args[]) throws Exception{
        Scanner scin = new Scanner(System.in);
        int i = scin.nextInt(), j = 0;
        int n,m,chickens,rabbits;
        do {
            n = scin.nextInt();
            m = scin.nextInt();
            rabbits = m / 2 - n;
            chickens = n - rabbits;
            if (rabbits < 0 || 2*chickens+4*rabbits!=m) {
                System.out.println("No answer");
            } else {
                System.out.println(chickens + " " + rabbits);
            }
            j = j +1;
        }while(j<i);
    }
}