package com.example.javaexo.exo2;

public class sousCondition {

    public static void main(String[] args) {
        // EXEMPLE : Si l'[âge du chien] est de 5 ans, alors afficher "Oui !"
        int dogAge = 5;

        if(dogAge == 5)
            System.out.println("Oui !");

        System.out.println("------------------------------------------------");

        // 1. Si le [solde] est inférieur au [montant], afficher le message "Solde insuffisant"
        // 2. Si le [solde] est inférieur au [montant], afficher le [message] "Solde insuffisant",
        //    sinon afficher un [autre message] "Achat validé !"

        int solde = 120;
        int montant = 1520;

        String messageSoldeInsufisant = "Solde insufisant !";
        String messageSoldeSufisant = "Solde sufisant !";

        if(solde > montant) {
            System.out.println(messageSoldeSufisant);
        } else {
            System.out.println(messageSoldeInsufisant);
        }

        System.out.println("------------------------------------------------");

        // 3. Si l'on a une [carte bancaire] et un [solde], alors l'[achat] est validé
        //    et est signalé par un message (de votre choix)

        Boolean mastercard = true;
        Boolean achat = false;

        if(mastercard && solde > 0) {
            achat = true;
            System.out.println("Achat Validé ! !");
        }else {
            System.out.println("Achat non validé");
        }

        System.out.println("------------------------------------------------");

        // 4. Soit un cercle de 24,5cm de [diamètre] et une valeur de [Pi] arrondie à 3.14,
        //    calculer l'[aire] du cercle puis l'afficher

        double diametre = 24.5;
        double radius = diametre / 2;
        double pi = 3.14;
        double aire = radius * radius * pi;
        
        System.out.println("l'aire du cercle est de : " + aire);

        System.out.println("------------------------------------------------");

        // 5. Si [a] est égal à 10, alors
        //       - afficher "Gagné \o/" si [b] est supérieur à 0 ou [c] supérieur à 1
        //       - sinon :
        //           - afficher "Perdu" si [b] est égal à 5
        //           - sinon si [d] est compris entre 2 (inclus) et 4 (inclus), afficher
        //             le message "Alors peut-être..."
        //           - sinon afficher le message "Pas de chance :("
        int a = 10;
        int b = 5;
        int c = -4;
        int d = 3;
        
//        if(a == 10) {
//            if(b > 0 || c > 1) {
//                System.out.println("Gagné \\o/");
//            } else if (b == 5) {
//                System.out.println("Perdu");
//            } else if (d >= 2 && d <= 4) {
//                System.out.println("Alors peut etre");
//            }else {
//                System.out.println("Pas de chance :(");
//            }
//        }

//        CORRECTION :
        if(a == 10) {
            if(b > 0 || c > 1) {
                System.out.println("Gagné \\o/");

            } else {
                if (b == 5) {
                    System.out.println("Perdu");

                } else if (d >= 2 && d <= 4) {
                    System.out.println("Alors peut etre");

                }else {
                    System.out.println("Pas de chance :(");

                }
            }
        }
    }
}
