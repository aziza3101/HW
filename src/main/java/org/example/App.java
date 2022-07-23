package org.example;

import org.example.dao.UserDaoHibernateImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args){
        UserDaoHibernateImpl userDaoHibernate=new UserDaoHibernateImpl();
        userDaoHibernate.saveUser("Aziza","Arzykulova", (byte) 30);
        userDaoHibernate.saveUser("Klara","Azimova", (byte) 30);
        userDaoHibernate.saveUser("Nursultan","Askarov", (byte) 25);

        userDaoHibernate.removeUserById(1);

        System.out.println(userDaoHibernate.getAllUsers());
        userDaoHibernate.dropUsersTable();


    }

}
