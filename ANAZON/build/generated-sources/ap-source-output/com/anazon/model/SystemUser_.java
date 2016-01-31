package com.anazon.model;

import com.anazon.model.Customer;
import com.anazon.model.UserRole;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-16T00:29:45")
@StaticMetamodel(SystemUser.class)
public class SystemUser_ { 

    public static volatile SingularAttribute<SystemUser, String> password;
    public static volatile CollectionAttribute<SystemUser, Customer> customerCollection;
    public static volatile SingularAttribute<SystemUser, UserRole> roleId;
    public static volatile SingularAttribute<SystemUser, Integer> id;
    public static volatile SingularAttribute<SystemUser, String> username;

}