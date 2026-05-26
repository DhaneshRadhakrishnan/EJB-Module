package com.pyro.bcd.remote;

import jakarta.ejb.Remote;

@Remote
public interface UserDetails {
    String getUsername();
    String getEmail();
}
