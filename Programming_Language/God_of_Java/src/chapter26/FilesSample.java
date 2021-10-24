package chapter26;

import java.io.File;
import java.util.Date;

public class FilesSample {
    public static void main(String[] args) {
        FilesSample sample = new FilesSample();
        String pathName = File.separator + "develop" + File.separator + "text";
        sample.checkPath(pathName);
        sample.makeDir(pathName);
        sample.checkFileMethods(pathName);
        sample.canFileMethods(pathName);
        sample.lastModified(pathName);
    }

    public void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is exists? = " + file.exists());
    }

    public void makeDir(String pathName) {
        File file = new File(pathName);
        System.out.println("Make" + pathName + " result = " + file.mkdir());
    }

    public void checkFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is directory? = " + file.isDirectory());
        System.out.println(pathName + " is File? = " + file.isFile());
        System.out.println(pathName + " is Hidden()? = " + file.isHidden());
    }

    public void canFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + "can read? = " + file.canRead());
        System.out.println(pathName + "can write()? = " + file.canWrite());
        System.out.println(pathName + "can execute? = " + file.canExecute());
    }

    public void lastModified(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " last modified = " + new Date(file.lastModified()));
    }
}
