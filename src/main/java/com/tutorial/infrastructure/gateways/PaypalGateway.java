package com.tutorial.infrastructure.gateways;

import com.tutorial.domain.models.Credentials;

/**
 * The type Paypal gateway.
 */
public class PaypalGateway extends PaymentGateway{

    @Override
    public void executeCharge(){
        System.out.println("Se ha realizado el cargo con Paypal!");
    }

    @Override
    protected void beforeAuthenticating() {
        System.out.println("Ejecutando antes de autenticar al usuario en Paypal");
    }


    @Override
    protected void afterAuthenticating() {

    }

    @Override
    protected String afterSendingCredentials(String username) {
        return "Some String from Paypal for USERNAME::"+username;
    }



    //  SE COMENTARON PARA EJEMPLIFICAR DE UNA MANERA MAS SIMPLE LA HERENCIA CON CLASES ABSTRACTAS.
//    public void setCredentials(String username, String password)
//    {
//        this.authenticate(username, password);
//    }
//
//    /**
//     * Sets credentials.
//     *
//     * @param username    the username
//     * @param password    the password
//     * @param environment the environment
//     */
//    public void setCredentials(String username, String password, String environment)
//    {
//        System.out.println("Implementacion con 3 parametros");
//    }
//
//    /**
//     * Sets credentials.
//     *
//     * @param username    the username
//     * @param password    the password
//     * @param environment the environment
//     * @param devEmail    the dev email
//     */
//    public void setCredentials(String username, String password, String environment, String devEmail)
//    {
//        System.out.println("Implementacion con 4 parametros, que es dev email");
//    }
//
//    /**
//     * Sets credentials.
//     *
//     * @param username    the username
//     * @param password    the password
//     * @param environment the environment
//     * @param connections the connections
//     */
//    public void setCredentials(String username, String password, String environment, int connections)
//    {
//        System.out.println("Implementacion con 4 parametros, con max connections");
//    }
}
