import java.util.Arrays;

public class second{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Size of array rows u want : ");
     int n = sc.nextInt();
     System.out.print("Enter Size of array Column u want : ");
     int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print("Enter number : ");
            int a = sc.nextInt();
            arr[i][j]=a;
        }
        }
       int arr1[][]=new int[n][m];
       for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        arr1[i][j]=arr[i][(m-1)-j];
       } 
       }

        System.out.print("{");
      for(int i=0;i<n;i++){
        System.out.print("{");
    for(int j=0;j<n;j++){
        System.out.print(arr1[i][j]+" ");
      }    
        System.out.print("}");
      }
        System.out.print("}");
    }
}