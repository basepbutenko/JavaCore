package Courses;

public final class SimpleImmutableClass {
    private final int id;
    private final String FirsName;

    public SimpleImmutableClass(int id, String firsName) {
        this.id = id;
        FirsName = firsName;
    }

    public int getId() {
        return id;
    }

    public String getFirsName() {
        return FirsName;
    }
}
