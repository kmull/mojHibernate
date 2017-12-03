package com.infoshareacademy.car.domain;

import com.infoshareacademy.car.domain.model.Car;
import com.infoshareacademy.hibernate.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarRepository {

    public Car findCarById(long id) {
        Session session= SessionFactoryProvider
                .getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Car car = (Car) session.get(Car.class, id);
        tx.commit();
        return car;
    }

    public void saveCar(Car car) {
        Session session= SessionFactoryProvider.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(car);
        tx.commit();
    }

    //save
//    public void saveCar(Car car) {
//        Session session= SessionFactoryProvider.getSessionFactory().openSession();
//        session.save(car);
//        session.flush();
//        session.close();
//    }

    //merge
//    public void saveCar(Car car) {
//        Session session= SessionFactoryProvider.getSessionFactory().getCurrentSession();
//        Transaction tx = session.beginTransaction();
//        session.persist(car);
//        session.evict(car);
//        car.setModel("Bmw x1");
//        Car car1 = (Car) session.merge(car);
//        car1.setModel("Mercedes cls");
//        tx.commit();
//    }

    //update
//    public void saveCar(Car car) {
//        Session session= SessionFactoryProvider.getSessionFactory().getCurrentSession();
//        Transaction tx = session.beginTransaction();
//        session.evict(car);
//        car.setModel("Bmw x1");
//        session.update(car);
//        tx.commit();
//    }

}
