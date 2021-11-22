public class FacadeDesignPattern {
    
    public static void main(String[] args) {
        System.out.println("Facade:");
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
    }
    
}
