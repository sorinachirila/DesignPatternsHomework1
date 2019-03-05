package creational.factorymethod.homework;

public class FileConverterFactory {

    public FileConverter buildConvertedFile(String typeOfFileConverter) {

        FileConverter fileConverter = null;

        if (typeOfFileConverter.equals("ASCII")) {
            fileConverter = new AsciiConverter();
        }

        if (typeOfFileConverter.equals("PS")) {
            fileConverter = new PostScriptConverter();
        }

        if (typeOfFileConverter.equals("PDF")) {
            fileConverter = new PdfConverter();
        }

        return fileConverter;
    }
}
