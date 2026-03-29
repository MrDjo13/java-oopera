public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Денис", "Родькин", Gender.MALE, 1.84);
        Actor actor2 = new Actor("Лидия", "Светозарова", Gender.FEMALE, 1.65);
        Actor actor3 = new Actor("Игорь", "Морозов", Gender.MALE, 1.75);

        Director director1 = new Director("Дмитрий", "Крестьянкин", Gender.MALE, 15);
        Director director2 = new Director("Марина", "Брусникина", Gender.FEMALE, 8);

        Person musicAuthor = new Person("Джузеппе", "Верди", Gender.MALE);
        Person choreographer = new Person("Вацлав", "Рейзингер", Gender.MALE);

        Show regularShow = new Show("Гамлет", 120, director1);
        Opera opera = new Opera("Травиата", 180, director2, musicAuthor,
                "Виолетта влюбляется в Альфреда, жертвует счастьем, умирает на его руках.", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director1, musicAuthor,
                "Принц Зигфрид влюбляется в Одетту‑лебедя и побеждает колдуна Ротбарта.", choreographer);

        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("-".repeat(50));
        regularShow.printDirectorInfo();
        regularShow.printActorsList();

        System.out.println("-".repeat(50));
        opera.printLibretto();
        opera.printDirectorInfo();
        opera.printActorsList();

        System.out.println("-".repeat(50));
        ballet.printLibretto();
        ballet.printDirectorInfo();
        ballet.printActorsList();

        System.out.println("-".repeat(50));
        System.out.println("!!! Замена актёра в балете !!!");
        ballet.replaceActor(actor2, "Морозов");
        ballet.printActorsList();

        System.out.println("-".repeat(50));
        System.out.println("!!! Попытка замены несуществующего актёра !!!");
        opera.replaceActor(actor1, "Васильева");
        opera.printActorsList();

    }
}