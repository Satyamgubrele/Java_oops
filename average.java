package com.company;
import java.util.Scanner;
public class Average {
    public  static void main(String args[])
    {
        int num1,num2,num3,num4;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
    num4=(num1+num2+num3)/4;
    System.out.println(num4);

    }
}