public class BinaryTree {
    private T val;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(T val) {
        this(val, null, null);
    }

    public BinaryTree(T val, BinaryTree left, BinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public T getVal() { return val; }
    public BinaryTree getLeft() { return left; }
    public BinaryTree getRight() { return right; }
    public void setLeft(BinaryTree left) { this.left = left; }
    public void setRight(BinaryTree right) { this.right = right; }

    // merci les cours de NSI au lycée
    public void parcoursPrefixe() {
        // racine
        System.out.print(this.val + " ");

        // appel réeursif gauche
        if (this.left != null) {
            this.left.parcoursPrefixe();
        }

        // appel récursif droit
        if (this.right != null) {
            this.right.parcoursPrefixe();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        buildPrefixString(sb);
        return sb.toString().trim();
    }

    private void buildPrefixString(StringBuilder sb) {
        sb.append(this.val).append(" ");
        if (this.left != null) this.left.buildPrefixString(sb);
        if (this.right != null) this.right.buildPrefixString(sb);
    }
}