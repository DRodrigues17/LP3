package Pacote;

public class FormaGeometrica {

    private String name;
    private double altura;
    private double largura;

    public FormaGeometrica(String name, double altura, double largura) {
        this.name = name;
        this.altura = altura;
        this.largura = largura;
    }

    public String getName() {
        return name;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public String toString() {
        return "FormaGeometrica{" +
                "name='" + name + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}
