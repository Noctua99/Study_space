import java.util.Arrays;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        list.print();
        list.removeFirst();
        list.print();
        list.addFirst(10);
        list.print();
        list.removeLast();
        list.print();
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
