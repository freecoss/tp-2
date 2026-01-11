package part2.generics;

public class Application {
    public static void main(String[] args) {
        // Test avec Integer
        System.out.println("--- Test avec Integer ---");
        GenericStorage<Integer> intStorage = new GenericStorage<>();
        intStorage.addElement(10);
        intStorage.addElement(20);
        intStorage.addElement(30);
        System.out.println("Éléments : " + intStorage);
        System.out.println("Taille : " + intStorage.getSize());
        System.out.println("Élément à l'indice 1 : " + intStorage.getElement(1));
        intStorage.removeElement(1); // Supprimer 20
        System.out.println("Éléments après suppression : " + intStorage);

        // Test avec String
        System.out.println("\n--- Test avec String ---");
        GenericStorage<String> stringStorage = new GenericStorage<>();
        stringStorage.addElement("Bonjour");
        stringStorage.addElement("Monde");
        stringStorage.addElement("Java");
        System.out.println("Éléments : " + stringStorage);
        System.out.println("Taille : " + stringStorage.getSize());
        System.out.println("Élément à l'indice 0 : " + stringStorage.getElement(0));
        stringStorage.removeElement(2); // Supprimer Java
        System.out.println("Éléments après suppression : " + stringStorage);

        // Test avec Double
        System.out.println("\n--- Test avec Double ---");
        GenericStorage<Double> doubleStorage = new GenericStorage<>();
        doubleStorage.addElement(1.1);
        doubleStorage.addElement(2.2);
        doubleStorage.addElement(3.3);
        System.out.println("Éléments : " + doubleStorage);
        System.out.println("Taille : " + doubleStorage.getSize());
        System.out.println("Élément à l'indice 2 : " + doubleStorage.getElement(2));
        doubleStorage.removeElement(0); // Supprimer 1.1
        System.out.println("Éléments après suppression : " + doubleStorage);
    }
}
