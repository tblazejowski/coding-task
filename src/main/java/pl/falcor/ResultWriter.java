package pl.falcor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class ResultWriter {

    private String file;

    ResultWriter(String file) {
        this.file = file;
    }

    void writeResultToFile(String result) {
        System.out.println("Result written to file: ./src/test/resources/" + file);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("./src/test/resources/" + file))) {
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
