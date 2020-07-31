package com.authorization.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.authorization.models.Rounds;

@Repository
public interface RoundsRepository extends JpaRepository<Rounds, Integer>{


}
