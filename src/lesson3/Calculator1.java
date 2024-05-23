package lesson3;

import java.util.Scanner;

public class Calculator1 {


    public static void main(String[] args) {
        boolean c= true;
        int a,b,d;
        a=b=d=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();}
        else {c = false;}


        System.out.print("Введите второе число: ");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
            }
            else {c = false;}

            if (c==true) {
                d = a + d;
                System.out.println(d);
            }
            else{
            System.out.println("Введено неверное число");
        }

       /* if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
           c=false;
        }
        if (c==false){
            System.out.println("Введено неверное число");
        }
        else {
            d = a+b;
        }

        */

    }
}

