package problem2;


import java.io.File;
import java.io.FilenameFilter;

public class FileByLengthFilter implements FilenameFilter {

    private int length = 0;

    public FileByLengthFilter(String length) {

        try {
            this.length = Integer.valueOf(length);
        } catch (NumberFormatException e) {
            System.out.println("Value of length filter must be an integer. Default value of 0 will be used");
        }

    }

    public FileByLengthFilter(int length) {

        this.length = length;
    }

    @Override
    public boolean accept(File dir, String name) {

        File file = new File(dir.getPath() + File.separator + name);

        if (file.exists() && file.length() == length)
            return true;
        else
            return false;
    }
}
