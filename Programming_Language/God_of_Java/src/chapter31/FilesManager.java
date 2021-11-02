package chapter31;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilesManager {
    public static void main(String[] args) {
        FilesManager sample = new FilesManager();
        String fileName = "AboutThisBook.txt";
        Path fromPath = sample.writeAndRead(fileName);
        sample.copyMoveDelete(fromPath,fileName);
    }

    public List<String> getContents() {
        List<String> contents = new ArrayList<>();
        contents.add("이 책은 저자의 6번째 책입니다.");
        contents.add("필자의 수년간의 자바 경험을 바탕으로 집필되었습니다.");
        contents.add("많은 분들에게 도움이 되면 좋겠습니다.");
        contents.add("책에 대한 질문은 god@godofjava.com으로 문의 주시기 바랍니다.");
        contents.add("Current Data=" + new Date());
        return contents;
    }

    public Path writeFile(Path path) throws Exception {
        Charset charset = Charset.forName("EUC-KR");
        List<String> contents = getContents();
        StandardOpenOption openOption = StandardOpenOption.CREATE;
        return Files.write(path, contents, charset, openOption);
    }

    public void readFile(Path path) throws Exception {
        Charset charset = Charset.forName("EUC-KR");
        System.out.println("Path=" + path);
        List<String> fileContents = Files.readAllLines(path, charset);
        for (String tempContents : fileContents) {
            System.out.println(tempContents);
        }
        System.out.println();
    }

    public Path writeAndRead(String fileName) {
        Path returnPath = null;
        try {
            Path path = Paths.get(fileName);    // Write a text file
            returnPath = writeFile(path);

            System.out.println("***** Created file contents *****");

            readFile(returnPath);   // Read written file
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnPath;
    }

    public void copyMoveDelete(Path fromPath, String fileName) {
        try {
            Path toPath = fromPath.toAbsolutePath().getParent();

            // Make a directory if it is not exist
            Path copyPath = toPath.resolve("copied");
            if (!Files.exists(copyPath)) {
                Files.createDirectories(copyPath);
            }
            // Copy Path
            Path copiedFilePath = copyPath.resolve(fileName);
            StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;
            Files.copy(fromPath, copiedFilePath, copyOption);

            // Read copied file
            System.out.println("***** Copied file contents *****");
            readFile(copiedFilePath);

            // Move file
            Path movedFilePath = Files.move(copiedFilePath, copyPath.resolve("moved.txt"), copyOption);

            // Delete Files
            Files.delete(movedFilePath);
            Files.delete(copyPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
