import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList1 = new ArrayList<>();
        arrList1.add(5);
        arrList1.add(10);
        arrList1.add(15);
        arrList1.add(20);
        System.out.println("arrList1: " + arrList1); // [5, 10, 15, 20]
        ArrayList<Integer> arrList2 = new ArrayList<>();
        arrList2.add(25);
        arrList2.add(30);
        arrList2.add(35);
        arrList2.add(40);
        System.out.println("arrList2: " + arrList2); // [25, 30, 35, 40]
        arrList1.addAll(arrList2); // To concatenate 2 arrays
        ArrayList<Integer> subArrList = new ArrayList<Integer>(arrList1.subList(1,3)); //ArrayList Slicing
        System.out.println(subArrList);
        System.out.println("arrList1 after concatenation: " + arrList1); // [5, 10, 15, 20, 25, 30, 35, 40]
    }
}