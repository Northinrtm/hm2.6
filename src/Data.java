public class Data {

    static void lpcp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if ((login == null) || (login.length() > 20)) {
            throw new WrongLoginException();
        }
        if ((password == null) || (password.length() > 20) || (password != confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
