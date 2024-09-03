package rumah.kodingku.classess;

public class StringApp {

    public static void main(String[] args) {
        String name = "Rumah Kodingku";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Rumah"));
        System.out.println(name.endsWith("Kodingku"));

    }
}
