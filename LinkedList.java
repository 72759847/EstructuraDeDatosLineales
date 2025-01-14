package edl;

public class LinkedList
{
    Node head;// Representa primer nodo de la lista enlasada iniacialmente head es null lista vacia
    // Agregar al final
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next!= null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    // eliminar el valor
    public void delete(int data){
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null&& current.next.data != data){
            current = current.next;
        }
        if(current.next!=null){
            current.next = current.next.next;
        }
    }
    // Buscar valor
    public boolean search(int data){
        Node current = head;
        while(current !=null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    //Mostrar todos los elementos de la lista
    public void display(){
        Node current = head;
        while(current!= null){
            System.out.print (current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main (String[] args){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); // mostrar 10,20,30

        list.delete(20);
        list.display(); //mostrar 10 y 30

        System.out.println(list.search(30)); // Mostrar true
        System.out.println(list.search(40)); // Mostrar false
    }
}