package model.formas;

import model.classesmae.Forma;
import service.FormasBidimensionais;

public class Retangulo extends Forma implements FormasBidimensionais {


    public Retangulo(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double calcularArea() {
        double a = this.altura * this.largura;
        return this.area = a;
    }

}
