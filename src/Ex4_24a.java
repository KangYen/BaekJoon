import java.util.Scanner;
/*두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.*/
public class Ex4_24a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        if(A>B) System.out.println(">");
        else if(A<B) System.out.println("<");
        else System.out.println("==");
    }
}
