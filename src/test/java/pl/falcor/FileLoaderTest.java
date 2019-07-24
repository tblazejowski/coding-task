package pl.falcor;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pl.falcor.io.FileLoader;

import java.util.HashMap;

@Test
public class FileLoaderTest {

    public void shouldConfirmSizeOfWordsReadToMapWhenWordsDoNotRepeat(){

        FileLoader fileLoader = new FileLoader("src/test/resources/test1.txt");

        Assert.assertEquals(fileLoader.readFromFile().size(), 4);
    }

    public void shouldConfirmSizeOfWordsReadToMapWhenWordsDoRepeat(){

        FileLoader fileLoader = new FileLoader("src/test/resources/test2.txt");

        Assert.assertEquals(fileLoader.readFromFile().size(), 14);
    }

    public void shouldConfirmMapIsEmptyWhenFileIsEmpty(){

        FileLoader fileLoader = new FileLoader("src/test/resources/test3.txt");

        Assert.assertEquals(fileLoader.readFromFile().size(), 0);
    }

    @DataProvider(name = "correctWordsCountOccurrence")
    public static Object[][] correctWordsCountOccurrence(){
        return new Object[][]{
                {"here", 2},
                {"a", 1},
                {"i", 2},
                {"say", 1},
                {"do", 1},
                {"many", 1},
                {"lot", 1},
                {"how", 1},
                {"cars", 2},
                {"see", 2},
                {"would", 1},
                {"of", 1},
                {"hundreds", 1},
                {"you", 1},
        };
    }

    @Test(dataProvider = "correctWordsCountOccurrence")
    public void shouldConfirmCorrectWordsOccurrenceStoredInMap(String word, Integer occurrence) {

        FileLoader fileLoader = new FileLoader("src/test/resources/test2.txt");

        HashMap<String, Integer> wordsMap = fileLoader.readFromFile();

        Assert.assertEquals(wordsMap.get(word), occurrence);
    }
}