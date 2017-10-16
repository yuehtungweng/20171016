public class PI {
    public static void main(String[] args) {

        java.util.Scanner sc =new java.util.Scanner(System.in);

        final  double PI = 3.1415926;

        float r=sc.nextFloat();
        float h=sc.nextFloat();

        System.out.println(PI*Math.pow(r,2)*h);
    }
}
