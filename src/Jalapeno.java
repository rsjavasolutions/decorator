import java.math.BigDecimal;

public class Jalapeno extends BurgerDecorator {

    private Burger burger;

    public Jalapeno(Burger burger) {
        this.burger = burger;
    }

    @Override
    public BigDecimal getPrice() {
        return burger.getPrice().add(new BigDecimal("3.10"));
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " z jalapeno";
    }
}
