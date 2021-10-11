package com.slytherin.phase2.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.slytherin.phase2.model.*;
public interface UserProfileRepo extends JpaRepository<UserProfile, Long>{

}