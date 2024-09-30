import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class input {
	public static void main(String[] args) throws IOException {
//_____________________outputs___________________________
		String name = "Humaira";
		String hobbies = "watching films";
		int age = 22;
		System.out.println("My name is " + name);
		System.out.printf("I am %d years old\n", age);
		System.out.print("My hobbies are " + hobbies);
		System.out.println();
//_______________________input______________________________
		Scanner input = new Scanner(System.in);
		System.out.println("WHat is your name?");
		String userName = input.next();
		System.out.printf("Hello %s! It's nice to meet you.", userName);
		System.out.println();
//________________________FileReader______________________________
		String filePath = "C:\\Users\\Samir Haidari\\Documents\\java_file_reader.txt";
		FileReader reader = new FileReader(filePath);
		int counter = 0;
		while ((counter = reader.read()) != -1) {
			System.out.print((char) counter);
		}
		reader.close();
//_______________________FileWriter_________________________________
		FileWriter writer = new FileWriter("C:\\Users\\Samir Haidari\\Documents\\java_file_writer.txt");
		String outputText = "This is the text I have created with java and I wrote it in this file. \n Thank you! ";
		writer.write(outputText);
		writer.close();
//__________________________IOException__________________same example using try-catch_______
//without using throws IOException
		String statement = "Hello World! Yes";

		try {
			FileWriter output = new FileWriter("C:\\Users\\Samir Haidari\\Documents\\output.txt");
			output.write(statement);
			output.close();
		} catch (IOException e) {

			System.out.println("There has been an IO exception");
			System.out.println(e); // Prints the actual exception
		}
	}
}
