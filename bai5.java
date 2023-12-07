import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int sohang = sc.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int socot = sc.nextInt();
        int A[][] = new int[sohang][socot];
        for (int i = 0; i < sohang; i++) {
            for (int j = 0; j < socot; j++) {
                System.out.println("nhập hàng" + i + "cột " + j);
                A[i][j] = sc.nextInt();


            }

        }
        System.out.println("Mảng vừa nhập : ");
        for (int i = 0; i < sohang; i++) {
            for (int j = 0; j < socot; j++) {
                System.out.print(A[i][j] + "\t");


            }
            System.out.println("\n");


        }
        for (int i = 0; i < sohang; i++) {
            for (int j = 0; j < socot; j++) {
                System.out.print(A[i][j] + "\t");
                if (i == j || j == sohang - i-1) {
                    System.out.print( A[i][j]+"\t");
                }else {
                    System.out.println(" ");
                }


            }




        }
        System.out.println();

    }}
