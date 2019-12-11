/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernew;

import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author 17684
 */
public class HiberNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction transaction = s.beginTransaction();
        Documenty d = new Documenty();
        s.persist(d);
        //   s.save(d);

        transaction.commit();

        List<Documenty> q = s.createQuery("from Documenty s").list();
        Transaction t = s.beginTransaction();
        q.stream().map((u) -> {
            System.out.print(u.getDataSozdanija());
            return u;
        }).map((u) -> {
            u.setDataSozdanija(new Date());
            return u;
        }).forEachOrdered((u) -> {
            s.update(u);
        });
        s.flush();
        t.commit();

        s.close();
    }

}
