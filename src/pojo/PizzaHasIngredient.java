package pojo;

public class PizzaHasIngredient {
    private int pizzaId;
    private int ingredientId;

    public PizzaHasIngredient(int pizzaId, int ingredientId) {
        this.pizzaId = pizzaId;
        this.ingredientId = ingredientId;
    }

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }
}
