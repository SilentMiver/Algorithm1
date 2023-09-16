import java.util.Objects;

public class Minion {
    int age;
    String name;

    public Minion(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minion minion = (Minion) o;
        return age == minion.age && Objects.equals(name, minion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Minion{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
