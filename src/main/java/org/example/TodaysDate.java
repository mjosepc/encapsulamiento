package org.example;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {
    // Nombrar variables
    private String hora;
    private int day;
    private int month;
    private int year;

    // Métodos
    public void imprimirFechayHora() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.hora = calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.SECOND);
        this.day = calendar.get(Calendar.DATE);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);

        System.out.println("Hora: " + this.hora);
        System.out.println("Fecha: " + this.day+ " " + this.month + " " + this.year + " ");
    }
    public static void main(String[] args) {
        TodaysDate today = new TodaysDate();
        today.imprimirFechayHora();
    }
}



