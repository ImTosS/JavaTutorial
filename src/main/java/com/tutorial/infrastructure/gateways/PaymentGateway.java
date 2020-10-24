package com.tutorial.infrastructure.gateways;

import com.tutorial.domain.models.Credentials;

public abstract class PaymentGateway implements Chargeable {

    public void setCredentials(Credentials credentials) {
        this.authenticate(credentials.getUsername(), credentials.getPassword());
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

    abstract protected String afterSendingCredentials(String username);

    abstract protected void beforeAuthenticating();

    abstract protected void afterAuthenticating();
}
