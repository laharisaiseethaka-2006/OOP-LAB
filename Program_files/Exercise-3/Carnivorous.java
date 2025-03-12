class Animal {
        private String name;
        public Animal(String name) {
           this.name = name;
    }
        public void makeSound() {
           System.out.println(name + " makes a sound.");
    }
        public String getName() {
           return name;
    }
}
class Dog extends Animal {
        public Dog(String name) {
           super(name);
    }
        public void makeSound() {
           System.out.println(getName() + " barks.");
    }
}

public class Carnivorous {
        public static void main(String[] args) {
           Dog dog = new Dog("Buddy");
           dog.makeSound();  
           Animal animal = new Animal("Generic Animal");
           animal.makeSound();  
    }
}