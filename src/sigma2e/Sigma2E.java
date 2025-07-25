/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigma2e;

import java.util.Scanner;

/**
 *
 * @author PC 11
 */
public class Sigma2E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name;
        int byear;
        
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your birthyear: ");
        byear = sc.nextInt();
        
        System.out.println("Hello " + name + "!, Your age is " +(2025-byear));
    }
    
}
