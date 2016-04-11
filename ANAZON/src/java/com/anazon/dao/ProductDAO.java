/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anazon.dao;

import com.anazon.model.Product;
import java.util.List;

/**
 *
 * @author Asem
 */
public interface ProductDAO {

    public List<Product> getAll();

    public Product add(Product product);

    public Product get(long id);

    public Product update(Product product);

    public Product delete(Product product);

    public void deleteAll(List<Product> selectedProducts);

    public List<Product> getProductsByCategoryId(int categoryId);
}
