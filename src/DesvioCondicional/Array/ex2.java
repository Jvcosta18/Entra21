package Array;

import java.util.Scanner;

public class ex2 {

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[5];
        for (int i = 0; i <numeros.length; i++) {
            System.out.println(" Digitite o " + (i + 1) +  " numero ");
            numeros[i] = sc.nextDouble();
        }
            for (int i = 0; i <numeros.length; i++){
                System.out.println(numeros[i] * 2);
            }
        }
    }

