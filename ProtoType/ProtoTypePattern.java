public class ProtoTypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        // System.out.println("\n");
        // Vehicle vehicle = new Vehicle();
        // vehicle.insertData();
        // vehicle.getVehicleList().remove("BMW");
        // System.out.println(vehicle.toString());
        // Vehicle b = (Vehicle)vehicle.clone();
        // System.out.println(b);

        System.out.println("\n");
        VehicleDeep vehicle = new VehicleDeep();
        vehicle.insertData();
        VehicleDeep b = (VehicleDeep)vehicle.clone();
        vehicle.getVehicleList().remove("BMW");
        System.out.println(vehicle.toString());
        System.out.println(b);


        

    }
    
}
