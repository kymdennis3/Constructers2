public class Main {
    public static void main(String[] args) {

        Human human = new Human("Rick", 65, 70.0);
        Human human1 = new Human("Morty", 16, 50);
        //System.out.println(human.age);
        //System.out.println(human.name);
        //System.out.println(human.weight);

        /*System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.weight);*/

        human1.eat();
        human.drink();
    }
}