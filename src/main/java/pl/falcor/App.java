package pl.falcor;

class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("To execute please provide absolute or relative file path as one argument");
        } else {
            FileLoader fileLoader = new FileLoader(args[0]);
            VowelsMap vowelsMap = new VowelsMap(fileLoader.readFromFile());
            ResultWriter resultWriter = new ResultWriter("output.txt");
            resultWriter.writeResultToFile(vowelsMap.getStats().toString());
        }
    }
}