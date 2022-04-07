package sg.edu.nus.iss.day23_DoDb.Services;

import java.util.List;

import sg.edu.nus.iss.day23_DoDb.Models.User;

public interface UserInterface {

    public void saveUser(User user);

    public List<User> findAllUsers();
    
}
