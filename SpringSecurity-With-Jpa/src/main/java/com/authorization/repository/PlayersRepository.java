package com.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.authorization.models.Players;
@Repository
public interface PlayersRepository extends JpaRepository<Players, Integer>{
	
	public Players findByPlayersName(String playersName);

}
