package Service.user;

import DAO.user.StudentsDAO;
import Model.Students;

public class AddNewStudentsService {
    public Students themhocsinh(String session,Students a)
    {
       return (new StudentsDAO().themThongTin(session,a));
    }
}
