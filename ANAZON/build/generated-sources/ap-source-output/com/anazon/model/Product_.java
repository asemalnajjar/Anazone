package com.anazon.model;

import com.anazon.model.Orders;
import com.anazon.model.ProductCategory;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-16T00:29:45")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, byte[]> image;
    public static volatile SingularAttribute<Product, Integer> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Integer> qunitity;
    public static volatile SingularAttribute<Product, String> descrption;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, ProductCategory> categoryId;
    public static volatile ListAttribute<Product, Orders> ordersList;

}