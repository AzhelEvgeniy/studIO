package com.ivoazh.studIO.dao;

import com.ivoazh.studIO.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
