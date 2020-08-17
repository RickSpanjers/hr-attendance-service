package nl.hrmanagement.attendance.security.jwt;

public class JwtAuthentication {

    private String mail;

    private String role;

    public JwtAuthentication() {
    }

    public JwtAuthentication(String mail, String role) {
        this.mail = mail;
        this.role = role;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
