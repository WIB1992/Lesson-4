package packege;

public class Main {

    public static void main(String[] args) {
       worker a = new worker("Игорь", "Бурильщик", "5578", 100, 25);
       System.out.println(a.getName());
       System.out.println(a.getPosition());


        worker[] people = {a,
        new worker("Павел ", "Маркшейдер", "5589", 200, 30),
        new worker("Кирилл ", "Геолог", "5545", 300, 35),
        new worker("Богдан ", "Мастер", "5651", 400, 41),
        new worker("Виктор ", "Начальник", "6202", 500, 50)
        };

        for (int i = 0; i < people.length; i++)
            if (people[i].getAge() > 40) {
                System.out.println(people[i].getName() + people[i].getAge());
            }
    }

}
