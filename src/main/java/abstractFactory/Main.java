package abstractFactory;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client(new OSXFactory());
        System.out.println(client);
    }
}
