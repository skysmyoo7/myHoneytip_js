
class AppConfig {
    public OrderService orderService(){
        return new OrderServiceImpl(discountPolicy());
    }

    public FixDiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}


public class Main {

    public static void main(String[] args) {
        final AppConfig appConfig = new AppConfig();
        final OrderService orderService = appConfig.orderService();
        final Order order = orderService.createOrder(10,"샤프",3000);
        System.out.println(order.getDiscountPrice());
    }
}
