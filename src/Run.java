public class Run {
    public static void main(String[] args) {

        Burger burgerWithCheeseAndTomato = new Cheese(new Tomato(new BeefBurger()));
        Burger burgerWithJalapeno = new Jalapeno(new BeefBurger());

        System.out.println(burgerWithCheeseAndTomato.getDescription());

        System.out.println(burgerWithCheeseAndTomato.getPrice());

        System.out.println(burgerWithJalapeno.getDescription());
        System.out.println(burgerWithJalapeno.getPrice());

    }
}
