package Dio.me.Santaderdevweek2024.doMain.repository;

import Dio.me.Santaderdevweek2024.doMain.model.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccoutNumero(String accountNumber);
}
