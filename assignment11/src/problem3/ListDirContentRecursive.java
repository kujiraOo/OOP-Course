// A program which receives the name of a directory from the keyboard and 
// prints out the content of the directoy and all its subdirectories. Hint: 
// use recursion to solve the problem

package problem3;

import java.io.File;
import java.util.Scanner;

public class ListDirContentRecursive {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter path to a directory");
		
		String dirPath = sc.nextLine();
		
		File dir = new File(dirPath);
		
		listContents(dir);
	}
	
	private static void listContents(File dir) {
		
		
		
		if (dir.exists()) {
			
			System.out.println("\nDIRECTORY: " + dir.getPath() + "\n");
			
			if (dir.isDirectory()) {
				
				String[] containedFileNames = dir.list();
				
				for (int i = 0; i < containedFileNames.length; i++) {
					
					String fileName = containedFileNames[i];
					
					File file = new File(dir.getPath() + File.separator + fileName);
					
					if (file.isDirectory()) {
						listContents(file);
					} else {
						System.out.println(file.getName());
					}
				}
				
				
			} else {
				System.out.println("Is not a directory");
			}
			
		} else {
			System.out.println("Directory doesn't exist");
		}
		
		
		
	}

}
