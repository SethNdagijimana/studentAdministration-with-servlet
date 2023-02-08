
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.Student;


public interface StudentInterface extends Remote{
      public void saveStudent(Student student) throws RemoteException;
     public void updateStudent(Student student) throws RemoteException;
    
}
