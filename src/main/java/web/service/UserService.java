package web.service;

import web.model.User;

import java.util.List;
public interface UserService {
    void Add (User user);
    void Remove (User user);
    void Update (User user);
    List<User> getAllUsers ();
}
