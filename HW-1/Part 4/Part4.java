public class Part4 {
public static void main(String[] args) {
    
    LinkedList<Integer> list = new LinkedList<>();
    list.push(5);
    list.push(4);
    list.push(3);
    list.push(2);
    list.push(1);

    System.out.println(list.printList());
    list.pop();
    System.out.println(list.printList());

    list.remove(2);
    System.out.println(list.printList());

    list.remove(20);
    System.out.println(list.printList());

    System.out.println(list.elementAt(3));

    System.out.println(list.size);
    System.out.println(list.elementAt(10)); // we wanted null as the return value here




}
}
