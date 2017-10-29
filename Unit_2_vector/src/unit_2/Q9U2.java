/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

/**
 *
 * @author prakash
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author user
 */
public class Q9U2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int temp = 0;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("*************Matrix Calculator*****************");
            System.out.println("1: Addition of Matrix");
            System.out.println("2: Multiplication of Matrices");
            System.out.println("3: Transpose Of Matrix");
            System.out.println("4: Adiition of Diagonal  elements matrices");
            System.out.println("5: Addition of Non-Diagonal Elements");
            System.out.println("Plaese Select A choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println(" Warning ..........!!!! : The Number of rows and colounbs should be equal");

                    int m = 0, n = 0;
                    int p = 0, q = 0;

                    int i = 0, j = 0;
                    System.out.println("Enter the no. of rows in Matrix A: ");
                    m = sc.nextInt();
                    System.out.println("Enter the no.0f coloumns in Matrix A: ");
                    n = sc.nextInt();
                    System.out.println("Enter the no. of rows in Matrix B: ");
                    p = sc.nextInt();
                    System.out.println("Enter the no.0f coloumns in Matrix B: ");
                    q = sc.nextInt();
                    if (m == p && n == q) {
                        int a[][] = new int[m][n];
                        System.out.println("Enter the elements of matrix A :");
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                a[i][j] = sc.nextInt();
                            }
                        }
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                System.out.print(a[i][j] + "\t");
                            }

                            System.out.println();
                        }

                        int b[][] = new int[p][q];
                        System.out.println("Enter the elements of matrix B :");
                        for (i = 0; i < p; i++) {
                            for (j = 0; j < q; j++) {
                                b[i][j] = sc.nextInt();
                            }
                        }
                        for (i = 0; i < p; i++) {
                            for (j = 0; j < q; j++) {
                                System.out.print(b[i][j] + "\t");
                            }

                            System.out.println();
                        }
                        int sum[][] = new int[m][n];
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                sum[i][j] = a[i][j] + b[i][j];
                            }
                        }
                        System.out.println("The Sum of the matrices are as follows :");
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                System.out.print(sum[i][j] + "\t");
                            }

                            System.out.println();
                        }

                    
                    }
                    break;

                }
                case 2: {
                    int m = 0, n = 0;
                    int p = 0, q = 0;

                    int i = 0, j = 0;
                    System.out.println("Enter the no. of rows in Matrix A: ");
                    m = sc.nextInt();
                    System.out.println("Enter the no.0f coloumns in Matrix A: ");
                    n = sc.nextInt();
                    System.out.println("Enter the no. of rows in Matrix B: ");
                    p = sc.nextInt();
                    System.out.println("Enter the no.0f coloumns in Matrix B: ");
                    q = sc.nextInt();

                    int a[][] = new int[m][n];
                    System.out.println("Enter the elements of matrix A :");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            a[i][j] = sc.nextInt();
                        }
                    }
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            System.out.print(a[i][j] + "\t");
                        }

                        System.out.println();
                    }

                    int b[][] = new int[p][q];
                    System.out.println("Enter the elements of matrix B :");
                    for (i = 0; i < p; i++) {
                        for (j = 0; j < q; j++) {
                            b[i][j] = sc.nextInt();
                        }
                    }
                    for (i = 0; i < p; i++) {
                        for (j = 0; j < q; j++) {
                            System.out.print(b[i][j] + "\t");
                        }

                        System.out.println();
                    }
                    int su[][] = new int[m][q];
                    int k = 0;
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < q; j++) {
                            for (k = 0; k < n; k++) {
                                su[i][j] = a[i][k] * b[k][j];
                            }
                        }
                    }
                    System.out.println("The Sum of the matrices are as follows :");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < k; j++) {
                            System.out.print(su[i][j] + "\t");
                        }

                        System.out.println();
                    }
                    break;

                }
                case 3: {
                    int m = 0, n = 0;
                    int i = 0, j = 0;
                    System.out.println("Enter the no. of rows in Matrix A: ");
                    m = sc.nextInt();
                    System.out.println("Enter the no.0f coloumns in Matrix A: ");
                    n = sc.nextInt();
                    int a[][] = new int[m][n];
                    System.out.println("Enter the elements of matrix A :");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            a[i][j] = sc.nextInt();
                        }
                    }
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            System.out.print(a[i][j] + "\t");
                        }

                        System.out.println();
                    }
                    System.out.println("Tanspose of a Matrix :");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            System.out.print(a[j][i] + "\t");
                        }

                        System.out.println();
                    }
                    break;
                }
                case 4: {
                    int sumd1 = 0, sumd2 = 0;
                    int m = 0, n = 0;
                    int i = 0, j = 0;
                    System.out.println("Enter the no. of rows in Matrix A: ");
                    m = sc.nextInt();
                    System.out.println("Enter the no.0f coloumns in Matrix A: ");
                    n = sc.nextInt();
                    int a[][] = new int[m][n];
                    System.out.println("Enter the elements of matrix A :");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            a[i][j] = sc.nextInt();
                        }
                    }
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            System.out.print(a[i][j] + "\t");
                        }

                        System.out.println();
                    }
                    for (i = 0; i < a.length; i++) {
                        sumd1 = sumd1 + a[i][i];
                    }
                    j = a.length - 1;
                    for (i = 0; i < a.length; i++) {
                        if (j >= 0) {
                            sumd2 = sumd2 + a[i][j];
                            j--;
                        }
                    }
                    System.out.println("Sum of Digonal elements are  :" + sumd1 + " and "
                            + sumd2);
                    break;

                }
                case 5: {
                    int sumd1 = 0, sumd2 = 0;
                    int m = 0, n = 0;
                    int i = 0, j = 0;
                    int s = 0;
                    System.out.println("Enter the no. of rows in Matrix A: ");
                    m = sc.nextInt();
                    System.out.println("Enter the no.0f coloumns in Matrix A: ");
                    n = sc.nextInt();
                    if (m == n) {
                        int a[][] = new int[m][n];
                        System.out.println("Enter the elements of matrix A :");
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                a[i][j] = sc.nextInt();
                            }
                        }

                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                System.out.print(a[i][j] + "\t");
                            }

                            System.out.println();

                        }
                        System.out.println(" Sum of non diagonal elements are: ");
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                if (i != j) {
                                    s = s + a[i][j];
                                }
                            }
                        }
                        System.out.println("The sum of diagonal elements : " + s);
                        break;

                }
            }
            }

        } while (temp == 0);

        }
}


