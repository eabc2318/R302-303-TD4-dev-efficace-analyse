public class Main {
    public static void main(String[] args) {
        BinaryTree feuille5 = new BinaryTree<>("5");
        BinaryTree feuille2 = new BinaryTree<>("2");
        BinaryTree sousArbrePlus = new BinaryTree<>("+", feuille5, feuille2);
        BinaryTree feuille8 = new BinaryTree<>("8");

        BinaryTree arbre = new BinaryTree<>("*", sousArbrePlus, feuille8);


        arbre.parcoursPrefixe();
        System.out.println();

        System.out.println(arbre);
    }
}