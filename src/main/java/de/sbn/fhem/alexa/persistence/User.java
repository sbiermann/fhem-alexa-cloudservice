package de.sbn.fhem.alexa.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Stefan on 09.02.2017.
 */
@Entity
public class User {

    @Id
    private String username;

    private String host;

    private String port;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
