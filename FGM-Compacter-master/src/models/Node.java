package models;

public class Node {

    public String caractere;
    public int freq;

    public Node left;
    public Node right;

    public Node(String _char, int valor) {
        caractere = _char;
        freq = valor;
    }

    public Node(String _char) {
        caractere = _char;
        freq = 1;
    }

    public Node(String _char, int valor, Node _left, Node _right) {
        caractere = _char;
        freq = valor;
        left = _left;
        right = _right;
    }

    public void setLeft(Node node) {
        left = node;
    }

    public void setRight(Node node) {
        right = node;
    }

    @Override
    public String toString() {
        String str = this.caractere + "(" + this.freq + ") ";
        return str;
    }
    
}
