package Pacote;

import java.util.Locale;

public class Topico01String {

    String string;

    public Topico01String(String string) {
        this.string = string;
    }

    public int pegueNumeroCaracteres(){
        return string.length();
    }

    public char[] paraVetor(){
      return  string.toCharArray();
    }

    public boolean isIgual(String s){
        return string.equals(s);
    }

    public boolean isIgualIgnorandoFormato(String s){
        return string.equalsIgnoreCase(s);
    }

    public String maiusculo(){
        return string.toUpperCase(Locale.ROOT);
    }

    public String minusculo(){
        return string.toLowerCase(Locale.ROOT);
    }

    public boolean contemCaracter(String s){
        return  string.contains(s);
    }

    public boolean terminaCom(String s){
        return string.endsWith(s);
    }

    public boolean comecaCom(String s){
        return string.startsWith(s);
    }

    public int compareCom(String s){
        return string.compareTo(s);
    }

    public boolean isEmBranco(){
        return string.isBlank();
    }

    public boolean isVazio(){
        return string.isEmpty();
    }

    public void setString(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        Topico01String s = new Topico01String("PaLaVRa");
        System.out.println(s.pegueNumeroCaracteres());
        System.out.println(s.paraVetor());
        System.out.println(s.isIgual("PALAVRA"));
        System.out.println(s.isIgualIgnorandoFormato("PALAVRA"));
        System.out.println(s.maiusculo());
        System.out.println(s.minusculo());
        System.out.println(s.contemCaracter("V"));
        System.out.println(s.comecaCom("P"));
        System.out.println(s.terminaCom("a"));
        System.out.println(s.compareCom("word"));
        s.setString(" ");
        System.out.println(s.isEmBranco());
        System.out.println(s.isVazio());
    }
}
