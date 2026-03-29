import java.util.Objects;

public class Actor extends Person {
    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    /* если я правильно понял, то должно быть вот так:
    т.е. различие заключается только в порядке операций внутри выражения return */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                gender == actor.gender &&
                Double.compare(actor.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return super.toString() + " (" + height + " м)";
    }
}