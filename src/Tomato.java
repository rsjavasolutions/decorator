import java.math.BigDecimal;

public class Tomato extends BurgerDecorator {

    private Burger burger;

    public Tomato(Burger burger) {
        this.burger = burger;
    }

    @Override
    public BigDecimal getPrice() {
        return burger.getPrice().add( new BigDecimal("2.25"));
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " z pomidorem";
    }
}
