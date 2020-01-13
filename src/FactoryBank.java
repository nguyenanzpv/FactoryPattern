public class FactoryBank {
    public FactoryBank(){

    }

    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietComBank();
            default:
                throw new IllegalArgumentException("Kieu bank ko duoc ho tro");

        }
    }
}
