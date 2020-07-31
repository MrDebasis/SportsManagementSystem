package com.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authorization.models.Tournament;
@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Integer> {

}
