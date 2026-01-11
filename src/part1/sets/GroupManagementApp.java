package part1.sets;

import java.util.HashSet;
import java.util.Set;

public class GroupManagementApp {
    public static void main(String[] args) {
        // 1. Créer deux ensembles HashSet nommés groupA et groupB
        Set<String> groupA = new HashSet<>();
        Set<String> groupB = new HashSet<>();

        // 1. Ajouter les noms des étudiants à chaque HashSet.
        System.out.println("--- Ajout d'étudiants au Groupe A ---");
        groupA.add("Ahmed");
        groupA.add("Sarah");
        groupA.add("Mohamed");
        System.out.println("Groupe A : " + groupA);

        System.out.println("\n--- Ajout d'étudiants au Groupe B ---");
        groupB.add("Sarah"); // Commun
        groupB.add("Hajar");
        groupB.add("Mohamed"); // Commun
        groupB.add("Youssef");
        System.out.println("Groupe B : " + groupB);

        // 2. Afficher l'intersection des deux HashSets.
        System.out.println("\n--- Intersection du Groupe A et du Groupe B ---");
        Set<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("Intersection : " + intersection);

        // 3. Afficher l'union des deux HashSets.
        System.out.println("\n--- Union du Groupe A et du Groupe B ---");
        Set<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union : " + union);
    }
}
