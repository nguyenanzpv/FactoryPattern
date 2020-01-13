public class staticvariable {
    int count = 0;

    static int dem=0;

    public staticvariable() {

    }

    public void visit() {
        count++;
        dem++;
        this.print();
    }

    public void print() {
        System.out.println("count = " + count);

        System.out.println("static dem = " + dem);
    }
}
