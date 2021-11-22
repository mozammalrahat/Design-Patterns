public class RealImage implements Image{

    private String filename = null;

    public RealImage(final String FILENAME){
                filename = FILENAME;
                loadImageFromDisk();        
    }

    private void loadImageFromDisk(){
        System.out.println("  Loading "+ filename);
    }


    @Override
    public void displayImage() {
        System.out.println(" Displaying "+ filename+"\n");
        
    }
    
}
