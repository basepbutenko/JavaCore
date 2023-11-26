package Another;

import java.util.Objects;

public class DemoObject {
    int testField;

    public DemoObject(int testField) {
        this.testField = testField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoObject that = (DemoObject) o;
        return testField == that.testField;
    }

    @Override
    public int hashCode() {
        return Objects.hash(testField);
    }
}
