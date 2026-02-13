package Week2Assignments.assignment8;
import java.io.*;

	
	class User implements Serializable {
	   String username;
	   String email;
	   transient String password;

	    public User(String username, String email, String password) {
	        this.username = username;
	        this.email = email;
	        this.password = password;
	    }

	    @Override
	    public String toString() {
	        return "User{" +
	                "username='" + username + '\'' +
	                ", email='" + email + '\'' +    
	                ", password='" + password + '\'' +
	                '}';
	    }
	}
	public class Assignment8 {
	    public static void main(String[] args) throws IOException {

	        User user = new User("dhiraj_11","d.shelke2003@gmail.com","c12321");

	        //Serialize Object
	        try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Coditas-Admin\\Downloads\\test.txt");
	             ObjectOutputStream outputStream = new ObjectOutputStream(fileOut)) {

	            outputStream.writeObject(user);
	            System.out.println(user);

	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }

	        //Deserialize Object
	        try(FileInputStream fileIn = new FileInputStream("C:\\\\Users\\\\Coditas-Admin\\\\Downloads\\\\test.txt");
	        ObjectInputStream inputStream = new ObjectInputStream(fileIn)){

	            User user2 = (User)inputStream.readObject();
	            System.out.println(user2);
	        } catch (ClassNotFoundException e) {
	            throw new RuntimeException(e);
	        }
	    }

	}

	
	
