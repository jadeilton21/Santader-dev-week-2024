package Dio.me.Santaderdevweek2024.doMain.repository;

import Dio.me.Santaderdevweek2024.doMain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
