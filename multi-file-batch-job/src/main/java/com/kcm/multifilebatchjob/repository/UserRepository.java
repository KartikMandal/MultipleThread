package com.kcm.multifilebatchjob.repository;

import com.kcm.multifilebatchjob.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
