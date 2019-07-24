package pl.falcor;

class App {
    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader("src/test/resources/test1.txt");
        VowelsMap vowelsMap = new VowelsMap(fileLoader.readFromFile());
        ResultWriter resultWriter = new ResultWriter("output.txt");
        resultWriter.writeResultToFile(vowelsMap.getStats().toString());
    }
}