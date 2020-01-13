public class cat extends animal implements CanEat {
    private String name;

    public cat(){

    }

    public cat(String name){
        this.name=name;
    }

    @Override
    public void eat() {
        System.out.println(name+" cat eat....");
    }

    @Override
    public void back() {
        System.out.println(name+" cat back....");
    }
}
