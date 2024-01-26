/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author dell
 */
public class Triangulo extends Figura{
    private double base;
    private double altura;
    private int indice;
    private double area;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        double area = (this.base*this.altura);
        super.setArea(area);
        return area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIndice(int Indice) {
        this.indice = Indice;
    }
    
    public double getArea() {
        double area = calcularArea();
        return area;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public int getIndice() {
        return indice;
    }
    
    
}
