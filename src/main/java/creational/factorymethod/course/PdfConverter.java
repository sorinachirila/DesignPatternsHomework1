package creational.factorymethod.course;

public class PdfConverter implements FileConverter {
    public void convertFile() {
        System.out.println("Converting to a pdf file...");
    }
}
