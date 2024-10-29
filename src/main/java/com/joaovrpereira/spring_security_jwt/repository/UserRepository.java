package com.joaovrpereira.spring_security_jwt.repository;

import com.joaovrpereira.spring_security_jwt.model.User;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUsername(String username);
}
