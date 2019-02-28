package creational.factorymethod.course;

public class PostScriptConverter implements FileConverter{
    public void convertFile() {
        System.out.println("Converting to a postscript file...");
    }
}
