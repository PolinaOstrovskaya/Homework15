import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static class AnimalCollection {
        private List<String> animals;

        public AnimalCollection() {
            animals = new ArrayList<>();
        }

        public void addAnimal(String animal) {
            animals.add(animal);
        }

        public void removeAnimal() {
            if (!animals.isEmpty()) {
                animals.remove(0);
            }
        }

        public void showAnimals() {
            for (String animal : animals) {
                System.out.println(animal);
            }
        }
    }
}



