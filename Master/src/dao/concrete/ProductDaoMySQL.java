package src.dao.concrete 

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Locals
import models.Product
import src.dao.interfaces.ProductDao
import src.daoFactory.DaoFactory



        String title,
        String description ,
        Integer price,
        Boolean isActive,
        Date created,
        Date updated,
        Date deleted,
        String createdBy,
        String updatedBy,
        String deletedBy,
public class ProductDaoMySQL implements ProductDao {
	private static final String 
	INSERT = "INSERT INTO products (title, description, price, isActive, created, updated, deleted, createdBy, updatedBy, deletedBy) VALUES (?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?)";
	private static final String
	ALL = "SELECT * FROM products";

	private static final String 
	FIND_BY_TITLE = "SELECT * FROM products WHERE title = ?";
	
	private static final String
	FIND_BY_ID = "SELECT * FROM products WHERE id = ?";

	private static final String
	FIND_BY_DESCRIPTION = "SELECT * FROM products WHERE description = ?";
	
	
	private static final String 
	DELETE = "DELETE FROM products where id = ?";
	
	private static final String 
	DELETE_ALL = "DELETE FROM products";
	
}
