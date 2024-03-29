package rulesEngine.better.rules;

import rulesEngine.better.IRule;
import rulesEngine.better.model.BrandType;
import rulesEngine.better.model.Choice;

public class AppleRule implements IRule {

    public boolean matches(Choice input) {
        return input.getBrandType().equals(BrandType.APPLE) || input.getBrandType().equals(BrandType.ALL);
    }

    public String process(Choice input) {
        input.setModel("IPhone 13 Max Pro");
        return input.getModel();
    }
}
