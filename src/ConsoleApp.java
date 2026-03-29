import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConsoleApp {
    private Map<String,String> contacts = new HashMap<>();

    public ConsoleApp(Map<String, String> contacts) {
        this.contacts = new HashMap<>(contacts);
    }

    public ConsoleApp() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    public Optional<String> getName(String name) {
        return Optional.ofNullable(contacts.get(name));
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println(name + " was deleted from contacts");
        }
        else {
            System.out.println("There is no such contact");
        }
    }
    public void list() {
        for(Map.Entry<String,String> contact: contacts.entrySet()) {
            System.out.println(contact.getKey() + ": " + contact.getValue());
        }
    }


}
