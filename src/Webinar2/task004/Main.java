package Webinar2.task004;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, String> map = readFile("test.txt");
            replaceText(map);
            saveToFile("text1.txt", map);
        } catch (FileNotFoundException e) {
            System.out.println("Чтение файла не удалось");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Запись в файл не удалась");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Неверный формат записи");
            System.out.println(e.getMessage());
        }
    }

    private static void saveToFile(String filePath, Map<String, String> map) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            writer.write(entry.toString());
            writer.write("\n");
            writer.flush();
        }
        writer.close();
    }

    private static void replaceText(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            if (val.equals("?")) {
                entry.setValue(String.valueOf(key.length()));
            } else if (!val.matches("[0-9]+")) {
                throw new IllegalArgumentException("Ошибка в стороке: " + entry);
            }
        }
    }

    private static Map<String, String> readFile(String filePath) throws FileNotFoundException {
        Map<String, String> map = new LinkedHashMap<>();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] temp = line.split("=");
            map.put(temp[0], temp[1]);
        }
        scanner.close();
        return map;
    }
}
