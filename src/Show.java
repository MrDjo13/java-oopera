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
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Актёра с фамилией " + surname + " нет в спектакле!");
        } else {
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