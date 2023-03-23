package rulesEngine.better.rules;

import rulesEngine.better.IRule;
import rulesEngine.better.model.BrandType;
import rulesEngine.better.model.Choice;

public class NokiaRule implements IRule {

  @Override
  public boolean matches(Choice input) {
    return input.getOsType() == BrandType.NOKIA || input.getOsType() == BrandType.ANY;
  }

  @Override
  public String process(Choice input) {
    input.setModel("Nokia 11");
    return input.getModel();
  }
}
