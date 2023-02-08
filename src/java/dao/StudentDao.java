
package dao;

import model.Student;
import org.hibernate.*;


public class StudentDao {
    
    public boolean createStudent(Student student){
        boolean result = false;
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction ts= ss.beginTransaction();
        ss.save(student);
        ts.commit();
        ss.close();
        result=Boolean.TRUE;
        return result;
        
    }
    
    public boolean updateStudent(Student student){
        boolean result= false;
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = ss.beginTransaction();
        ss.update(student);
        ts.commit();
        ss.close();
        result =Boolean.TRUE;
        return result;
    }
}
