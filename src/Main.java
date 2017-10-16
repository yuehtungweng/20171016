public class Main {

    public static void main(String[] args) {
	// write your code here
        java.util.Scanner sc =new java.util.Scanner(System.in);
                String str =sc.next();
                char c1 = sc.next().charAt(0);
                char c2 = sc.next().charAt(0);

                System.out.println(str.replace(c1,c2));
    }
}
