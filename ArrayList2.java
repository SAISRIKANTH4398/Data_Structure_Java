import java.util.*;

class Main8 {
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


class Main9 {
    public static void main(String[] args) {
        String[] sportsArr = {"Basketball", "Cricket", "Football"};

        System.out.println("Type of sportsArr: " + sportsArr.getClass().getSimpleName());

        ArrayList<String> sportsArrList = new ArrayList<>(Arrays.asList(sportsArr)); // converting Array to ArrayList

        System.out.println("sportsArrList: " + sportsArrList); // [Basketball", "Cricket", "Football]
        System.out.println("Type of sportsArrList: " + sportsArrList.getClass().getSimpleName());
        String[] sportsArr2 = new String[sportsArrList.size()];
        sportsArrList.toArray(sportsArr2);     //Method to convert Array List to an array
        System.out.println(Arrays.toString(sportsArr2));  
        System.out.println(sportsArr2.getClass().getSimpleName());

    }
}


/*Java program to add an element to an array such that array should be sorted and
 print the array, position of newly added element*/
 
class Main10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            arr.add(sc.nextInt());
        }
        for(int j=0;j<N;j++){
            if(arr.get(j)>K){
                arr.add(j,K);
                System.out.println(j);
                break;
            }else if(arr.get(j)==K){
                System.out.println(0);
                break;
            }
        }
        System.out.println(arr);
        sc.close();
    }
}