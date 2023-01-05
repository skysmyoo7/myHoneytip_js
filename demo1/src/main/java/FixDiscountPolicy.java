public class FixDiscountPolicy implements DiscountPolicy {
    private static final int ADULT = 20;
    private static final int DISCOUNT_FIX_AMOUNT = 1000;


    @Override
    public int discount(int age, int price) {
        if (age < ADULT) {
            return DISCOUNT_FIX_AMOUNT;
        }
        return 0;
    }
}
