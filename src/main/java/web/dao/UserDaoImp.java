package web.dao;


import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDaoImp implements UserDao {

    private static int count;
    private List<User> userList;
    public UserDaoImp(){
        userList = new ArrayList<>();
        userList.add(new User( ++count, "Car1","red"));
        userList.add(new User( ++count, "Car2", "white"));
        userList.add(new User( ++count, "Car3", "blue"));
        userList.add(new User( ++count, "Car4", "green"));
        userList.add(new User( ++count, "Car5", "red"));
    }

    @Override
    public List<User> getAllUsers() {
        return getUserList();
    }

    @Override
    public List<User> getUsersByCount(int count) {
        return getUserList().subList(0, count);
    }
    @Override
    public void saveUser(User user){
        user.setId(++count);
        userList.add(user);
    }

    @Override
    public User getUserByID(int id) {
        return getUserList().stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public void updateUser(int id, User user) {
        User updateUser = getUserByID(id);
        updateUser.setName(user.getName());
        updateUser.setLastName(user.getLastName());
    }

    @Override
    public void deleteUser(int id) {
        getUserList().removeIf(user -> user.getId() == id);
    }

    @Override
    public List<User> getUserList() {
        return userList;
    }

}
