import java.util.ArrayList;






public class ObserverDesignPattern {
    public static void main(String[] args) {
        Product samsungLEDTV = new Product("Samsung LED TV", "LED TV", "60000RS", "Not available");
        Person david = new Person("David", samsungLEDTV);
        Person john = new Person("John", samsungLEDTV);

        ArrayList<Observer> subscribers = samsungLEDTV.getObservers();
        System.out.println("subscribers List : "+subscribers);

        for(Observer person : subscribers){
            System.out.println("This person has subscribed : "+((Person)person).getPersonName());
        }

        System.out.println();

        System.out.println("SamsungLED TV current state : "+samsungLEDTV.getAvailability());
        System.out.println();
        samsungLEDTV.setAvailability("Available");
    }
}
