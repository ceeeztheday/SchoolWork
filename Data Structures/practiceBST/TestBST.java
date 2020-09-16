public class TestBST {
    public static void main(String[] args) {
        BST mytree = new BST();
        mytree.add(15);
        mytree.add(7);
        mytree.add(18);
        mytree.add(3);
        mytree.add(9);
        mytree.add(12);
        mytree.add(20);
        mytree.add(16);
        mytree.add(9);

        System.out.println("The size of the tree is " + mytree.size());
        System.out.print("The in-order traversal of the tree is ");
        mytree.inOrder();

        System.out.println("3 exists? " + mytree.contains(3));
        System.out.println("4 exists? " + mytree.contains(4));
        System.out.println("16 exists? " + mytree.contains(16));

        mytree.clear();
        System.out.println("Inserting 50,000 random numbers into the tree...");
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++)
            mytree.add((int) (Math.random() * 100000));

        long endTime = System.currentTimeMillis();
        System.out.println("Done! Time cost: " + (endTime - startTime) / 1000.0 + "s.");

        mytree.clear();
        System.out.println("Inserting 50,000 sequential numbers into the tree...");
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++)
            mytree.add(i);

        endTime = System.currentTimeMillis();
        System.out.println("Done! Time cost: " + (endTime - startTime) / 1000.0 + "s.");
    }
}
