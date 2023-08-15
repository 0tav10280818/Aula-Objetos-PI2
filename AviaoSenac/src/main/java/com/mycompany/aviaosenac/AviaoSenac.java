/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aviaosenac;


public class AviaoSenac {
    
    //atributos
    static String marca = "A101";
    private String cor;
    int velocidade;
    double altitude;
    boolean ligado = false;
    
    //contrutores
    public AviaoSenac(){
        this.cor = "Branca";
        
    }
    
    //Ações = metodos
    public boolean ligar(){
        ligado = true;
        return ligado;
}
    
    public int acelerar(){
        this.velocidade += 50;
        return velocidade;
            
    }
        
    public int acelerar(int novaVelocidade){
        this.velocidade += novaVelocidade;
        return velocidade;
    } 
    //Métodos Acessores e odificadores
    public void setCor (String novaCor) {
        this.cor = novaCor.toUpperCase();
    }
    
    public String getCor(){
    return cor.toUpperCase() ;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
}
