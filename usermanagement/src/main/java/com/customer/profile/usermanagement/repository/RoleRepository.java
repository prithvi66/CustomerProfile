package com.customer.profile.usermanagement.repository;

import com.customer.profile.usermanagement.model.Role;
import com.customer.profile.usermanagement.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);

}
