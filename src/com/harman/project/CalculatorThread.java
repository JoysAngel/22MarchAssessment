package com.harman.project;
import java.util.Scanner;

class AddOperation extends Thread{
    int x,y;

    public AddOperation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        try {
            System.out.println("Addition="+(x+y));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
class SubOperation extends Thread{
    int x,y;
    public SubOperation(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void run() {
        try{
            System.out.println("Subtraction="+(x-y));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MulOperation extends Thread{
    int x,y;
    public MulOperation(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void run() {
        try{
            System.out.println("Multiplication="+(x*y));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
class DivisionOperation extends Thread{
    float x,y;

    public DivisionOperation(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        try {
            if (y==0){
                System.out.println("Division="+(y/x));
            }
            else {
                System.out.println("Division="+(x/y));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class CalculatorThread{
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number-");
        a=scan.nextInt();
        System.out.println("Enter the second number-");
        b=scan.nextInt();
        AddOperation addObj = new AddOperation(a,b);
        SubOperation subObj = new SubOperation(a,b);
        MulOperation mulObj = new MulOperation(a,b);
        DivisionOperation divObj = new DivisionOperation(a,b);
        addObj.start();
        subObj.start();
        mulObj.start();
        divObj.start();
    }


}

