public class Programmer extends Person {
    private String name;
    private String desingation;

    public Programmer() {
    }

    public Programmer(String name, String desingation, String name1, String desingation1) {
        super(name, desingation);
        this.name = name1;
        this.desingation = desingation1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDesingation() {
        return desingation;
    }

    @Override
    public void setDesingation(String desingation) {
        this.desingation = desingation;
    }
    public void companyName(){
        System.out.println("Company name: Anonymus");
    }

    @Override
    public void learn() {
        System.out.println("Learning: On office of programmers");
    }

    @Override
    public void eat() {
        System.out.println("Eating: All food");
    }

    @Override
    public void walk() {
        System.out.println("Walking: Ewerywhere");
    }
    public void coding(){
        System.out.println("Coding: Very nice");
    }

    @Override
    public String toString() {
        return "\tProgrammer\n" +
                "name: " + getName() +
                "\ndesingation: " + getDesingation();
    }
}
