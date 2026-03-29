import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле!");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                indices.add(i);
            }
        }

        if (indices.isEmpty()) {
            System.out.println("Актёра с фамилией " + surname + " нет в спектакле!");
        } else if (indices.size() > 1) {
            System.out.println("Найдено несколько актёров с фамилией " + surname + ". Замена не может быть выполнена.");
        } else {
            int index = indices.get(0);
            listOfActors.set(index, newActor);
            System.out.println("Актёр с фамилией " + surname + " заменён на " + newActor);
        }
    }

    public void printActorsList() {
        System.out.println("Список актёров спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
        System.out.println();
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля \"" + title + "\": " + director);
    }
}