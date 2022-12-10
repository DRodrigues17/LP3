import model.formas.Circulo;
import model.formas.Quadrado;
import model.formas.Retangulo;
import model.formas.TrianguloEquilatero;
import model.formastridimensionais.Cubo;
import model.formastridimensionais.Esfera;
import model.formastridimensionais.ParalelepipedoRetangular;

public class Main {

    public static void main(String[] args) {

        /**
         * agora, se você vier na main verá métodos limpos e suas versões frankstein,
         * execute a main e lhe garanto que sua reação será algo tipo "mas oq acabou de acontecer aqui?"
         *
         * e, aqui está um exemplo de código ruim, no exercicio anterior instanciei as classes e as testei,
         * oque ficou ruim, pois misturou tudo, essa versão abaixo deve ficar mais legível, compare com o código anterior comentado um pouco abaixo e me diga
         * oque acha.
         */
        Circulo circulo = new Circulo(3);
        Quadrado quadrado = new Quadrado(4, 4);
        Retangulo retangulo = new Retangulo(4,2);
        TrianguloEquilatero trianguloE = new TrianguloEquilatero(4, 4);
        Cubo cubo = new Cubo(4, 4);
        Esfera esfera = new Esfera(4);
        ParalelepipedoRetangular retangular = new ParalelepipedoRetangular(3, 10, 7);

        System.out.println("circulo");
        System.out.println( circulo.calcularDiametro());
        circulo.fazACoisaTodaRetornandoUmaString();

        System.out.println("quadrado");
        System.out.println(quadrado.calcularArea());

        System.out.println("retangulo");
        System.out.println(retangulo.calcularArea());

        System.out.println("triangulo equilatero");
        System.out.println(trianguloE.calcularArea());

        System.out.println("cubo");
        System.out.println(cubo.calcularVolume());

        System.out.println("esfera");
        System.out.println( esfera.calcularCircunferencia());

        System.out.println("paralelepipedo retangular");
        System.out.println(retangular.calcularAreaLateral());

        /**
         * Não sei se percebeu as mudanças que fiz, mas basicamente formatei o código para ter melhor leitura,
         * isso é outra coisa que o clean code fala também, junte coisas que se se relacionem ou tenham algo em comum
         * e separe as mesmas de coisas diferentes, nesse caso eu separei as instâncias de suas execuções.
         *
         * A versão anterior está abaixo, funcionava perfeitamente, porém com o tempo seria chato de refatorar, pois
         * estava tudo misturado.
         *
         * Aqui, ferimos a regra de formação do código, pois misturamos coisas que apesar de ter algo em comum,
         * são totalmente diferentes.
         *
         *         System.out.println("circulo");
         *         Circulo circulo = new Circulo(3);
         *         System.out.println( circulo.calcularDiametro());
         *         System.out.println( circulo.calcularCircunferencia());
         *         System.out.println( circulo.calcularArea());
         *
         *         System.out.println("quadrado");
         *         Quadrado quadrado = new Quadrado(4, 4);
         *         System.out.println(quadrado.calcularArea());
         *
         *         System.out.println("retangulo");
         *         Retangulo retangulo = new Retangulo(4,2);
         *         System.out.println(retangulo.calcularArea());
         *
         *         System.out.println("triangulo equilatero");
         *         TrianguloEquilatero trianguloE = new TrianguloEquilatero(4, 4);
         *         System.out.println(trianguloE.calcularArea());
         *
         *         System.out.println("cubo");
         *         Cubo cubo = new Cubo(4, 4);
         *         System.out.println(cubo.calcularArea());
         *         System.out.println(cubo.calcularVolume());
         *
         *         System.out.println("esfera");
         *         Esfera esfera = new Esfera(4);
         *         System.out.println( esfera.calcularDiametro());
         *         System.out.println( esfera.calcularCircunferencia());
         *         System.out.println( esfera.calcularArea());
         *         System.out.println( esfera.calcularVolume());
         *
         *         System.out.println("paralelepipedo retangular");
         *         ParalelepipedoRetangular retangular = new ParalelepipedoRetangular(3, 10, 7);
         *         System.out.println(retangular.calcularAreaLateral());
         *         System.out.println(retangular.calcularArea());
         *         System.out.println(retangular.calcularVolume());
         *
         *
         */
    }
}
