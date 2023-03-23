public class Dancer extends Person {
    private String name;
    private String desingation;
    public Dancer(){
    }
    public Dancer(String name,String desingation,String name2,String desingation2){
        super(name, desingation);
        this.name = name2;
        this.desingation = desingation2;
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
    public void groupName(){
        System.out.println("Group name: Dancers");
    }

    @Override
    public void learn() {
        System.out.println("Learning: To dances");
    }

    @Override
    public void eat() {
        System.out.println("Eating: All food");
    }

    @Override
    public void walk() {
        System.out.println("Walking: On street");
    }
    public void dancing(){
        System.out.println("Dancing: mid");
    }

    @Override
    public String toString() {
        return "\tDancer\n" +
                "name: " + getName() +
                "\ndesingation: " + getDesingation() ;
    }
}
