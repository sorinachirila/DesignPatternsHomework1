package creational.factorymethod.homework;

public class FileConverterFactoryDemo {
    public static void main(String[] args) {

        FileConverterFactory fileConverterFactory = new FileConverterFactory();
        FileConverter fileConverter = null;

        fileConverter = fileConverterFactory.buildConvertedFile("ASCII");
        fileConverter.convertFile();
        //Converting to an ascii file...

        fileConverter = fileConverterFactory.buildConvertedFile("PS");
        fileConverter.convertFile();
        //Converting to a postscript file...

        fileConverter = fileConverterFactory.buildConvertedFile("PDF");
        fileConverter.convertFile();
        //Converting to a pdf file...

    }
}
