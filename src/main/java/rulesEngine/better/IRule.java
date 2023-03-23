package rulesEngine.better;

import rulesEngine.better.model.Choice;

public interface IRule {
  boolean matches(Choice input);
  String process(Choice input);
}