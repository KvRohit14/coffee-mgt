package com.coffee.management;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // Add a coffee
        session.beginTransaction();
        Coffee coffee = new Coffee("Espresso", 2.5, "Italy");
        session.save(coffee);
        session.getTransaction().commit();

        // List all coffees
        session.beginTransaction();
        List<Coffee> coffees = session.createQuery("from Coffee", Coffee.class).list();
        for (Coffee c : coffees) {
            System.out.println(c.getId() + ": " + c.getName() + " - $" + c.getPrice());
        }
        session.getTransaction().commit();

        session.close();
        factory.close();
    }
} 