import java.util.*;
class javaQ5
{
    public static void main(String args[])
    {
        int m,n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        m=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        n=sc.nextInt();

        int[][] matrix=new int[m][n];
      
        System.out.println("Enter the elements of Matrix : ");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                matrix[i][j]=sc.nextInt();
        if(m != n)
        {
            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
        }
        else
        {
            boolean symmetric = true;
             
            for (i=0; i<m; i++)
            {
                for (j=0; j<n; j++)
                {
                    if(matrix[i][j] != matrix[j][i])
                    {
                        symmetric = false;
                        break;
                    }
                }
            }
             
            if(symmetric)
            {
                System.out.println("The given Matrix is Symmetric...");
            }
            else
            {
                System.out.println("The given Matrix is not Symmetric...");
            }
        }

    }
}