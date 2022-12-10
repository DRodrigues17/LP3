package Pacote;

public class Topico02Lang {

    Integer i;
    Double d;
    Math m;

    public Topico02Lang(Integer i, Double d) {
        this.i = i;
        this.d = d;
    }

    public double potencia(double b, double e) {
        return m.pow(b,e);
    }

    public double aleatorio(){
        return  m.random();
    }

    public boolean isAlgoNaoNumerico(){
        return  d.isNaN();
    }

    public double soma(double a, double b){
        return d.sum(a, b);
    }

    public double tranformeDouble(){
        return i.doubleValue();
    }

    public static void main(String[] args) {

        Topico02Lang lang = new Topico02Lang(3,20.0);

        System.out.println(lang.potencia(15,20));
        System.out.println(lang.aleatorio());
        System.out.println(lang.isAlgoNaoNumerico());
        System.out.println(lang.soma(15, 20));
        System.out.println(lang.tranformeDouble());

    }
}
