package com.pands;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Вычислить значение переменной ans");
        System.out.println("ans=ab/cd-(ab-c)/cd");

        System.out.println("Ввведите a,b,c,d:");

        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double d=scanner.nextDouble();
        double ans;

        ans=(((a*b)/c*d))-((a*b-c)/c*d);

            System.out.println("ans="+ans);





    }
}
