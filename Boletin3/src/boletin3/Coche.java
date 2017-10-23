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
public class Coche {

    private int velocidade;

    public Coche() {
        velocidade = 0;
    }

    public void acelerar(int valor) {
this.velocidade=this.velocidade+valor;
    }

    public void frenar(int menos) {
this.velocidade=this.velocidade-menos;
    }

    public int getVelocidade() {
        return velocidade;
    }
    
}
