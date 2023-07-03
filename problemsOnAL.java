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
