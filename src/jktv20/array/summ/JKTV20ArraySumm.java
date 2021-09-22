/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20.array.summ;

import java.util.Random;

/**
 *
 * @author Владимир
 */
public class JKTV20ArraySumm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1;
        array1 = new int [20];
        Random random = new Random();
        int number = 0;
        double summ = 0;
        for(int i = 0; i < array1.length;){
            array1[i] = random.nextInt(10 - 1 + 1) + 1;
            double chet = 2;
            if (array1[i] % chet == 0){
                summ = summ + array1[i];
                i++;
            }
        }
        System.out.print("array 1 = ");
        System.out.print("[");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i]);
            System.out.print("; ");    
        }
        System.out.println("]");
        System.out.printf("сумма всех рандомных циифр в массиве array1 = %.3f%n", summ);
        double medium_summ = summ/array1.length;
        System.out.printf("среднее арефмитическое рандомных циифр в массиве array1 = %.3f%n", medium_summ);
    }
    
}
