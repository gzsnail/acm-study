import java.io.*;
import java.util.*;

public class p836 {
    public static void main(String args[])throws Exception{
        Scanner scin = new Scanner(System.in);
        int m = scin.nextInt(), t = 0;
        int x,y;
        do{
            x = scin.nextInt();
            do{
                for(y=0;y<x;y++){
                    System.out.print("*");
                }
                System.out.println("");
                x = x -1;
            }while(x>0);
            t = t + 1;
        }while(t<m);
    }
}
