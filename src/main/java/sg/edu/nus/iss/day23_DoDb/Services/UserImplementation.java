package sg.edu.nus.iss.day23_DoDb.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day23_DoDb.Models.User;
import sg.edu.nus.iss.day23_DoDb.Repositories.UserRepository;
@Service
public class UserImplementation implements UserInterface {

    @Autowired
    UserRepository uRepo;

    @Override
    public void saveUser(User user) {
        uRepo.saveUser(user);
        
    }

    @Override
    public List<User> findAllUsers() {
        return uRepo.findAllUsers();
    
    }
    
}
