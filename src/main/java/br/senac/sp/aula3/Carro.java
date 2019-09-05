/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

/**
 *
 * @author fernando.fernandes
 */
public class Carro {
    
    private String fabricante;
    private String []rodas ;
    private String cor;
    private String modelo;
    private int velocidadeAtual;
    private int gasolina;
    

   

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
    
    public Carro() {
        
    }

    Carro(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String[] getRodas() {
        return rodas;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
  /*  public  String descreve (){
        String resposta= " ";
        if(this.modelo != null && this.cor != null){
            resposta= "Um kokokokoko"+this.modelo+" na cor "+this.cor;
        }
       if (this.modelo != this.modelo  ){
            resposta= "Um aushuahshasa"+this.modelo;
      }    
       else  
           resposta= "Um Carro rsrsrs";
        return resposta;
    }
    */
    public String descreve(){
        if (this.modelo==null)
            return "Um carro";
        if (this.cor==null)
            return "Um "+ this.modelo;
        
        return "Um "+this.modelo + " na cor "+this.cor;
        
        
    }

   public int abastece(int gasolina) {
        int gas=0;
       
       return gas;
    }
    
    

   
   
    
}


