public class RateDiscountPolicy implements DiscountPolicy {

    private static final int ADULT = 20;
    private static final int DISCOUNT_PERCENT = 10;

    @Override
    public int discount(int age, int price) {
        if(age < ADULT){
            return price * DISCOUNT_PERCENT /100;
        }
        return 0;
    }
}
