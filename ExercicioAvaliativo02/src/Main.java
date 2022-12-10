import model.formas.Circulo;
import model.formas.Quadrado;
import model.formas.Retangulo;
import model.formas.TrianguloEquilatero;
import model.formastridimensionais.Cubo;
import model.formastridimensionais.Esfera;
import model.formastridimensionais.ParalelepipedoRetangular;

public class Main {

    public static void main(String[] args) {

        System.out.println("circulo");
        Circulo circulo = new Circulo(3);
        System.out.println( circulo.calcularDiametro());
        System.out.println( circulo.calcularCircunferencia());
        System.out.println( circulo.calcularArea());

        System.out.println("quadrado");
        Quadrado quadrado = new Quadrado(4, 4);
        System.out.println(quadrado.calcularArea());

        System.out.println("retangulo");
        Retangulo retangulo = new Retangulo(4,2);
        System.out.println(retangulo.calcularArea());

        System.out.println("triangulo equilatero");
        TrianguloEquilatero trianguloE = new TrianguloEquilatero(4, 4);
        System.out.println(trianguloE.calcularArea());

        System.out.println("cubo");
        Cubo cubo = new Cubo(4, 4);
        System.out.println(cubo.calcularArea());
        System.out.println(cubo.calcularVolume());

        System.out.println("esfera");
        Esfera esfera = new Esfera(4);
        System.out.println( esfera.calcularDiametro());
        System.out.println( esfera.calcularCircunferencia());
        System.out.println( esfera.calcularArea());
        System.out.println( esfera.calcularVolume());

        System.out.println("paralelepipedo retangular");
        ParalelepipedoRetangular retangular = new ParalelepipedoRetangular(3, 10, 7);
        System.out.println(retangular.calcularAreaLateral());
        System.out.println(retangular.calcularArea());
        System.out.println(retangular.calcularVolume());

    }
}
