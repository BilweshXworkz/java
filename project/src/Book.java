//import com.xworkz.java;
public class Book {
    public Book() {
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int prices = 100;
        Integer ref = Integer.valueOf(prices);
        System.out.println(ref);

        Integer amt = 1000;
        int ref1 = amt;
        System.out.println(ref1);

        Integer amount = 1000;
        int ref2 = amount.intValue();
        System.out.println(ref2);

        Integer val = 500;
        String val2 = "10000";
        int ref3 = val.byteValue();
        int ref4 = val.shortValue();
        int ref5 = Integer.parseInt(val2.toString());
        float ref6 = val.floatValue();
        double ref7 = val.doubleValue();
        long ref8 = val.longValue();
        System.out.println(ref3);
        System.out.println(ref4);
        System.out.println(ref5);
        System.out.println(ref6);
        System.out.println(ref7);
        System.out.println(ref8);
    }
}
