import java.util.ArrayList;
import java.util.List;

class BinaryTreeC{
    static class Node {
        int yeninode;
        Node sol, sag;
    }
    static Node yeniNode(int veri)    {
        Node temp = new Node();
        temp.yeninode = veri;
        temp.sol = null;
        temp.sag = null;
        return temp;
    }
    static Node ekle(Node root, int key)    {
        Node yeninod = yeniNode(key);
        Node x = root;
        Node y = null;
        while (x != null) {
            y = x;
            if (key < x.yeninode)
                x = x.sol;
            else
                x = x.sag;
        }
        if (y == null)
            y = yeninod;
        else if (key < y.yeninode)
            y.sol = yeninod;
        else
            y.sag = yeninod;
        return y;
    }
    static void inOrder(Node root)
    {
        if (root == null)
            return;
        else {
            inOrder(root.sol);
            System.out.print( root.yeninode +" ");
            inOrder(root.sag);
        }
    }
    static boolean AnomaliKontrol(Node root,int a) {
        Node rootkontrol = new Node();
        List rootListe = new ArrayList();
        if (root != null) {
        }
        return true;
    }
}

    