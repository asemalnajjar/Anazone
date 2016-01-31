package com.anazon.model;

import com.anazon.model.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-16T00:29:45")
@StaticMetamodel(ProductCategory.class)
public class ProductCategory_ { 

    public static volatile SingularAttribute<ProductCategory, String> description;
    public static volatile SingularAttribute<ProductCategory, Integer> id;
    public static volatile SingularAttribute<ProductCategory, String> title;
    public static volatile ListAttribute<ProductCategory, Product> productList;

}