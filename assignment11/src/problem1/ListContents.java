//A program, which reads the name of a directory as a command line
// argument and for each file inside the directory prints the following
// information: name, length and last modification time.

package problem1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ListContents {

    static private SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy kk:mm:ss");

    public static void main(String[] args) {

        try {

            File dir = new File(args[0]);

            if (dir.exists()) {
                if (dir.isDirectory()) {

                    listContent(dir);

                } else {
                    System.out.println("Specified argument is not a directory");
                }
            } else {
                System.out.println("Directory doesn't exist");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please specify name of a directory as a command line parameter");
        }
    }

    private static void listContent(File dir) {
        String[] fileNames = dir.list();

        for (int i = 0; i < fileNames.length; i++) {

            File file = new File(dir.getPath() + File.separator + fileNames[i]);

            System.out.println(file.getName() +
                    "\n" + file.length() +
                    "\n" + sdf.format(new Date(file.lastModified())) +
                    "\n");
        }
    }

}
