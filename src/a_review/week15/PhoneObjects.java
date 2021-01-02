package a_review.week15;

public class PhoneObjects {
    public static void main(String[] args) {

        IPhone phone1 = new IPhone("11", 8.0, 1999);
        Phone phone2 = new IPhone("8", 6.5, 1000);
        Object phone3 = new IPhone("5", 6.5, 500);
        AppleApp phone4 = new IPhone("7", 7.0, 1500);

        phone1.faceTiming(12313313);
        ((IPhone) phone2).faceTiming(124124121);
        ((IPhone) phone4).faceTiming(31213241);




    }
}
