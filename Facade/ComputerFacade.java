public class ComputerFacade{

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start(){
        cpu.processData();
        memory.load();
        hardDrive.readdata();
    }

}