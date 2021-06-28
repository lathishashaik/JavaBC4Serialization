/*import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;*/
import java.io.*;

public class O1Runner {

	public static void main(String[] args) throws IOException {
		User user=new User();
		user.name="Bro";
		user.password="I<3pizza";
		
		user.sayHello();
		
		FileOutputStream fileOut=new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out=new ObjectOutputStream(fileOut);
		out.writeObject(user);
		System.out.println("object info saved!");
		
		out.close();
		fileOut.close();
	}

}
