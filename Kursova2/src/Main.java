//Да се проектира структура от данни цикличен списък (динамична реализация),
//който при нужда удвоява размера си. Да се реализират основни операции за работа с цикличен списък.
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class DynamicList {
    private Node head;
    private int size;
    private int capacity;

    public DynamicList() {
        head = null;
        size = 0;
        capacity = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        size++;

    }

    public void doubleSize() {
        Node current = head;
        int originalSize = size;

        Node last = current;
        while (last.next != head) {
            last = last.next;
        }

        for (int i = 0; i < originalSize; i++) {
            last.next = new Node(current.data);
            last = last.next;
            last.next = head;
            current = current.next;
        }
        capacity = originalSize * 2;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Списъкът е празен.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public boolean contains(int data) {
        if (isEmpty()) {
            return false;
        }

        Node current = head;
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    public boolean remove(int data) {
        if (isEmpty()) {
            return false;
        }

        Node current = head;
        Node previous = null;
        do {
            if (current.data == data) {
                if (previous == null) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    last.next = head.next;
                    head = head.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        DynamicList list = new DynamicList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.display();

        list.doubleSize();
        list.display();


        System.out.println("Търсене на елемент 3: " + list.contains(3));
        System.out.println("Търсене на елемент 7: " + list.contains(7));

        System.out.println("Изтриване на елемент 3: " + list.remove(3));
        list.display();

    }
}
























/*
 public void doubleSize() {
        Node current = head;
        int originalSize = size;

        Node last = current;
        while (last.next != head) {
            last = last.next;
        }

        for (int i = 0; i < originalSize; i++) {
            boolean isUnique = true;
            Node temp = head;
            for (int j = 0; j < size; j++) {
                if (temp.data == current.data) {
                    isUnique = false;
                    break;
                }
                temp = temp.next;
            }

            if (isUnique) {
                last.next = new Node(current.data);
                last = last.next;
                last.next = head;
                size++;
            }
            current = current.next;
        }
        capacity *= 2;
    }

 */