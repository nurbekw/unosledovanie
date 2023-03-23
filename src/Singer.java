public class Singer extends Person {
    private String name;
    private String desingation;

    public Singer() {
    }

    public Singer(String name, String desingation, String name3, String desingation3) {
        super(name, desingation);
        this.name = name3;
        this.desingation = desingation3;
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

    public void bandName() {
        System.out.println("Band name: Crips");
    }

    @Override
    public void learn() {
        System.out.println("Learning: Singer learn in House");
    }

    @Override
    public void eat() {
        System.out.println("Eating: All food");
    }

    @Override
    public void walk() {
        System.out.println("Walking: On street");
    }

    public void singing() {
        System.out.println("Singing: Normal");
    }

    public void playGitar() {
        System.out.println("Play gitar: Nice");
    }

    @Override
    public String toString() {
        return "\tSinger\n" +
                "name: " + getName() +
                "\ndesingation: " + getDesingation();
    }
}
