package part1.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagementApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Gestion des Produits ---");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Afficher les produits");
            System.out.println("3. Supprimer un produit par indice");
            System.out.println("4. Modifier un produit par indice");
            System.out.println("5. Rechercher un produit par nom");
            System.out.println("0. Quitter");
            System.out.print("Entrez votre choix : ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choice) {
                case 1:
                    System.out.print("Entrez l'ID du produit : ");
                    long id = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Entrez le nom du produit : ");
                    String name = scanner.nextLine();
                    System.out.print("Entrez le prix du produit : ");
                    double price = scanner.nextDouble();
                    products.add(new Product(id, name, price));
                    System.out.println("Produit ajouté.");
                    break;
                case 2:
                    if (products.isEmpty()) {
                        System.out.println("Aucun produit disponible.");
                    } else {
                        System.out.println("Liste des produits :");
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println(i + ". " + products.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Entrez l'indice à supprimer : ");
                    int deleteIndex = scanner.nextInt();
                    if (deleteIndex >= 0 && deleteIndex < products.size()) {
                        products.remove(deleteIndex);
                        System.out.println("Produit supprimé.");
                    } else {
                        System.out.println("Indice invalide.");
                    }
                    break;
                case 4:
                    System.out.print("Entrez l'indice à modifier : ");
                    int modifyIndex = scanner.nextInt();
                    scanner.nextLine();
                    if (modifyIndex >= 0 && modifyIndex < products.size()) {
                        Product p = products.get(modifyIndex);
                        System.out.println("Modification de : " + p);
                        
                        System.out.print("Entrez le nouveau nom (laisser vide pour conserver l'actuel) : ");
                        String newName = scanner.nextLine();
                        if (!newName.isEmpty()) {
                            p.setName(newName);
                        }
                        
                        System.out.print("Entrez le nouveau prix (-1 pour conserver l'actuel) : ");
                        double newPrice = scanner.nextDouble();
                        if (newPrice != -1) {
                            p.setPrice(newPrice);
                        }
                        System.out.println("Produit modifié.");
                    } else {
                        System.out.println("Indice invalide.");
                    }
                    break;
                case 5:
                    System.out.print("Entrez le nom à rechercher : ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (Product p : products) {
                        if (p.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Trouvé : " + p);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Produit non trouvé.");
                    }
                    break;
                case 0:
                    System.out.println("Fermeture...");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
