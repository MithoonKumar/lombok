import lombok.val;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setfName(null);
        } catch (Exception e) {
            System.out.println(e);
        }
        val name = "Mithoon Kumar";
        System.out.println("Hello world");
    }
}
