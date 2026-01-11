package part1.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GradesManagementApp {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();

        // 1. Insérer les notes des étudiants.
        System.out.println("--- 1. Insertion des notes ---");
        grades.put("Ahmed", 15.5);
        grades.put("Sarah", 18.0);
        grades.put("Mohamed", 12.0);
        grades.put("Hajar", 19.5);
        printGrades(grades);

        // 2. Augmenter la note d'un étudiant.
        System.out.println("\n--- 2. Augmentation de la note de Sarah ---");
        grades.put("Sarah", grades.get("Sarah") + 1.5); // Augmenter de 1.5
        printGrades(grades);

        // 3. Supprimer la note d'un étudiant.
        System.out.println("\n--- 3. Suppression de la note de Mohamed ---");
        grades.remove("Mohamed");
        printGrades(grades);

        // 4. Afficher la taille de la map.
        System.out.println("\n--- 4. Taille de la map ---");
        System.out.println("Taille : " + grades.size());
        printGrades(grades);

        // 5. Afficher la moyenne, la note maximale et minimale.
        System.out.println("\n--- 5. Moyenne, Max, Min ---");
        if (!grades.isEmpty()) {
            double max = Collections.max(grades.values());
            double min = Collections.min(grades.values());
            double average = grades.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            
            System.out.println("Note maximale : " + max);
            System.out.println("Note minimale : " + min);
            System.out.println("Moyenne des notes : " + average);
        }
        printGrades(grades);

        // 6. Vérifier s'il y a une note égale à 20.
        System.out.println("\n--- 6. Vérification de la note 20 ---");
        boolean has20 = grades.containsValue(20.0);
        System.out.println("Y a-t-il une note de 20 ? " + has20);
        
        printGrades(grades);
    }

    // Après chaque opération, afficher la liste à l'aide de la boucle forEach avec l'expression lambda.
    private static void printGrades(Map<String, Double> grades) {
        System.out.println("Notes actuelles :");
        grades.forEach((name, grade) -> System.out.println("Étudiant : " + name + ", Note : " + grade));
    }
}
