package com.authorization.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Rounds {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rounds;
    @Column
	private String points;
    
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "players_round", joinColumns = @JoinColumn(name = "rounds"), 
	inverseJoinColumns = @JoinColumn(name = "players_id"))
	private Set<Players> players = new HashSet<Players>();

    
	
	public Integer getRounds() {
		return rounds;
	}
	public void setRounds(Integer rounds) {
		this.rounds = rounds;
	}
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Rounds [rounds=" + rounds + ", points=" + points + "]";
	}
	public Set<Players> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Players> players) {
		this.players = players;
	}

    

}
