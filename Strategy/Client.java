import java.io.File;
import java.util.ArrayList;


public class Client {
    public static void main(String[] args) {
        System.out.println("\n");
        ArrayList<File> fileList = new ArrayList<File>();
        fileList.add(new File("D:\\Javafiles\\Javadoc.txt"));
        fileList.add(new File("D:\\Javafiles\\Release.txt"));

        CompressionContext ctx = new CompressionContext();
        ctx.setStrategy(new RarCompressionStrategy());
        ctx.createArchive(fileList, "JavaFiles");
        System.out.println("\n");
        ctx = new CompressionContext();
        ctx.setStrategy(new ZipCompressionStrategy());
        ctx.createArchive(fileList, "JavaFiles");
    }  
}
