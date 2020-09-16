// The test driver for the NumberList ADT implementations
public class TestNumberList {
    public static void main(String[] args) {
        NumberList mylist1 = new ArrayNumberList(5);
        mylist1.insert(100);
        mylist1.insert(35);
        mylist1.insert(17);
        mylist1.insert(20);
        mylist1.insert(48);

        System.out.println(mylist1);
        System.out.println("Is 35 in the list? " + mylist1.contains(35));
        System.out.println("Is 15 in the list? " + mylist1.contains(15));
        System.out.println("Is the list full? " + mylist1.isFull());
        System.out.println();

        NumberList mylist2 = new LinkedNumberList();
        mylist2.insert(100);
        mylist2.insert(35);
        mylist2.insert(17);
        mylist2.insert(20);
        mylist2.insert(48);

        System.out.println(mylist2);
        System.out.println("Is 35 in the list? " + mylist2.contains(35));
        System.out.println("Is 15 in the list? " + mylist2.contains(15));
        System.out.println("Is the list full? " + mylist2.isFull());
    }
}
