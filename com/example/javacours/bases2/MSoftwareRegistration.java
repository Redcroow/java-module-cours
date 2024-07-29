package com.example.javacours.bases2;

public class MSoftwareRegistration {
    /*
        ACCESSEUR :
            getters : accès à un attribut
            setters : modificationd'un attribut
    */
    private int expirationYear;
    public int getExpirationYear() { return this.expirationYear; }
    public void setExpirationYear(int expirationYear) { this.expirationYear = expirationYear; }

    private static int numberOfRegistrations = 5;
    public static int getNumberOfRegistrations() { return numberOfRegistrations; }
    public static void setNumberOfRegistrations(int numberOfRegistrations) { numberOfRegistrations = numberOfRegistrations; }

    public MSoftwareRegistration(int expiration) {

        if(numberOfRegistrations > 0) {
            this.expirationYear = expiration;
            numberOfRegistrations--;

            System.out.println("Software Registration Created jusqu'au : "+expirationYear);
            System.out.println("Number of registrations : "+numberOfRegistrations);
        }else {
            System.out.println("Maximum de registrations atteinte");
        }
    }
}
