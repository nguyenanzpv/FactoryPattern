public class mouse extends animal implements CanEat {

    @Override
    public void eat() {
        System.out.println("Mouse eat....");
    }

    @Override
    public void back() {
        System.out.println("Mouse back...");
    }
}
