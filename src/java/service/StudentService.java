
package service;

import dao.StudentDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import model.Student;


public class StudentService extends UnicastRemoteObject implements StudentInterface{
    
    public StudentService() throws RemoteException{
        super();
    }

    @Override
    public void saveStudent(Student student) throws RemoteException {
        StudentDao studentdao = new StudentDao();
        studentdao.createStudent(student);
    }

    @Override
    public void updateStudent(Student student) throws RemoteException {
            StudentDao studentdao = new StudentDao();
            studentdao.updateStudent(student);
            
    }
    
   
    
}
