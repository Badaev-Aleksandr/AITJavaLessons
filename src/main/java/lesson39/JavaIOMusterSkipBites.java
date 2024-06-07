package lesson39;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
@Slf4j
public class JavaIOMusterSkipBites {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("passwords.txt")){
            //пропускаем первые 15 байтов
            inputStream.skip(15);
            int date;
            while ((date = inputStream.read()) != -1){
                System.out.print((char) date);
            }
        }catch (FileNotFoundException e){
            log.error(e.getMessage());
        }catch (IOException e){
            log.error(e.getMessage());
        }
    }
}
