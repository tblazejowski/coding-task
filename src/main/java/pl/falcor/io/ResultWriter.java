package pl.falcor.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResultWriter {

    private String file;

    public ResultWriter(String file) {
        this.file = file;
    }

    public void writeResultToFile(String result) {
        System.out.println("Result written to file: ./src/test/resources/" + file);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("./src/test/resources/" + file))) {
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
