package rulesEngine.better;

import java.util.List;
import java.util.Scanner;
import rulesEngine.better.model.BrandType;
import rulesEngine.better.model.Choice;
import rulesEngine.better.rules.Validator;

public class Main {

  private static final Scanner keyboard = new Scanner(System.in);


  public static void main(String[] args) {

    Validator validator = new Validator();

    System.out.println("Which brand of phone do you want as a prize? ");
    String input = keyboard.next();
    BrandType brandType = BrandType.fromString(input);
    Choice choice = new Choice(brandType);

    List<String> validate = validator.validate(choice);

    System.out.println("Congrats you won: ");
    System.out.println(validate);

  }
}