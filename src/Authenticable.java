public interface Authenticable {
    boolean authenticate(String email, String password);
    String otp();
    String passkey();
}
