package org.dynamic.demo.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class PhoneUserDetailsServiceImpl implements UserDetailsService {




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return User.builder()
            .username(username)
            .password("123456")
            .authorities("user")
            .accountExpired(false)
            .accountLocked(false)
            .disabled(false)
            .build();
    }
}
