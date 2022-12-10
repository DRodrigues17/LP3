package Pacote;

public class Topico05Exception {

    String palavra;
    String nome;

    public Topico05Exception(String palavra, String nome) {
        this.palavra = palavra;
        this.nome = nome;
    }

    public void areAtributesEqual (){
        if (!palavra.equals(nome)){
            throw new RuntimeException("são diferentes");
        }
        System.out.println("são iguais");
    }

    public static void main(String[] args) {
        Topico05Exception e = new Topico05Exception("arroz", "Daniel");
        e.areAtributesEqual();
    }
}
