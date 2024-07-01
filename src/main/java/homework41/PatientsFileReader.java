package homework41;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
1. Чтение медицинских записей
 Цель:
 Разработать программу на Java для чтения данных о пациентах из текстового файла и вывода этой информации на экран.

  Описание задачи:
 Формат данных в файле: Каждая строка файла содержит данные одного пациента, разделённые запятыми: ФИО, возраст,
 диагноз, дата последнего визита.
 Требования к программе:
 Прочитать данные из файла.
 Отобразить данные в консоли в удобочитаемом формате.
 Обработать возможные ошибки при чтении файла, например, если файл не найден или повреждён.
  Используемые технологии:
- FileReader для построчного чтения файла.
- BufferedReader для буферизации данных, что ускоряет чтение.
- Обработка исключений IOException и FileNotFoundException.
 */
@Slf4j
public class PatientsFileReader {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/patients.txt"))) {

            int data;
            while ((data = bufferedReader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error(exception.getMessage(), exception);
        }
    }
}
