package registrationandlogin;

public class RegistrationAndLogin {

    public static void main(String[] args) {
        // TODO code application logic here
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        
        //Let the frame be displayed in the center
        LoginFrame.setLocationRelativeTo(null);
    }
    
}
