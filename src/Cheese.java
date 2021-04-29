import java.math.BigDecimal;

public class Cheese extends BurgerDecorator {

    private Burger burger;

    public Cheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public BigDecimal getPrice() {
        return burger.getPrice().add(new BigDecimal("4.00"));
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " z serem";
    }
}
