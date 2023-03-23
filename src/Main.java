public class Main {
    public static void main(String[] args) {


        Programmer programmer = new Programmer();
        programmer.setName("David");
        programmer.setDesingation("Favorite");
        System.out.println(programmer);
        programmer.companyName();
        programmer.coding();
        programmer.learn();
        programmer.eat();
        programmer.walk();

        Dancer dancer = new Dancer();
        dancer.setName("Sara");
        dancer.setDesingation("Grateful");
        System.out.println(dancer);
        dancer.groupName();
        dancer.dancing();
        dancer.learn();
        dancer.eat();
        dancer.walk();

        Singer singer = new Singer();
        singer.setName("Boris");
        singer.setDesingation("Барыс");
        System.out.println(singer);
        singer.bandName();
        singer.singing();
        singer.playGitar();
        singer.learn();
        singer.eat();
        singer.walk();

    }
}