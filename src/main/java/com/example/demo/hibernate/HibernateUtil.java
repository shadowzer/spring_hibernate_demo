package com.example.demo.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by cod_s on 08.07.2017.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null) {
            synchronized (HibernateUtil.class) {
                if (sessionFactory == null)
                    sessionFactory = new Configuration().configure().buildSessionFactory();
            }
        }
        return sessionFactory;
    }

    public static void closeSessionFactory() {
        if (sessionFactory != null)
            sessionFactory.close();
    }

}
