package lesson42;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FileUtil {
    public static void main(String[] args) {
        File directory = new File("src/main/resources/testUtil");
        File directoryNew = new File("src/main/resources/testUtilJava");
        Path path = directoryNew.toPath();
        boolean result = directory.mkdir();
        System.out.println(result);

        System.out.println("canRead " + directory.canRead());
        System.out.println("canWrite " + directory.canWrite());
        System.out.println("getParent " + directory.getParent());
        System.out.println("exists " + directory.exists());
        System.out.println("getPath " + directory.getPath());
        System.out.println("getAbsolutePath " + directory.getAbsolutePath());
        System.out.println("getTotalSpace " + directory.getTotalSpace());
        System.out.println("getUsableSpace " + directory.getUsableSpace());
        System.out.println("isDirectory " + directory.isDirectory());
        System.out.println("isFile " + directory.isFile());
        //скрытая ли папка
        System.out.println("isHidden " + directory.isHidden());
        System.out.println("renameTo " + directory.renameTo(directoryNew));


        File[] filesInDirectory = directory.listFiles();
        for (File fileInDirectory : filesInDirectory) {
            System.out.println(fileInDirectory.getName());
        }
        // можно удалить директорию если в ней нет файлов
        boolean deleteResult = directory.delete();
        System.out.println(deleteResult);

        try {
            Files.delete(path);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
