package abstractFactory;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
interface GUIFactory {
    Component createButton();

    Component createList();
}