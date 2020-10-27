package com.tutorial.domain.models;

/**
 * The type Credentials.
 */
final public class Credentials {

    private String username;
    private String password;

    /**
     * Instantiates a new Credentials.
     *
     * @param username the username
     * @param password the password
     */
    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }
}
