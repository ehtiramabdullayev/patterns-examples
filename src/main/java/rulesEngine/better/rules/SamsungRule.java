package rulesEngine.better.rules;

import rulesEngine.better.IRule;
import rulesEngine.better.model.BrandType;
import rulesEngine.better.model.Choice;

public class SamsungRule implements IRule {

  public boolean matches(Choice input) {
    return input.getOsType().equals(BrandType.SAMSUNG) || input.getOsType().equals(BrandType.ALL);
  }

  public String process(Choice input) {

    input.setModel("Samsung Galaxy 22");
    return input.getModel();
  }
}