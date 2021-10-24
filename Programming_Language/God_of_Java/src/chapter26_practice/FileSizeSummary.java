package chapter26_practice;

import java.io.File;
import java.text.DecimalFormat;

public class FileSizeSummary {
    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "C:\\develop";
        long sum = sample.printDirectorySize(path);
        System.out.println(path + "'s total size=" + sample.convertFileLength(sum));
    }

    public long printFileSize(String dirName) {
        File dir = new File(dirName);
        long sum = 0;
        if (dir.isDirectory()) {
            File[] FileList = dir.listFiles();
            for (File tempFile : FileList) {
                if (tempFile.isFile()) {
                    String tempFileName = tempFile.getAbsolutePath();
                    long fileLength = tempFile.length();
                    System.out.println(tempFileName + "=" + convertFileLength(fileLength));
                    sum += fileLength;
                } else {
                    String tempDirName = tempFile.getAbsolutePath();
                    long fileLength = printFileSize(tempDirName);
                    System.out.println("[" + tempDirName + "]=" + convertFileLength(fileLength));
                    sum += fileLength;
                }
            }
        }
        return sum;
    }

    public long printDirectorySize(String dirName) {
        File dir = new File(dirName);
        long sum = 0;
        if (dir.isDirectory()) {
            File[] FileList = dir.listFiles();
            for (File tempFile : FileList) {
                if (tempFile.isFile()) {
                    String tempFileName = tempFile.getAbsolutePath();
                    long fileLength = tempFile.length();
                    sum += fileLength;
                } else {
                    String tempDirName = tempFile.getAbsolutePath();
                    long fileLength = printDirectorySize(tempDirName);
                    System.out.println("[" + tempDirName + "]=" + convertFileLength(fileLength));
                    sum += fileLength;
                }
            }
        }
        return sum;
    }

    private String convertFileLength(long fileLength) {
        DecimalFormat df = new DecimalFormat("0.00");
        if (fileLength <= 1024) {
            return fileLength + " b";
        } else if (fileLength <= 1024 * 1024) {
            return df.format(fileLength / 1024.0) + " kb";
        } else if (fileLength <= 1024 * 1024 * 1024) {
            return df.format(fileLength / 1024.0 / 1024) + " mb";
        } else {
            return df.format(fileLength / 1024.0 / 1024 / 1024) + " gb";
        }
    }
}
