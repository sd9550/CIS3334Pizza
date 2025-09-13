package cis3334.java_pizzaorderstart;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;

@Dao
public interface PizzaDao {
    @Insert
    void insert(Pizza pizza);
    @Delete
    void delete(Pizza pizza);
    @Query("SELECT * FROM Pizza")
    ArrayList<Pizza> getAll();
}
