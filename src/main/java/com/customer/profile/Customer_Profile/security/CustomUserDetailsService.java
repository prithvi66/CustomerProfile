package com.customer.profile.Customer_Profile.security;

import com.customer.profile.Customer_Profile.model.User;
import com.customer.profile.Customer_Profile.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
                .orElseThrow(()->
                        new UsernameNotFoundException("User with "+usernameOrEmail+" not found"));

        return UserPrincipal.create(user);
    }

    @Transactional
    public UserDetails loadUserById(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User with id "+id+" not found"));

        return UserPrincipal.create(user);
    }
}
