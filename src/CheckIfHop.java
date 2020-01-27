public class CheckIfHop implements CheckTrait {
    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }
}
