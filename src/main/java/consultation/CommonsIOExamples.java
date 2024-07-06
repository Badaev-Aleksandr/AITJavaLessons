package consultation;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.FileFilterUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Slf4j
public class CommonsIOExamples {
    public static void main(String[] args) {
        File directory = new File("testFolder");
        File testFile = new File("testFile.txt");
        File testFile2 = new File("testFile2.txt");
        try {
            FileUtils.forceMkdir(directory);
            log.info("Directory created");
            FileUtils.writeStringToFile(testFile, "Hello Java \n", "UTF-8", true);
            log.info("Запись прошла успешно");
            List<String> lines = FileUtils.readLines(testFile, "UTF-8");
            for (String line : lines) {
                System.out.println(line);
            }
            boolean result = FileUtils.contentEquals(testFile, testFile2);
            System.out.println(result);
            System.out.println("-------------------------");
            try (LineIterator lineIterator = FileUtils.lineIterator(testFile, "UTF-8")) {
                while (lineIterator.hasNext()) {
                    String line = lineIterator.nextLine();
                    System.out.println(line);
                }
            }
            IOUtils.copy(new FileInputStream(testFile), new FileOutputStream(testFile2));
            IOUtils.close();

           FileFilter fileFilter = FileFilterUtils.suffixFileFilter(".txt");
           File[] files = directory.listFiles(fileFilter);
           for (File file: files){
               System.out.println(file.getName());
           }
            FileUtils.delete(directory);
            log.info("Directory deleted");
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
