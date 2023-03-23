package rulesEngine.old;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import rulesEngine.better.model.BrandType;
import rulesEngine.better.model.Choice;

public class Main {

  private static final Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Which brand of phone do you want as a prize? ");
    String input = keyboard.next();
    BrandType brandType = BrandType.fromString(input);
    Choice choice = new Choice(brandType);
    List<String> prizes = new ArrayList<>();
    if (choice.getOsType() == BrandType.ALL) {
      prizes.add("Nokia 1100");
      prizes.add("Samsung Galaxy 22");
      prizes.add(("IPhone 13 Max Pro"));
    } else if (choice.getOsType() == BrandType.SAMSUNG) {
      prizes.add("Samsung Galaxy 22");
    } else if (choice.getOsType() == BrandType.APPLE) {
      prizes.add(("IPhone 13 Max Pro"));
    } else if (choice.getOsType() == BrandType.NOKIA) {
      prizes.add("Nokia 1100");
    } else if (choice.getOsType() == BrandType.ANY) {
      prizes.add("Siemens M65");

    } else {
      prizes.add(null);
    }
    System.out.println(prizes);
  }

}
