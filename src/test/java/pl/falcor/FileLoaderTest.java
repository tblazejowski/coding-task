package pl.falcor;

import org.testng.Assert;
import org.testng.annotations.Test;

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
}