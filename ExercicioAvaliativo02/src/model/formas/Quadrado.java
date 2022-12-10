package model.formas;

import model.classesmae.Forma;
import service.FormasBidimensionais;

public class Quadrado extends Forma implements FormasBidimensionais {

    public Quadrado(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double calcularArea() {
        double a = this.altura * this.largura;
        return this.area = a;
    }

}
