/**
 * Login osztály létrehozása
 */
public class Login {
    private String username;
    private String password;

    /**
     * Konstruktor
     * @param username
     * @param password
     */
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}