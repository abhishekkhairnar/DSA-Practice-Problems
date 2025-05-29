package BinaryTrees;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        tree.populate(sc);
        tree.display();
    }
}
