/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author dell
 */
public class Circulo extends Figura{
    private double radio;
    private int indice;
    //CONSTRUCTOR 
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        double area = (Math.PI*Math.pow(this.radio, 2));
        super.setArea(area);
        return area;
    }

    public double getRadio() {
        return radio;
    }
    public double getArea(){
        double area = calcularArea();
        return area;
    }
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    
    
}
