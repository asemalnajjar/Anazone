package com.anazon.model;

import com.anazon.model.Customer;
import com.anazon.model.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-16T00:29:45")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Date> date;
    public static volatile SingularAttribute<Orders, Integer> quantity;
    public static volatile SingularAttribute<Orders, Product> productId;
    public static volatile SingularAttribute<Orders, Integer> totalPrice;
    public static volatile SingularAttribute<Orders, Customer> customreId;
    public static volatile SingularAttribute<Orders, Integer> id;

}