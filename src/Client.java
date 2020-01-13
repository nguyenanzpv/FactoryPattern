public class Client {
    public static void main(String[] args){
        Bank bank=FactoryBank.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName());
        //abstract
        shape rec=new rectangle();
        rec.draw();
        System.out.println("-----");
        shape tri=new triange();
        tri.draw();
        //interface
        sharp recinterface=new rectangleinterface();
        recinterface.draw();
        System.out.println("----");
        sharp triinterface=new triangleinterface();
        triinterface.draw();
        //static variable
        staticvariable sv=new staticvariable();
        sv.visit();
        staticvariable sv2=new staticvariable();
        sv2.visit();
        //static method
        staticmethod sm=new staticmethod("static method");
        sm.changeWebsite("java web");
        sm.print();
        System.out.println("----");
        sm.changeWebsite("change website to net web");
        sm.print();

        //abstract class implement interface
        CanEat canEat=new cat("Tom");
        CanEat canEat1=new mouse();

        canEat.eat();
        //ko goi duoc method back trong cat
        //canEat.back();
        boolean isCat=canEat instanceof cat;
        System.out.println(isCat);
        if(isCat)
        {
            cat catTom=(cat)canEat;
            catTom.back();
        }

        canEat1.eat();
    }
}
