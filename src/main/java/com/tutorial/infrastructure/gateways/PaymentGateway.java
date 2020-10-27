package com.tutorial.infrastructure.gateways;

import com.tutorial.domain.exceptions.InvalidCredentialsException;
import com.tutorial.domain.models.Credentials;

/**
 * The type Payment gateway.
 */
public abstract class PaymentGateway implements Chargeable {

    /**
     * Sets credentials.
     *
     * @param credentials the credentials
     */
    final public void setCredentials(Credentials credentials) {
        if(credentials == null){
            throw new InvalidCredentialsException("Debes de proporcionar credenciales de acceso.");
        }

        if(this.isEmptyOrNull(credentials.getPassword())){
            throw new InvalidCredentialsException("Debes de proporcionar un password.");
        }

        if(this.isEmptyOrNull(credentials.getUsername())){
            throw new InvalidCredentialsException("Debes de proporcionar un nombre de usuario");
        }

        this.authenticate(credentials.getUsername(), credentials.getPassword());
    }

    private boolean isEmptyOrNull(String value){
        return value.trim().length() == 0 || value == null;
    }

    private void authenticate(String username, String password){

        this.beforeAuthenticating();

        System.out.println("::::Authenticating user::::");
        System.out.println("Username:" + username);
        System.out.println("Password:" + password);

        String response = this.afterSendingCredentials(username);
        System.out.println(response);

        System.out.println("::::USER AUTHENTICATED::::");
        System.out.println(":::::USER ACCESS GRANTED::::For New User");

        this.afterAuthenticating();
    }

    /**
     * After sending credentials string.
     *
     * @param username the username
     * @return the string
     */
    abstract protected String afterSendingCredentials(String username);

    /**
     * Before authenticating.
     */
    abstract protected void beforeAuthenticating();

    /**
     * After authenticating.
     */
    abstract protected void afterAuthenticating();
}
