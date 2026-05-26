package com.pyro.bcd;

import com.pyro.bcd.remote.UserDetails;
import jakarta.ejb.Stateless;

@Stateless
public class UserDetailsImpl implements UserDetails {
    @Override
    public String getUsername() {
        return "Dhanesh";
    }

    @Override
    public String getEmail() {
        return "dhanesh@gmail.com";
    }
}
