package com.example.javacours;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class CourDatesEtDuree {
    /*
        DATES :
            -> LocalDate
            -> LocalTime
            -> LocalDateTime

        DURATION :
            -> duration
            -> period

        FUSEAUX :
            -> ZoneId
            -> ZoneDateTime
     */
    public static void main(String[] args) {
        // EPOCH = la première date de LocalDate
        LocalDate firstDate = LocalDate.EPOCH;
        System.out.println(firstDate);
        System.out.println("--------");

        // date du jour
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        System.out.println("--------");

        // set une date spécial
        LocalDate dateOfBirth = LocalDate.of(2000, 1, 13);
        System.out.println(dateOfBirth);

        // ajoute un jour
        dateOfBirth = dateOfBirth.plusDays(1);
        System.out.println("+1 jour :" + dateOfBirth);
        System.out.println("--------");

        // Recupérer l'année le mois le jour
        System.out.println("Année de naissance : " + dateOfBirth.getYear());
        System.out.println("Mois de naissance : " + dateOfBirth.getMonthValue());
        System.out.println("Jour du mois de naissance : " + dateOfBirth.getDayOfMonth());
        System.out.println("Jour de la semaine de naissance : " + dateOfBirth.getDayOfWeek());
        System.out.println("Jour de l'année de naissance : " + dateOfBirth.getDayOfYear());

        System.out.println("-----------------------------------");

        // LocaTime
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        System.out.println("--------");
        LocalTime timeOfBirth = LocalTime.of(16, 45, 13);
        System.out.println("Heures de naissance : " + timeOfBirth);

        System.out.println("-----------------------------------");

        // LocalDateTime
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);
        System.out.println("--------");

        // LocalDateTime dateTimeOfBirth = LocalDateTime.of(2000, 1, 13, 23, 59);
        LocalDateTime dateTimeOfBirth = LocalDateTime.of(dateOfBirth ,timeOfBirth);
        System.out.println("Naissance : " + dateTimeOfBirth);

        System.out.println("-----------------------------------");

        // ajouter une durée à une heure
        // ici on ajoute 3h30 à 16h45
        Duration duration = Duration.ofHours(3).plusMinutes(30);
        LocalTime someTime = LocalTime.of(16, 45, 13);

        System.out.println(someTime.plus(duration));
        System.out.println("--------");

        // Ajoute des année
        Period period = Period.ofYears(5);
        LocalDate today = LocalDate.now();

        System.out.println(today.plus(period));

        System.out.println("-----------------------------------");

        // Fuseaux
        // Set un fuseau
        ZoneId zone = ZoneId.of("Europe/Berlin");
        System.out.println(zone);

        // Afficher une date complète avec sa zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);
        System.out.println(zonedDateTime);

        System.out.println("-----------------------------------");

        // BONUS
        Month month = Month.JANUARY;
        System.out.println(month);
        System.out.println("--------");

        DayOfWeek dayOfWeek = DayOfWeek.of(1);
        System.out.println(dayOfWeek);
        System.out.println("--------");

        // Formater une date
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateOfBirth.format(dateFormatter);
        System.out.println(formattedDate);
        System.out.println("--------");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
        String formattedDateTime = dateTimeOfBirth.format(dateTimeFormatter);
        System.out.println(formattedDateTime);

    }
}
