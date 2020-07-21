package _06_duck;

public class AnimalRunner {
public static void main(String[] args) {
	Duck daffy = new Duck ("corn", 5);
	daffy.quack();
	daffy.waddle();
	Elephant bob = new Elephant (2, "Mud Pit");
	bob.mudbath();
	bob.eat();
}
}
