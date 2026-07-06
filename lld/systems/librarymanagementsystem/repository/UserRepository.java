package lld.systems.librarymanagementsystem.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lld.systems.librarymanagementsystem.model.User;

public class UserRepository {
    
    private Map<String, User> users = new HashMap<>();
    
    public Optional<User> getUser(String userId) {
        return Optional.ofNullable(users.get(userId));
    }

    public void save(User user) {
        users.put(user.getUserId(), user);
    }
}
