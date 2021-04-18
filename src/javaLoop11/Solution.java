package javaLoop11;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s1 =a;
            for (int j = 0; j < n; j++){
                s1 =s1+(int)Math.pow(2,j)*b;
                System.out.print(s1+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
