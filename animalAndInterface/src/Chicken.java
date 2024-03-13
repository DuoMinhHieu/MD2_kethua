public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cuc-taccc";
    }

    @Override
    public String howtoEat() {
        return "mổ thóc";
    }
}