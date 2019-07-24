package pl.falcor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

class FileLoader {

    private final String file;
    private HashMap<String, Integer> wordsMap = new HashMap<>();

    FileLoader(String file) {
        this.file = file;
    }

    HashMap<String, Integer> readFromFile() {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String currentLine = reader.readLine();
            while (currentLine != null) {
                currentLine = currentLine.toLowerCase();
                String[] wordsArray = currentLine.replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String s : wordsArray) {
                    if (wordsMap.containsKey(s)) {
                        wordsMap.put(s, wordsMap.get(s) + 1);
                    } else {
                        wordsMap.put(s, 1);
                    }
                }
                currentLine = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsMap;
    }
}