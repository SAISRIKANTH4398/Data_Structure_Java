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