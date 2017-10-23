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
public class Circulo {
    private double radio;
    private static final double pi=3.14;
    public Circulo(){
        radio=0;
    }
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public double calcularArea(){
        double area=pi*Math.pow(radio,radio);
        return area;
    }
    public double calcularLonxitude(){
        double lonxitude=radio*pi;
        return lonxitude;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
