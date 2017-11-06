/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

/**
 *
 * @author nurudin72
 */
import java.util.*;

public class BinTree {

    Node root;

    private boolean isEmpty() {
        return (root == null);
    }

    public void insert(int input) {
        Node temp = new Node(input);
        if (isEmpty()) {
            root = temp;
        } else {
            Node cursor = root,
                    parent = null;
            while (cursor != null) {
                parent = cursor;
                if (input < cursor.data) {
                    cursor = cursor.left;
                } else {
                    cursor = cursor.right;
                }
            }
            if (input < parent.data) {
                parent.left = temp;
                return;
            } else {
                parent.right = temp;
                return;
            }
        }
    }
 public int getLeafCount(){
        return getLeafCount(root);
    }
  
    public int getLeafCount(Node node){
        
        if (node == null){
            return 0;
        }
        if (node.left == null && node.right == null){
            return 1;
        }
        else{
            return getLeafCount(node.left) + getLeafCount(node.right);
        }
    }
    
    void printPaths(Node node) {
        int path[] = new int[1000];
        printPathsRecur(node, path, 0);
    }

    void printPathsRecur(Node node, int path[], int pathLen) {
        if (node == null) {
            return;
        }

        path[pathLen] = node.data;
        pathLen++;

        if (node.left == null && node.right == null) {
            printArray(path, pathLen);
        } else {
            printPathsRecur(node.left, path, pathLen);
            printPathsRecur(node.right, path, pathLen);
        }
    }

    void printArray(int ints[], int len) {
        int i;
        for (i = 0; i < len; i++) {
            System.out.print("-> " + ints[i] + " ");
        }
        System.out.println("");
    }

    public void delete(int k) {
        if (isEmpty()) {
            System.out.println("Maaf Data Kosong");
        } else if (search(k) == false) {
            System.out.println("Sorry " + k + " Tidak  Ada");
        } else {
            root = delete(root, k);
            System.out.println(k + " Terhapus dari tree");
        }
    }

    private Node delete(Node root, int k) {
        Node p, p2, n;
        if (root.getData() == k) {
            Node lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null) {
                return null;
            } else if (lt == null) {
                p = rt;
                return p;
            } else if (rt == null) {
                p = lt;
                return p;
            } else {
                p2 = rt;
                p = rt;
                while (p.getLeft() != null) {
                    p = p.getLeft();
                }
                p.setLeft(lt);
                return p2;
            }
        }
        if (k < root.getData()) {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        } else {
            n = delete(root.getRight(), k);
            root.setRight(n);
        }
        return root;
    }

    public boolean search(int val) {
        return search(root, val);
    }

    private boolean search(Node r, int val) {
        boolean found = false;
        while ((r != null) && !found) {
            int rval = r.getData();
            if (val < rval) {
                r = r.getLeft();
            } else if (val > rval) {
                r = r.getRight();
            } else {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }

    private Node getSuccessor(Node localNode) {
        Node parent = null,
                successor = localNode,
                cursor = localNode.left;
        while (cursor != null) {
            parent = successor;
            successor = cursor;
            cursor = cursor.right;
        }
        if (successor != localNode.left) {
            parent.right = successor.left;
            successor.left = localNode.left;
        }
        return successor;
    }

    public void traverse(int tipe) {
        switch (tipe) {
            case 1:
                System.out.print("\nPreorder  :");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder   :");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder :");
                postOrder(root);
                break;
        }
    }

    private void preOrder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        System.out.print(localRoot.data + " ");
        preOrder(localRoot.left);
        preOrder(localRoot.right);
    }

    private void inOrder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        inOrder(localRoot.left);
        System.out.print(localRoot.data + " ");
        inOrder(localRoot.right);
    }

    private void postOrder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        postOrder(localRoot.left);
        postOrder(localRoot.right);
        System.out.print(localRoot.data + " ");
    }
}
