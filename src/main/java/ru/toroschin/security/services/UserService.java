package ru.toroschin.security.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.toroschin.security.entities.Role;
import ru.toroschin.security.entities.User;
import ru.toroschin.security.repositories.UserRepository;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findUsersByName(s);
        User user = userOptional.orElseThrow(() -> new UsernameNotFoundException("Не найден пользователь "+s));
        System.out.println(user);
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), mappedRoles(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mappedRoles(Collection<Role> roles) {
        return roles.stream().map(r -> new SimpleGrantedAuthority(r.getName())).collect(Collectors.toList());
    }

}
