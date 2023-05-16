package rulesEngine.better.rules;

import rulesEngine.better.IRule;
import rulesEngine.better.model.Choice;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    private final List<IRule> rules;

    public Validator() {
        rules = List.of(new AppleRule(), new SamsungRule(), new NokiaRule());
    }

    public List<String> validate(Choice choice) {
        if (choice == null) {
            return List.of("Recording is null");
        }

        List<String> validatedModels = new ArrayList<>();
        for (IRule rule : rules) {
            if (rule.matches(choice)) {
                validatedModels.add(rule.process(choice));
            }
        }
        return validatedModels;
    }

}
