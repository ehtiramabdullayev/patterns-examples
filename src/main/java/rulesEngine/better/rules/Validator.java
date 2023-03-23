package rulesEngine.better.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rulesEngine.better.IRule;
import rulesEngine.better.model.Choice;

public class Validator {

  private final List<IRule> rules;
  public Validator(){
    rules = Collections.unmodifiableList(Arrays.asList(new AppleRule(), new SamsungRule(), new NokiaRule()));
  }

  public List<String> validate(Choice choice){
    if (choice == null){
      return Arrays.asList("Recording is null");
    }

    List<String> validatedModels = new ArrayList<>();
    for ( IRule rule : rules){
      if(rule.matches(choice)){
        validatedModels.addAll(Collections.singleton(rule.process(choice)));
      }
    }
    return validatedModels;
  }

}
