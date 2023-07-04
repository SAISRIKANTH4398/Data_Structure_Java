import java.util.*;


/*Java program to print lower traingular matrix when an MxN matrix is given. */
class Main11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int k=0;k<M;k++){
            if(k>=N){
                int[] arr1 = new int[N];
                for(int l=0;l<N;l++){
                arr1[l] = arr[k][l];
            }
            System.out.println(Arrays.toString(arr1));
            }else{
            int[] arr1 = new int[k+1];
            for(int l=0;l<=k;l++){
                arr1[l] = arr[k][l];
            }
            System.out.println(Arrays.toString(arr1));
            }  
        }
        sc.close();
    }
}

/* Java program to find the max, min and sum of each row in a given MxN matrix */
class Main12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        int[] maxArr = new int[M];
        int[] minArr = new int[M];
        int[] sumArr = new int[M];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int k=0;k<M;k++){
            int maxNum = arr[k][0];
            int minNum = arr[k][0];
            int sum = 0;
            for(int l=0;l<N;l++){
                if(maxNum<=arr[k][l]){
                    maxNum = arr[k][l];
                }
                minNum = minNum>=arr[k][l]?arr[k][l]:minNum;
                sum+=arr[k][l];
            }
            maxArr[k] = maxNum;
            minArr[k] = minNum;
            sumArr[k] = sum;
        }
        System.out.println(Arrays.toString(maxArr));
        System.out.println(Arrays.toString(minArr));
        System.out.println(Arrays.toString(sumArr));

        sc.close();
    }
}

/*Define array [1,6,32,93,71,-20,30,-90,50]. 
 * program to create an arraylist with all the elements in the existing array that are greater than N
 */
class Main13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(6);
        arrList.add(32);
        arrList.add(93);
        arrList.add(71);
        arrList.add(-20);
        arrList.add(30);
        arrList.add(-90);
        arrList.add(50);
        ArrayList<Integer> resultArr = new ArrayList<Integer>();
        for(int i:arrList){
            if(i>N){
                resultArr.add(i);
            }
        }
        System.out.println(resultArr);
        sc.close();
    }
}