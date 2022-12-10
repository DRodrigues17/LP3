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

    /**
     * Veja bem, esse método nada mais é do que a area, o diametro e a circunferencia calculados e retornados,
     * a pergunta é um método desse é realmente necessário? e com um nome desses ainda por cima?
     * E o retorno vai ser ainda mais bizarro, você observará na main.
     *
     * Esse método fere justamente oque o clean code prega, 2 regras, na verdade, pois seu nome não é claro e ele faz
     * mais de uma coisa, além disso, seu código está mal formatado
     */
    @Override
    public void fazACoisaTodaRetornandoUmaString() {
        calcularArea();
        calcularDiametro();
        calcularCircunferencia();
        System.out.println("area " + calcularArea() + " diametro " + calcularDiametro() + " circunferencia " + calcularCircunferencia());
    }

}
