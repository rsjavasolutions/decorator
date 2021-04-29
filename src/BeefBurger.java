import java.math.BigDecimal;

public class BeefBurger extends Burger {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("12.00");
    }

    @Override
    public String getDescription() {
        return "Burger z mięchem";
    }
}
