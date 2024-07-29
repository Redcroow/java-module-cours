package com.example.javaexo.exo3;

public class YoutubeChannel {
    private String name;
    private String id;
    private int subscriber;
    private int views;
    private int publishedVideosCount;
    private String creationDate;

    public YoutubeChannel(String name, String id, String creationDate) {
        this.name = name;
        setId(id);
        subscriber = 0;
        views = 0;
        publishedVideosCount = 0;
        this.creationDate = creationDate;

        System.out.println("La chaine : "+this.name
                + " sous l'id : "+ id
                + " à bien été crée le : "+ this.creationDate);
    }

    public YoutubeChannel(String name, String id, String creationDate, int subscriber, int views, int publishedVideosCount) {
        this.name = name;
        setId(id);
        setSubscriber(subscriber);
        this.views = views;
        this.publishedVideosCount = publishedVideosCount;
        this.creationDate = creationDate;

        System.out.println("La chaine : " + this.name
                + " sous l'id : " + id
                + " à bien été crée le : "+ this.creationDate
                + "."
                + " Elle comptabilise : " + this.subscriber
                + " abonnée, "+ this.views
                + " vues, et elle à publiée : " + this.publishedVideosCount
                + " vidéos depuis sa création.");
    }
    private void setId(String id) {
        if(Main.isAvailableChainnelId(id)){
            this.id = id;
        }else {
            System.out.println("La chaine : "+id+ " est déja prise");
        }
    }

    public void setSubscriber(int subscriber) {
        if(subscriber > 0){
            this.subscriber = subscriber;
        }else {
            System.out.println("Le nombre d'abonnée ne peux pas etre négatif :"+ subscriber);
            this.subscriber = 0;
        }
    }
}
