package perni.com.biathlon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import perni.com.biathlon.models.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    UserEntity findByEmail(String email);
}
