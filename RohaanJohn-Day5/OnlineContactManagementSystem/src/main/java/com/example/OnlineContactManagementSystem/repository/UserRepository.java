package com.example.OnlineContactManagementSystem.repository;
import com.example.OnlineContactManagementSystem.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserTable, Long> {

}
