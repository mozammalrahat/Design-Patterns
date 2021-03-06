import java.io.File;
import java.util.ArrayList;

public class CompressionContext{
    private CompressionStrategy strategy;

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(ArrayList<File>files, String compressedArchiveFileName){

        strategy.compressFiles(files, compressedArchiveFileName);
    }
    
}