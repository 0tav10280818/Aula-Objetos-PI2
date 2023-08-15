/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aviaosenac;

/**
 *
 * @author otavio.aspereira
 */
public class Fabrica {

   
    public static void main(String[] args) {
    
    //Construir os aviões
    AviaoSenac meuAviao1 = new AviaoSenac();
        System.out.println("Cor " + meuAviao1.getCor());
        
        AviaoSenac outroAviao = new AviaoSenac();
        outroAviao.setCor("vermelho");
        
        System.out.println("Cor " + outroAviao.getCor());
        
        outroAviao.acelerar();
        outroAviao.acelerar();
        System.out.println("aviao - outrAviao - velocidade " + outroAviao.getVelocidade());
    
    
    
    
    
    
    }
    
}
