package rulesEngine.better.model;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum BrandType {
    SAMSUNG, APPLE, NOKIA, ANY, ALL;
    private static final Map<String, BrandType> CHOICE_TYPE_MAP =
            Stream.of(values())
                    .collect(Collectors.toMap(BrandType::toString,
                            Function.identity()));

    public static BrandType fromString(final String name) {
        BrandType choice = CHOICE_TYPE_MAP.get(name);
        if (null == choice) {
            throw new IllegalArgumentException(
                    String.format("Choice does not exist", name,
                            Arrays.asList(values())));
        }
        return choice;
    }
}
