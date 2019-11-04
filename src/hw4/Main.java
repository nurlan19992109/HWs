package hw4;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "");
        Human mother = new Human("Jane", "Carleone", 1950);
        Human father = new Human("Vito", "Carleone", 1957);
        Human child = new Human("Michael", "Carleone", 1977, 75, pet, mother, father);
        child.print();
        pet.print();
    }
}
