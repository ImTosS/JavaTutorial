package models;

/**
 * The type Paypal gateway.
 */
public class PaypalGateway extends PaymentGateway{

    @Override
    public void executeCharge(){
        System.out.println("Se ha realizado el cargo con Paypal!");
    }

    @Override
    public void sendNotification() {
        System.out.println("Notificacion enviada con Paypal");
    }

    @Override
    public void print() {
        System.out.println("Imprimir desde Paypal");
    }

    /**
     * Sets credentials.
     *
     * @param credentials the credentials
     */
    public void setCredentials(Credentials credentials)
    {
        this.authenticate(credentials.getUsername(), credentials.getPassword());
    }

    public void setCredentials(String username, String password)
    {
        this.authenticate(username, password);
    }

    /**
     * Sets credentials.
     *
     * @param username    the username
     * @param password    the password
     * @param environment the environment
     */
    public void setCredentials(String username, String password, String environment)
    {
        System.out.println("Implementacion con 3 parametros");
    }

    /**
     * Sets credentials.
     *
     * @param username    the username
     * @param password    the password
     * @param environment the environment
     * @param devEmail    the dev email
     */
    public void setCredentials(String username, String password, String environment, String devEmail)
    {
        System.out.println("Implementacion con 4 parametros, que es dev email");
    }

    /**
     * Sets credentials.
     *
     * @param username    the username
     * @param password    the password
     * @param environment the environment
     * @param connections the connections
     */
    public void setCredentials(String username, String password, String environment, int connections)
    {
        System.out.println("Implementacion con 4 parametros, con max connections");
    }

    private void authenticate(String username, String password){
        System.out.println("::::Authenticating user::::");
        System.out.println("Username:" + username);
        System.out.println("Password:" + password);
        System.out.println("::::USER AUTHENTICATED::::");
    }
}
