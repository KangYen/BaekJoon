import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
*
* readLine()은 한 행을 전부 읽기 때문에 공백 단위로 입력해 준 문자열을 공백 단위로
* 분리해주어야 문제를 풀 수 있다.
* */
public class Ex4_24c {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));
    }
}
