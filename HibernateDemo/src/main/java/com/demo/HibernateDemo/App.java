package com.demo.HibernateDemo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien a = new Alien();
        AlienName an = new AlienName();
        an.setFname("jitender");
        an.setLname("srivastava");
        a.setAid(4);
        a.setAname(an);
        a.setColor("yellow");
        
        Alien alien =null;
        
        Configuration conf = new Configuration().configure();
        
        ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        
        SessionFactory sf= conf.buildSessionFactory(reg);
        Session session=    sf.openSession();
        Transaction tx= session.beginTransaction();
        session.save(a);


    a.getAname().setLname("rawat");

//   alien=  (Alien) session.get(Alien.class, 4);
//   
//   session.evict(alien);
//   session.update(a);
//   alien=  (Alien) session.get(Alien.class, 4);
  //  System.out.println(alien);
    tx.commit();
    }
}
