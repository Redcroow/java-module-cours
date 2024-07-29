package com.example.javaexo.exo3;

import java.util.Calendar;

public class Main {

    public static String getTodayDate() {
        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        int month = date.get(Calendar.MONTH);
        int day = date.get(Calendar.DAY_OF_MONTH);
        String today = year + "-" + month + "-" + day;
        return String.valueOf(today);
    }

    public static boolean isAvailableChainnelId(String id) {
        // verifier que l'id n'est pas déja utiliser
        return true;
    }

    public static void main(String[] args) {
        try{
            YoutubeChannel formationVideo = new YoutubeChannel("FormationVideo", "formation-video", getTodayDate(), 215000, 21046204, 618);
            YoutubeChannel KEJJ = new YoutubeChannel("KEJJ", "kejj-crew", getTodayDate());
            YoutubeChannel formationVideo2 = new YoutubeChannel("FormationVideo2", "formation-video", "2015-06-3", -215000, 21046204, 618);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
