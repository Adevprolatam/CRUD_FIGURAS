/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author dell
 */
public class Cuadrado extends Figura {
    private double lado;
    private int indice;
    private double area;
    //CONSTRUCTOR
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        double area = this.lado*this.lado;
        super.setArea(area);
        return area;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public int getIndice() {
        return indice;
    }
    public double getArea() {
        double area = calcularArea();
        return area;
    }
    
    
    
  
}
