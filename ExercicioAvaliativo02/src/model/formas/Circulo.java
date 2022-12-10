package model.formas;

import model.classesmae.FormaCircular;
import service.FormasCirculares;

public class Circulo extends FormaCircular implements FormasCirculares {

    public Circulo(double raio) {
        super(raio);
    }

    @Override
    public double calcularDiametro() {
         double d = 2 * this.raio;
        return this.diametro = d;
    }

    @Override
    public double calcularArea() {
        double a = Math.PI * (this.raio * this.raio);
        return this.area = a;
    }

    @Override
    public double calcularCircunferencia() {
        double c = 2* Math.PI * this.raio;
        return this.circunferencia = c;
    }

}
