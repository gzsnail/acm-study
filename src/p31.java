import java.io.*;
import java.util.*;

public class p31{
    public static void main(String args[])throws Exception{
        Scanner scin = new Scanner(System.in);
        int i = scin.nextInt(),min=i,max=i;

        i = scin.nextInt();
        if(i<min)min=i;
        if(i>max)max=i;

        i = scin.nextInt();
        if(i<min)min=i;
        if(i>max)max=i;

        i = scin.nextInt();
        if(i<min)min=i;
        if(i>max)max=i;

        i = scin.nextInt();
        if(i<min)min=i;
        if(i>max)max=i;

        System.out.println(min + " " + max);
    }
}
