import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task2.AnimalCollection animalCollection = new Task2.AnimalCollection();
        animalCollection.addAnimal("Dog");
        animalCollection.addAnimal("Cat");
        animalCollection.addAnimal("Elephant");
        animalCollection.showAnimals();
        animalCollection.removeAnimal();
        animalCollection.addAnimal("Bird");
        animalCollection.showAnimals();
        List<Double> grades1 = new ArrayList<>();
        grades1.add(4.5);
        grades1.add(3.8);
        grades1.add(4.2);
        List<Double> grades2 = new ArrayList<>();
        grades2.add(3.2);
        grades2.add(3.9);
        grades2.add(2.8);

        List<Task3.Student> students = new ArrayList<>();
        students.add(new Task3.Student("John", "Group1", 1, grades1));
        students.add(new Task3.Student("Alice", "Group1", 2, grades2));
        students.add(new Task3.Student("Bob", "Group2", 1, grades2));

        Task3.Student.removeLowPerformingStudents(students);
        Task3.Student.printStudents(students, 2);
    }
}