package hello;
import org.common.MessageService;

public class helloworld {
	public static void main(String[] args) {
		System.out.println("Hello World !!");
		MessageService g = new MessageService();
		System.out.println(g.GetMessage());
	}
}
