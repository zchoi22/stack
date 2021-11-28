import java.util.Objects;

/**
 * Node Practice
 * Just create a node class
 * Author: William Writer
 * Collaborator(s): Jake(my brother)
 * Collaboration: He said that my variables were terrible so I changed them
 * Date: Date the program is handed in
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: WW
 **/
public class Node<T> {
    private T data;
    private Node<T> prev;
    private Node<T> next;

    public Node(){
        prev = null;
        next = null;
    }
    public Node(T Data){
        this.data =Data;
    }
    public Node(T data, Node<T> prev, Node<T> next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    public T get_data(){
        return data;
    }
    public Node<T> getPrev(){
        return prev;
    }
    public Node<T> getNext(){
        return next;
    }
    public T set_data(T data){
        return this.data = data;
    }
    public Node<T> set_prev(Node<T> prev){
        return this.prev = prev;
    }
    public Node<T> set_next(Node<T> next){
        return this.next = next;
    }

    public String toString(){
        return "Node: "+ data;
    }

    @Override // Inteli J did this for me, but it is overriding the .equals method
    public boolean equals(Object o) {
        if (this == o) return true; // if they have the same memory location
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data) &&
                Objects.equals(prev, node.prev) &&
                Objects.equals(next, node.next);
    }
    @Override
    public int hashCode() {
        return Objects.hash(data, prev, next);
    }
}

