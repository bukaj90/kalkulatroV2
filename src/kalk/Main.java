package kalk;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("||||||||||| CALCULATOR v.2   ||||||||||||");

        Scanner ze = new Scanner(System.in);

        System.out.print("Enter a: ");
        int x = ze.nextInt();
        System.out.print("Enter b: ");
        int y = ze.nextInt();


        System.out.print("Enter the operation (+,-,*,/) : ");
        String op = ze.next();

        int f = 0;

        Calculator obj = new Calculator(x, y);
        switch (op) {
            case "+":
                f = obj.add();
                break;
            case "-":
                f = obj.sub();
                break;
            case "*":
                f = obj.mul();
                break;
            case "/":
                f = obj.div();
                break;
            default:
                System.out.println("Invalid operation code!!!!");
        }

        System.out.println(x + op + y + " = " + f);
    }
}


class Calculator
{
    int a, b;

    Calculator(int a, int b)
    {
            this.a = a;
            this.b = b;
    }

    int add() { return a + b; }
    int sub() { return a - b; }
    int mul() { return  a * b; }
    int div()
    {
        if (b!=0)
            return a / b;
        else {return 0;}
    }

}
