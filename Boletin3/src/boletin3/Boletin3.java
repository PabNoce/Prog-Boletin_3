/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author pnocedalopez
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 3.1
        Coche boletin31 = new Coche();
        boletin31.acelerar(120);
        boletin31.frenar(25);
        System.out.println(boletin31.getVelocidade());
        //Ejercicio 3.2
        Satelite boletin32 = new Satelite(34, 11, 20000009);
        boletin32.verPosicion();
        //Ejercicio 3.3
        Circulo boletin33 = new Circulo(5);
        System.out.println("Lonxitude= " + boletin33.calcularLonxitude());
        System.out.println("Area= " + boletin33.calcularArea());

    }

}
