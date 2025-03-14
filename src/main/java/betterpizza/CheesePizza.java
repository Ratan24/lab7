package betterpizza;

import pizza.ToppingName;
import pizza.ToppingPortion;

public class CheesePizza extends AlaCartePizza {

  @Override
  public double cost() {
    return 0;
  }

  /**
   * Determines if the specified topping is on this pizza and if so, return its portion
   *
   * @param name the name of the topping
   * @return the portion of this topping on this pizza, or null if the given topping is not on this
   * pizza
   */
  @Override
  public ToppingPortion hasTopping(ToppingName name) {
    return null;
  }
}
