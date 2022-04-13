package object;

class Book implements Cloneable{
    String title;
    String author;

    public Book(String title, String author){

        this.title = title;
        this.author = author;

    }

    @Override
    public String toString() {
        return author + ", " + title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        // 이 메소드는 직접 불리는 메소드가 아니고, 이 객체가 힙 메모리에서 해제 될때 가비지 콜렉터에서 호출(수행)되는 메소드
        // 이 메소드가 정의가 되어 있으면 가비지 콜렉터에서 이 메소드를 수행한다(리소스 해제, 소켓 닫기)
        super.finalize();
    }
    
    
    
}
 
public class ToStringTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("토지", "박경리");
        System.out.println(book);

        // String str = new String("토지");
        // System.out.println(str.toString());

        Book book2 = (Book)book.clone();
        System.out.println(book2);
    }
}
