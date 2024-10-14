/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bilangan;

/**
 *
 * @author iwana
 */
public class bilPrima {
    public void prima() {
        for (int n = 0; n <= 20; n++) {
            boolean isPrima = true;
            
            if (n <= 1) {
                isPrima = false;
            } else {
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        isPrima = false;
                        break;
                    }
                }
            }
            
            if (isPrima) {
                System.out.println(n + " adalah bilangan prima");
            } else {
                System.out.println(n + " adalah bukan bilangan prima");
            }
        }
        System.out.println("===============================================");
    }
}
