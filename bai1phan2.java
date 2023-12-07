import java.util.Scanner;

public class bai1phan2 {
    public static void main(String[] args) {
        int hight;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập chiều cao : ");
        hight= sc.nextInt();
        for (int i=1;i<=hight;i++){
            for (int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
