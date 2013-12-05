import java.util.Random;
import java.util.Scanner;
import java.io.*;
// import java.io.File;
// import java.IOException;


public class studentGrouping {


	public static void main(String[] args) throws IOException{
		File file = new File("class.csv");
		Scanner s = new Scanner(System.in);
		Scanner scan = new Scanner(file);
		System.out.println("Press 1 for random student, Press two for a group of 2");
		int num = s.nextInt();
		String [] students = scan.nextLine().split(",");
		Random r = new Random();
		int firstName = r.nextInt(students.length);
		int secondName = r.nextInt(students.length);
		if (num == 1) {
			System.out.println(students[firstName]);
		}

		if (num == 2) {
			System.out.println("How many groups do you want?");
			int groupNum = s.nextInt();
			for (int i = students.length -1; i>0; i--) {
				String a = students[i];
				int temp = r.nextInt(i);
				students[i] = students[temp];
				students[temp] = a;
			}
			int name = 0;

			for (int i = 0; i < students.length; i++) {

				for (int x = 0; x < groupNum; x++) {

					System.out.println(students[name] + " ");
					name++;
				}
				System.out.println();
			}
		}

		
	}
}	

// 	public static String randomStudent() {
// 		int studentLength;
// 		String [] students;
// 		int randomStudent;
// 		String chosenStudent;
// 		Random r = new Random();

// 		for (int i = 0; i< students.length(); i++) {
// 			studentLength++;
// 		}
// 		randomStudent = r.nextInt(students.length());
// 		chosenStudent = students[randomStudent];
// 		return chosenStudent;
// 	}

// 	private static String [] loadFile() {
// 		try{
// 			File file = new file("class.csv");
// 			Scanner a = new Scanner(file);
// 			randomStudent();

// 		}  catch (IOException e) {
// 			System.out.println("could not load name");
// 			System.exit(1);
// 		}
// 	}

// }