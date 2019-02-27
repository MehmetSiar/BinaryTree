import java.util.Scanner;

public class BinaryTreeMain {
    public static void  main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int girisnode = scanner.nextInt();
        BinaryTreeC.Node root = null;
        root = BinaryTreeC.ekle(root, 45);
        BinaryTreeC.ekle(root, 33);
        BinaryTreeC.ekle(root, 21);
        BinaryTreeC.ekle(root, 35);
        BinaryTreeC.ekle(root, 43);
        BinaryTreeC.ekle(root, 67);
        BinaryTreeC.ekle(root, 88);
        BinaryTreeC.ekle(root, girisnode);
        // Print inoder traversal of the BST
        BinaryTreeC.inOrder(root);


    }
}
