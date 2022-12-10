package model.formastridimensionais;

import model.classesmae.FormaTridimensional;
import service.FormasBidimensionais;
import service.FormasTridimensionais;

public class ParalelepipedoRetangular extends FormaTridimensional implements FormasBidimensionais, FormasTridimensionais {

    private double comprimento;

    public ParalelepipedoRetangular(double altura, double largura, double comprimento) {
        super(altura, largura);
        this.comprimento = comprimento;
    }

    public double calcularAreaLateral(){
        double a = 2*((this.largura * this.comprimento) + (this.largura * this.altura));
        return 0;
    }

    @Override
    public double calcularArea() {
        double a = 2*((this.comprimento * this.altura) + (this.largura * this.altura) + (this.largura * this.comprimento));
        return this.area = a;
    }

    @Override
    public double calcularVolume() {
        double v = this.altura * this.largura * this.comprimento;
        return this.volume = v;
    }

}
