package com;
import java.io.*;
public class com {
    public static void main(String[]args)throws IOException{
        int iNum;
        double dNum;
        String str;
        BufferedReader buf;
        buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入一个在-2147483648~2147483647间的整数");
        str=buf.readLine();
        iNum=Integer.parseInt(str);
        System.out.println("您输入的整数是："+iNum);
        System.out.println("请输入一个双精度数：");
        str=buf.readLine();
        dNum=Double.parseDouble(str);
        System.out.println("您输入的双精度数是："+dNum);
    }
}
