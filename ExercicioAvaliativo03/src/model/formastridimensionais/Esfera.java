package model.formastridimensionais;

import model.formas.Circulo;
import service.FormasTridimensionais;

/**
 * Observe essa classe, veja que ela é uma esfera, que nada mais é do que um círculo tridimensional,
 * sabendo disso, poderíamos afirmar que para calcular o diametro não diferiria de sua classe mae,
 * afinal o diametro continua sendo duas vezes o raio, sendo assim, por que sobreescrever o código?
 * Porque esse é um exemplo de código ruim, e em códigos ruins isso acontece.
 */
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

    /**
     * Observe, o código desse método nada mais é doque o retorno do mesmo código que estava na classe mãe.
     * Ele recebe o "super" código e dps retorna outro perfeitamente igual, tipo, qual o sentido disso?
     * Nenhum, porém isso é um código ruim.
     *
     */
    @Override
    public double calcularDiametro() {
        double superCodigo = super.calcularDiametro();
        double d = 2 * this.raio;
        return this.diametro = d;
    }

    @Override
    public double calcularVolume() {
        double v = 1.3 * Math.PI * (this.raio * this.raio * this.raio);
        return this.volume = v;
    }

}
