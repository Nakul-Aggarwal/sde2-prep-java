public class SRPExample {
    // TODO: Demonstrate Single Responsibility Principle

    // Pseudo code:
    // - User class: only holds user data
    // - UserRepository class: handles saving/loading users from DB
    // - EmailService class: sends emails

    static class User {
        private String name;
        private String email;

        // Constructor, getters, setters
    }

    static class UserRepository {
        // save(User user), findById(int id)
    }

    static class EmailService {
        // sendEmail(String to, String subject, String body)
    }

    // TODO: Implement classes
}