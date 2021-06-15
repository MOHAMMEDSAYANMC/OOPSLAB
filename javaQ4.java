import java.util.*;
class javaQ4
{
	public static void main(String[] args) {
	    int m,n,i,j;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
        m = sc.nextInt();
        System.out.print("Enter the number of columns: ");   
        n = sc.nextInt();
        int matrix1[][] = new int[m][n];
        int matrix2[][] = new int[m][n];
        int sum[][] = new int[m][n];
        System.out.println("Enter the elements of the first matrix: ");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)   
                matrix1[i][j] = sc.nextInt();   
        System.out.println("Enter the elements of the second matrix: ");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)   
                matrix2[i][j] = sc.nextInt(); 
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
        System.out.println("Sum of matrices is\n");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                System.out.println(sum[i][j]+"\t");
	}
}