import java.io.*;
import java.util.*;

public class p822 {
    public static void main(String args[])throws Exception{
        Scanner scin = new Scanner(System.in);
        int m = scin.nextInt(), t = 0, y = 0;
        do{
            for(y=0;y<m;y++){
                System.out.print("*");
            }
            System.out.println("");
            t = t + 1;
        }while(t<m);
    }
}
