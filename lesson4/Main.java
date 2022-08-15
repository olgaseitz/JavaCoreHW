package lesson4;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Adams", "3452334");
        phonebook.add("Bond", "4563454");
        phonebook.add("Clarks", "4533454");
        phonebook.add("Clarks", "4512354");
        phonebook.add("Davidson", "7653445");
        phonebook.add("Johnson", "7632321");
        phonebook.add("Henderson", "1632321");
        phonebook.add("Tucker", "8723565");
        phonebook.add("Tucker", "4563421");
        phonebook.add("Tucker", "8764565");

        System.out.println("-----------------");
        System.out.println("Adams");
        System.out.println(phonebook.get("Adams"));
        System.out.println("Clarks");
        System.out.println(phonebook.get("Clarks"));
        System.out.println("Tucker");
        System.out.println(phonebook.get("Tucker"));

    }
}
