public class bai4 {
    public static void main(String[] args) {
        int a;
        for (a=1;a<10;a++){
            if (a < 2) {
                System.out.println(a);
            }
            int squareRoot = (int) Math.sqrt(a);
            for (int i = 2; i <= squareRoot; i++) {
                if (a % i != 0&&a/a==1) {
                    System.out.println(a);


                }


            }




        }
    }


}
