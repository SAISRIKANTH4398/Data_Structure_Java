import java.util.*;

/*Program to add 2 matrices of size MxN */
class AdditionOf2Matrices{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr1 = new int[M][N];
        int[][] arr2 = new int[M][N];
        int[][] outputArr = new int[M][N];
        for(int i=0; i<M;i++){
            for(int j=0;j<N; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int k=0; k<M;k++){
            for(int l=0;l<N; l++){
                arr2[k][l] = sc.nextInt();
            }
        }
        for(int a=0; a<M;a++){
            for(int b=0;b<N; b++){
                outputArr[a][b] = arr1[a][b]+arr2[a][b];
                System.out.print(outputArr[a][b]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*Program to replace a value from MxN matrix */

class replaceValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(), N = sc.nextInt();
        int[][] arr1 = new int[M][N];
        for(int i=0; i<M;i++){
            for(int j=0;j<N;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int a=sc.nextInt(), b = sc.nextInt();
        for(int i=0; i<M;i++){
            for(int j=0;j<N;j++){
                if(arr1[i][j]==a){
                    arr1[i][j]=b;
                }
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*Program to find principal diagonal elements for an MxN matrix */
class principalDiagonal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        int lesser = M>N?N:M;
        int[] arr1 = new int[lesser];   //Condition check for square and rectangle matrix
        for(int i=0; i<M; i++){
            for(int j=0;j<N;j++){
                arr[i][j] = sc.nextInt();
                if(i==j){
                    arr1[i] = arr[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        sc.close();
    }
}