package GroupProject;

public class User {
    private String username;
    private String hashedPassword;
    private int xp;

    public User(String username, String hashedPassword, int xp) {
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.xp = xp;
    }

    public String getUsername() {
        return username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void addXp(int xp) {
        this.xp += xp;
    }

   public void setUsername(String username) {
        this.username = username;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    @Override
    public String toString() {
        return username + "," + hashedPassword + "," + xp;
    }
}

