package Day_5;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        emails.add("arun@gmail.com");
        emails.add("bob@gmail.com");
        emails.add("charlie@gmail.com");
        System.out.println(emails.add("david@gmail.com"));
        System.out.println("HashSet: " + emails);
    }
}
