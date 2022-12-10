package Pacote;

import java.util.*;

public class Topico03List {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();


        list1.add("teste");
        list1.add("testar");
        list1.add("testando");
        list1.add("testaste?");


        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list1.contains("teste"));
        list1.remove(1);
        System.out.println(list1.indexOf("testaste?"));
        System.out.println(list1.stream().sorted().toList());
        list1.clear();
        System.out.println(list1.stream().toList());

    }
}
