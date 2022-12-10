package model.formas;

import model.classesmae.Forma;
import service.FormasBidimensionais;

public class TrianguloEquilatero extends Forma implements FormasBidimensionais {


    public TrianguloEquilatero(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double calcularArea() {
        double a = (this.altura * this.largura)/2;
        return this.area = a;
    }
}
