public class Person {
private String name;
private String desingation;

    public Person() {
    }

    public Person(String name, String desingation) {
        this.name = name;
        this.desingation = desingation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesingation() {
        return desingation;
    }

    public void setDesingation(String desingation) {
        this.desingation = desingation;
    }
    public void learn (){
        System.out.println("To office");
    }
    public void walk(){
        System.out.println("On street");
    }
    public void eat (){
        System.out.println("All food");
    }

    @Override
    public String toString() {
        return "Person\n" +
                "name: " + getName() +
                "\ndesingation: " + getDesingation() ;
    }
}
