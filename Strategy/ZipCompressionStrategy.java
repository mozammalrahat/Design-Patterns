import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy{

    @Override
    public void compressFiles(ArrayList<File> files, String compressedArchiveFileName) {
        System.out.println("Files are compressed using Zip approach: "+compressedArchiveFileName+"'.zip' file is created");
        
    }
    
}