package com.coffee.management;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Simulation {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        try {
            session.beginTransaction();

            // Create and save Coffee
            Coffee coffee = new Coffee();
            coffee.setName("Espresso");
            coffee.setPrice(2.5);
            coffee.setOrigin("Italy");
            session.save(coffee);

            // Create and save Customer
            Customer customer = new Customer();
            customer.setName("John Doe");
            customer.setEmail("john@example.com");
            customer.setPhone("1234567890");
            session.save(customer);

            // Create and save Employee
            Employee employee = new Employee();
            employee.setName("Alice Smith");
            employee.setPosition("Barista");
            employee.setSalary(3000);
            session.save(employee);

            // Create and save Supplier
            Supplier supplier = new Supplier();
            supplier.setName("Coffee Beans Inc.");
            supplier.setContact("beans@supplier.com");
            session.save(supplier);

            // Create and save Order
            Order order = new Order();
            order.setCustomer(customer);
            order.setCoffee(coffee);
            order.setQuantity(2);
            order.setOrderDate(new Date());
            session.save(order);

            session.getTransaction().commit();
            System.out.println("Simulation completed successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
            factory.close();
        }
    }
} 