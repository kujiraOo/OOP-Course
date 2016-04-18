// Improve your solution for the previous problem so that you
// filter the content of the directory by specifying a pattern
// for file name or file length. To do this define two different filters;
// one which filters file name and another, which filters file length.

package problem2;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ListContents {

    static private SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy kk:mm:ss");

    public static void main(String[] args) {

        try {

            File dir = new File(args[0]);
            String filterType = args[1];
            String filterValue = args[2];

            if (dir.exists()) {
                if (dir.isDirectory()) {

                    listContent(dir, filterType, filterValue);

                } else {
                    System.out.println("Specified argument is not a directory");
                }
            } else {
                System.out.println("Directory doesn't exist");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage dir filterType filterValue");
        }
    }

    private static void listContent(File dir, String filterType, String filterValue) {

        String[] fileNames = dir.list(getFilterByType(filterType, filterValue));

        for (int i = 0; i < fileNames.length; i++) {

            File file = new File(dir.getPath() + File.separator + fileNames[i]);

            System.out.println(file.getName() +
                    "\n" + file.length() +
                    "\n" + sdf.format(new Date(file.lastModified())) +
                    "\n");
        }
    }

    private static FilenameFilter getFilterByType(String filterType, String filterValue) {

        if (filterType.equals("pattern")) {

            return new FileByPatternFilter(filterValue);

        } else if (filterType.equals("length")) {

            return new FileByLengthFilter(filterValue);

        } else {
            return null;
        }
    }
}
