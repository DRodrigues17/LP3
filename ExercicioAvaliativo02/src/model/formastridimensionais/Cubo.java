package model.formastridimensionais;

import model.classesmae.FormaTridimensional;
import service.FormasBidimensionais;
import service.FormasTridimensionais;

public class Cubo extends FormaTridimensional implements FormasBidimensionais, FormasTridimensionais {

    public Cubo(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double calcularArea() {
        double a =  this.largura * this.largura * this.largura;
        return this.area = a;
    }

    @Override
    public double calcularVolume() {
        double v = this.altura * this.altura * this.altura;
        return this.volume = v;
    }

}
