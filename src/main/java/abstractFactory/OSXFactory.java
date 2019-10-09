package abstractFactory;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class OSXFactory implements GUIFactory {

    public Button createButton() {
        return new OSXButton();
    }

    public Component createList() {
        return new OSXList();
    }
}