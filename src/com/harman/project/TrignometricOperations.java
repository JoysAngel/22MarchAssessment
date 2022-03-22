package com.harman.project;
import java.util.Scanner;

    class SinFunction extends Thread{
        double x;
        public SinFunction(double x) {
            this.x = x;
        }

        @Override
        public void run() {
            System.out.println("Sin Function="+Math.sin(x));
        }
    }

    class CosFunction extends Thread{
        double x;
        public CosFunction(double x) {
            this.x = x;
        }

        @Override
        public void run() {
            System.out.println("Cos Function="+Math.cos(x));
        }
    }
    class TanFunction extends Thread{
        double x;
        public TanFunction(double x) {
            this.x = x;
        }

        @Override
        public void run() {
            System.out.println("Tan Function="+Math.tan(x));
        }
    }
    public class TrignometricOperations {
        public static void main(String[] args) {
            double theta;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the angle=");
            theta = scan.nextDouble();
            SinFunction sinObj = new SinFunction(Math.toDegrees(theta));
            CosFunction cosObj = new CosFunction(Math.toDegrees(theta));
            TanFunction tanObj = new TanFunction(Math.toDegrees(theta));
            sinObj.start();
            cosObj.start();
            tanObj.start();
        }
    }


