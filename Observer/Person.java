public class Person implements Observer{
    private String personName;

    public Person(String personName, Subject subject){
        this.personName = personName;
        subject.registerObserver(this);
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public void update(String availability) {
        System.out.println("Hello " + personName + ", Product is now "+availability+" on flipkart");
        
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    
}