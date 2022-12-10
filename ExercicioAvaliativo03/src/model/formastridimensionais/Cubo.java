package model.formastridimensionais;

import model.classesmae.FormaTridimensional;
import service.FormasBidimensionais;
import service.FormasTridimensionais;

public class Cubo extends FormaTridimensional implements FormasBidimensionais, FormasTridimensionais {

    /**
     * Ok, você lembra que eu falei de não ter comentários? Vamos por um ótimo exemplo de pôr que não fazer isso.
     * Observe o quão redundantes os comentários e perceba que em alguns casos ele pode ser interpretado até de maneira errada,
     * podendo gerar problemas no futuro.
     *
     */

    //constrói o objeto
    public Cubo(double altura, double largura) {
        //recebe os dados da classe mãe
        super(altura, largura);
    }

    //sobreescreve o método da interface, adaptando para sua respectiva forma geométrica
    @Override
    public double calcularArea() {
        //calcula o valor e guarda numa variável
        double a =  this.largura * this.largura * this.largura;
        //retorna a variavel area recebendo o valor do calculo
        return this.area = a;
    }

    //também obreescreve o método da interface
    @Override
    public double calcularVolume() {
        //calcula o valor no nome
        double v = this.altura * this.altura * this.altura;
        //retorna o volume sendo alterado para o valor calculado
        return this.volume = v;
    }

    /**
     * Observe o quão polido e quantos bytes a mais a classe passa a ocupar só por esses comentários de carater duvidoso,
     * o ruim é que isso ainda acontece em ambiente profissional, abra alguma classe de um dos projetos antigos da sua
     * empresa e provavelmente irá se deparar com algo assim.
     */
}
