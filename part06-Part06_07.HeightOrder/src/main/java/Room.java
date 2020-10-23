import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
       
    public Room() {
        this.people = new ArrayList<>();
        
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        return people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        Person shortest = people.get(0);
        for (Person person: people) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        // find the index of the shortest person in the arraylist;
        // remove and return the object at that index.
        if (this.people.isEmpty()) {
            return null;
        }
        return this.people.remove(people.indexOf(this.shortest()));
    }
   
}
