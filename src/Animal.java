public class Animal {
    void eat() {

    }
}
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Eating Any Food!");
    }
}
class Loin extends Animal {
    @Override
    void eat() {
        System.out.println("Eating Only meet!");
    }
}
class RunCode {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal l = new Loin();
        d.eat();
        l.eat();
    }
}