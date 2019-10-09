package abstractFactory;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class Client {
    public Client(GUIFactory factory){
        Component button = factory.createButton();
        button.paint();

        Component list = factory.createList();
        list.paint();
    }
}
