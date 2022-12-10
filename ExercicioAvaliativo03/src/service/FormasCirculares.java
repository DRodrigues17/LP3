package service;

public interface FormasCirculares {

    /**
     * Veja bem, nessa classe temos 4 métodos, aos quais um não é utilizado
     * e o outro é o perfeito exemplo do que não se deve fazer em um método,
     * pois esse faz mais de uma coisa e com um nome confuso ainda por cima,
     * o nome é "fazACoisaTodaRetornandoUmaString", mas oque é a coisa toda e por que uma string?
     *
     *  E quanto ao método não utilizado, não preciso nem falar que isso fere
     * um dos pilares da POO (Abstração), e ocupa um espaço desnecessário. Veja bem que ele só é utilizado pelo método
     * quese diz fazer tudo, do contrário estaria indicando desuso.
     *
     */

    public double calcularDiametro();
    public double calcularArea();
    public double calcularCircunferencia();

    public void fazACoisaTodaRetornandoUmaString();
}
