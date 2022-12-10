package Pacote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Topico06Java8 {





    public static void main(String[] args) {

        ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
        FormaGeometrica quadrado = new FormaGeometrica("quadrado", 10, 10);
        FormaGeometrica triangulo = new FormaGeometrica("triangulo", 30, 15);
        FormaGeometrica retangulo = new FormaGeometrica("retangulo",10, 20);
        FormaGeometrica hexagono = new FormaGeometrica("hexagono", 20, 20);
        FormaGeometrica pentagono = new FormaGeometrica("pentagono", 20, 20);

        formas.add(quadrado);
        formas.add(triangulo);
        formas.add(retangulo);
        formas.add(hexagono);
        formas.add(pentagono);

        formas.forEach(forma-> System.out.println(forma.getAltura()));
        formas.forEach(System.out::println);

        double mediaAlturas = formas.stream().filter(forma -> forma.getLargura() >= 10)
                .mapToDouble(FormaGeometrica::getAltura)
                .average()
                .getAsDouble();
        System.out.println(mediaAlturas);

        List<FormaGeometrica> formasMaisAltas = formas.stream().filter(forma -> forma.getAltura() >= 20).toList();
        formasMaisAltas.forEach(System.out::println);


        Optional<FormaGeometrica> formasMaisLargas = formas.stream().filter(forma -> forma.getLargura() >= 15).findAny();
        System.out.println(formasMaisLargas);
    }


}
