package Pacote;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;


public class Topico04Time {

    LocalDate date;

    public Topico04Time(LocalDate date) {
        this.date = date;
    }

    public boolean isAntes(LocalDate timeToCompare ) {
        return date.isBefore(timeToCompare);
    }

    public Long tempoParaMeiaNoite(){
        return Duration.between(LocalTime.MIDNIGHT, LocalTime.now()).toMinutes();
    }

    public LocalDate menosMeses(int monthsToSubtract){
        return  date.minusMonths(monthsToSubtract);
    }

    public boolean isBisexto(){
        return date.isLeapYear();
    }

    public int diasPorMes(){
        return LocalDate.now().lengthOfMonth();
    }


    public static void main(String[] args) {

        Topico04Time test = new Topico04Time(LocalDate.of(2022, 02, 17));
        LocalDate dateToCompare = LocalDate.of(2003,05,26);

        System.out.println(test.tempoParaMeiaNoite());
        System.out.println(test.isAntes(dateToCompare));
        System.out.println(test.menosMeses(18));
        System.out.println(test.isBisexto());
        System.out.println(test.diasPorMes());


    }
}
