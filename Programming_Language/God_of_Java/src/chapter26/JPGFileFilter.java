package chapter26;

import java.io.File;
import java.io.FileFilter;

public class JPGFileFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        if (file.isFile()) {
            String fileName = file.getName();
            return fileName.endsWith(".jpg");
        }
        return false;
    }
}
