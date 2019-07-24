package pl.falcor;

class App {
	public static void main(String[] args) {
		FileLoader fileLoader = new FileLoader("src/test/resources/test1.txt");
		VowelsMap map = new VowelsMap(fileLoader.readFromFile());
		System.out.println(map.createVowelsMap());
	}
}