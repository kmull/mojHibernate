package com.infoshareacademy.car.domain;

import com.infoshareacademy.car.domain.model.Webpage;
import com.infoshareacademy.hibernate.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class WebpageRepository {

    public Webpage findWebpageById(long id) {
        Session session = SessionFactoryProvider
                .getSessionFactory().getCurrentSession();

        Transaction tx = session.beginTransaction();
        Webpage webpage = (Webpage) session.get(Webpage.class, id);
        tx.commit();
        return webpage;
    }

    public void saveWebpage(Webpage webpage) {
        Session session = SessionFactoryProvider
                .getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(webpage);
        tx.commit();
    }
}
