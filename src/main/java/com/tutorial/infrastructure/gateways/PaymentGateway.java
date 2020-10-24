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

        this.afterSendingCredentials();

        System.out.println("::::USER AUTHENTICATED::::");
        System.out.println(":::::USER ACCESS GRANTED::::For New User");

        this.afterAuthenticating();
    }

    abstract protected  void afterSendingCredentials();

    abstract protected void beforeAuthenticating();

    abstract protected void afterAuthenticating();
}
