/**
 * Stack Class made by Zion Choi
 * **/

public class Stack<T>{
   //initial root and length of 0
    private Node<T> root;
    public int length;

    public static void main(String[] args) {
        //checks if constructor works and test peek method
        Stack test = new Stack(1);
        System.out.println(test.peek());

        //tests push method and size
        Node top = new Node(2);
        test.push(top);
        System.out.println(test.peek());
        System.out.println(test.size());

        //tests pop method, should return root node
        System.out.println(test.pop());
        System.out.println(test.peek());
        System.out.println(test.size());

        //tests pop again, for one node in the stack, then checks if empty
        test.pop();
        System.out.println(test.isEmpty());
    }

    //intializes empty node and length of 0
    public Stack(){
        root = new Node();
        length = 0;
    }

    //initializes 1 node with data and length of 1
    public Stack(T data){
        root = new Node(data);
        length = 1;
    }

    //sets the previous top nodes previous node to input (vice versa) then ups length by 1
    public void push(Node prev){
        prev.set_next(top(root));
        top(root).set_prev(prev);
        length++;
    }

    //if length is 1, that is the root node so turns that to null and reduces length
    //else, sets the top node's previous and next to null
    public Node pop(){
        if (length == 1){
            Node temp = root;
            root = null;
            length--;
            return temp;
        }
        Node toReturn = top(root);
        top(root).getNext().set_prev(null);
        top(root).set_next(null);
        length--;
        return toReturn;
    }

    //returns top node => see recursive method below
    public Node peek(){
        return(top(root));
    }

    //returns length variable
    public int size(){
        return length;
    }

    //checks if length is equal to 0
    public boolean isEmpty(){
        return (length == 0);
    }

    //recursive method to return the top node
    private Node top(Node root){
        if(root.getPrev() == null){
            return root;
        }

        return top(root.getPrev());
    }
}