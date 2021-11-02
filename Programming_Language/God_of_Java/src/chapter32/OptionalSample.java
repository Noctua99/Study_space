package chapter32;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalSample {
    public static void main(String[] args) {
        OptionalSample sample = new OptionalSample();
        sample.checkOptionalData();
    }

    private void createOptionalObjects() {
        Optional<String> emptyString = Optional.empty();
        String common = null;
        Optional<String> nullableString = Optional.ofNullable(common);
        common = "common";
        Optional<String> commonString = Optional.of(common);
    }

    private void checkOptionalData() {
        System.out.println(Optional.of("present").isPresent());
        System.out.println(Optional.ofNullable(null).isPresent());
    }

    private void getOptionalData(Optional<String> data) throws Exception {
        String defaultValue = "default";
        String result1 = data.get();
        String result2 = data.orElse(defaultValue);
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "GodOfJava";
            }
        };
        String result3 = data.orElseGet(stringSupplier);
        Supplier<Exception> exceptionSupplier = new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception();
            }
        };
        String result4 = data.orElseThrow(exceptionSupplier);
    }
}
