public class Sephian {
    void status () {
        System.out.println("Sephian IS Live Object!");
    }
}
class Human extends Sephian {
    @Override
    void status() {
        System.out.println("Human IS Live Object!");
    }
}
class Man extends Human {
    @Override
    void status() {
        System.out.println("Man IS Live Object!");
    }
}
class Nalaka extends Man {
    @Override
    void status() {
        System.out.println("Naaka IS Live Object!");
    }
}
class Test {
    public static void main(String[] args) {
        Sephian s = new Sephian();
        Sephian h = new Human();
        Sephian m = new Man();
        Sephian n = new Nalaka();
        s.status();
        h.status();
        m.status();
        n.status();
    }
}