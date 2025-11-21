public class TeamMember {
    private static int nextId = 1;  // static ID generator

    private final int id;
    private String username;
    private String email;

    TeamMember(String username, String email) {
        this.id = nextId;
        nextId++;

        validateString("username", username);
        this.username = username;

        validateString("email", email);
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        validateString("username", username);
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validateString("email", email);
        this.email = email;
    }

    private void validateString(String message, String input) {
        if(input == null || input.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }
}
