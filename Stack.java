public class Stack<T>{
    private Node<T> root;
    public int length;

    public static void main(String[] args) {
        Stack test = new Stack(1);
    }

    public Stack(){
        root = new Node();
        length = 0;
    }

    public Stack(T data){
        root = new Node(data);
        length = 0;
    }

    public void push(Node prev){
        top(root).set_prev(prev);
        prev.set_next(top(root));
        length++;
    }

    public Node pop(){
        Node toReturn = top(root);
        top(root).getNext().set_prev(null);
        top(root).set_next(null);
        length--;
        return toReturn;
    }

    public Node peek(){
        return(top(root));
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return (length == 0);
    }

    private Node top(Node root){
        if(root.getPrev() == null){
            return root;
        }

        return top(root.getPrev());
    }
}