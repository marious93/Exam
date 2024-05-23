package lesson3;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        int s1, s2, s3,s4;
        //s1=s2=s3=s4=0;
        System.out.print("Введите первое число : ");
        s1 = addData();
        System.out.print("Введите второе число : ");
        s2 = addData();

        s3 = summary(s1,s2);
        s4 = minus(s1,s2);
        System.out.println("Сумма равна : "+ s3);
        System.out.println("Разница равна : "+ s4);
    }


    public static int summary(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int addData(){
       Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
}
