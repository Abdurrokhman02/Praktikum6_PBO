/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bilangan;

/**
 *
 * @author iwana
 */
public class bilGanjilGenap {
    public void ganjilGenap() {
        System.out.println("B. Deret bilangan ganjil dan genap dari 0 - 20");
        int n = 1;
        while (n <= 20) {
            if (n % 2 == 0) {
                System.out.println("Bilangan genap: "+ n);
            } else {
                System.out.println("Bilangan ganjil: "+ n);
            }
            n++;
        }
        System.out.println("===================================================");
    }
}
