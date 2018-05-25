<<<<<<< HEAD
package org.prayasyouthforum.lokesh.hibernate;

import org.hibernate.Session;
import org.prayasyouthforum.lokesh.persistence.HibernateUtil;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("4715");
        stock.setStockName("GENM");
        
        session.save(stock);
        session.getTransaction().commit();
    }
}
=======
package org.prayasyouthforum.lokesh.hibernate;

import org.hibernate.Session;
import org.prayasyouthforum.lokesh.persistence.HibernateUtil;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("4715");
        stock.setStockName("GENM");
        
        session.save(stock);
        session.getTransaction().commit();
    }
}
>>>>>>> bbcd825375333a929fceaad1e6de1dfe9dc01f50
