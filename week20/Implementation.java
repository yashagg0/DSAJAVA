package week20;

public class Implementation {
    public static void main(String[] args) {
        Tries t = new Tries();
        t.insert("Nick");
        t.insert("Night");
        t.insert("Cat");
        t.insert("Knife");

        System.out.println(t.search("Cat"));
        System.out.println(t.search("Cats"));
    }
}
