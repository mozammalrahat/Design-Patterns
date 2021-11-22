import java.util.ArrayList;
import java.util.List;

public class VehicleDeep implements Cloneable{

    private List<String> vehicleList;

    public VehicleDeep(){
        this.vehicleList = new ArrayList<String>();
    }
    public VehicleDeep(List<String> list){
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
        List<String>templist = new ArrayList<>();
        for(String s : this.getVehicleList()){
            templist.add(s);
        }

        return new VehicleDeep(templist);
    }
    @Override
    public String toString() {
        return "Vehicle [vehicleList=" + vehicleList + "]";
    }

}