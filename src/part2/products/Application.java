package part2.products;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Gestion des Produits (Génériques) ---");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par id");
            System.out.println("3. Ajouter un nouveau produit");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter");
            System.out.print("Entrez votre choix : ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choice) {
                case 1:
                    List<Product> list = metier.getAll();
                    if (list.isEmpty()) {
                        System.out.println("Aucun produit trouvé.");
                    } else {
                        System.out.println("Produits :");
                        for (Product p : list) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Entrez l'ID du produit à rechercher : ");
                    long searchId = scanner.nextLong();
                    Product found = metier.findById(searchId);
                    if (found != null) {
                        System.out.println("Trouvé : " + found);
                    } else {
                        System.out.println("Produit non trouvé.");
                    }
                    break;
                case 3:
                    System.out.print("Entrez l'ID du produit : ");
                    long id = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Entrez le Nom : ");
                    String name = scanner.nextLine();
                    System.out.print("Entrez la Marque : ");
                    String brand = scanner.nextLine();
                    System.out.print("Entrez le Prix : ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Entrez la Description : ");
                    String desc = scanner.nextLine();
                    System.out.print("Entrez la Quantité en stock : ");
                    int stock = scanner.nextInt();
                    
                    Product newProduct = new Product(id, name, brand, price, desc, stock);
                    metier.add(newProduct);
                    System.out.println("Produit ajouté.");
                    break;
                case 4:
                    System.out.print("Entrez l'ID du produit à supprimer : ");
                    long deleteId = scanner.nextLong();
                    metier.delete(deleteId);
                    System.out.println("Opération terminée.");
                    break;
                case 5:
                    System.out.println("Fermeture...");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
