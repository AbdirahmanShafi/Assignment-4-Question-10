/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author abdir
 */
public class Assignment4Q10 {
  public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        
        int sum =0;
        int number;
        
        do{
            System.out.println("Enter an integer or 0 to exit:");
            number=scanner.nextInt();
            
            sum +=number;
        }while(number != 0);
        System.out.println("sum of enetered integers:" + sum);
        
        scanner.close();
    }
}
