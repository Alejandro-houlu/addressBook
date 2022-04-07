package sg.edu.nus.iss.day23_DoDb.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import sg.edu.nus.iss.day23_DoDb.Models.User;
import static sg.edu.nus.iss.day23_DoDb.Repositories.Queries.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jTemplate;

    public void saveUser(User user){

        Date sqlDate = new Date(user.getDob().getTime());

        jTemplate.update(SQL_INSERT_NEW_USER,
        user.getEmail(),user.getName(),user.getPhone(),
        sqlDate,user.getStatus(),user.getPassPhrase()); 
    }

    public List<User> findAllUsers(){

        List<User> users = new ArrayList<>();

        final SqlRowSet result = jTemplate.queryForRowSet(SQL_SELECT_ALL_USERS);

        while(result.next()){
            User user = User.create(result);
            users.add(user);
        }

        return users;
        
    }


    
    
}
