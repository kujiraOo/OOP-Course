package problem2;


import java.io.File;
import java.io.FilenameFilter;

public class FileByPatternFilter implements FilenameFilter {

    private String pattern;

    public FileByPatternFilter(String pattern) {

        this.pattern = pattern;
    }

    @Override
    public boolean accept(File dir, String name) {

        return name.matches(pattern);
    }
}
