package sg.edu.nus.iss.day23_DoDb.Repositories;

public interface Queries {

    public static final String SQL_INSERT_NEW_USER = "insert into bff(email, name, phone, dob, status, pass_phrase) values (?,?,?,?,?,SHA1(?))";

    public static final String SQL_SELECT_ALL_USERS = "select * from bff";
    

}
