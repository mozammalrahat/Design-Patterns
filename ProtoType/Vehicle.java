import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable{

    private List<String> vehicleList;

    public Vehicle(){
        this.vehicleList = new ArrayList<String>();
    }
    public Vehicle(List<String> list){
        this.vehicleList = list;
    }

    public void insertData(){
        vehicleList.add("Honda");
        vehicleList.add("Mazda");
        vehicleList.add("BMW");
        vehicleList.add("MERCEDES");
        vehicleList.add("FERARI");
    }

    public List<String> getVehicleList(){
        return this.vehicleList;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    @Override
    public String toString() {
        return "Vehicle [vehicleList=" + vehicleList + "]";
    }

}