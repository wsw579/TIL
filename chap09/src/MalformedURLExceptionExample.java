import java.net.URL;
import java.net.MalformedURLException;
// 컴파일러에서 예외를 주는 일반예외

public class MalformedURLExceptionExample {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("htp://www.example.com");
            System.out.println("프로토콜 " + url.getProtocol());
        } catch (MalformedURLException e) { // i/o exception 중 이 예외를 잡아냄
            System.out.println("잘못된 url 형식 " + e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
