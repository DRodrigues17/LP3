package model.formastridimensionais;

import model.formas.Circulo;
import service.FormasTridimensionais;

public class Esfera extends Circulo implements  FormasTridimensionais {

    public double volume;

    public Esfera(double raio) {
        super(raio);
    }

    @Override
    public double calcularArea() {
        double a = 4 * Math.PI * (this.raio * this.raio);
        return this.area = a;
    }

    @Override
    public double calcularVolume() {
        double v = 1.3 * Math.PI * (this.raio * this.raio * this.raio);
        return this.volume = v;
    }

}
