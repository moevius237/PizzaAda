package pojo;

import java.sql.*;
import java.util.Map;

public class HandlePizza {
    private final String selectIngredientes="SELECT id FROM ingredient WHERE name =?";
    private final String insertPizza = "INSERT INTO ingredient (name,calories) VALUES (?,?)";
    private final String insertPizzaIngredient = "INSERT INTO pizza_has_ingredient VALUES(?,?)";
    public void processPizzaWithIngredients(Map<Integer, Ingrediente[]> ingrediente){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/pizza","root","admin");
            try (PreparedStatement ps = con.prepareStatement(selectIngredientes);
                PreparedStatement psi = con.prepareStatement(insertPizza);
                PreparedStatement psis = con.prepareStatement(insertPizzaIngredient)){
                for(Map.Entry<Integer, Ingrediente[]> entrada : ingrediente.entrySet()){
                    Ingrediente []producto = entrada.getValue();
                    for (int i = 0; i < entrada.getValue().length; i++) {
                        ps.setString(1,producto[i].getName());
                        ResultSet rs = ps.executeQuery();
                        if (rs.next()){
                        }else {
                            psi.setString(1,producto[i].getName());
                            psi.setInt(2,producto[i].getCalories());
                            psi.executeQuery();
                        }
                    }
                    for (int i = 0; i < entrada.getValue().length; i++) {
                        psis.setInt(1,entrada.getKey());
                        psis.setInt(2,producto[i].getId());
                    }

                }
            }catch (SQLException e){
                con.rollback();
            }
        } catch (SQLException e) {
            System.out.println("EROR EN LA CONEXION");
        }

    }


}
