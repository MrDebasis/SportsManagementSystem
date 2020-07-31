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
public class Tournament {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="groupno")
	private int groupno;
	
	@Column(name="place")
	private String place;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "players_tournament", joinColumns = @JoinColumn(name = "groupno"), 
	inverseJoinColumns = @JoinColumn(name = "players_id"))
	private Set<Players> players = new HashSet<Players>();


	public Set<Players> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Players> players) {
		this.players = players;
	}

	public int getGroupno() {
		return groupno;
	}

	public void setGroupno(int groupno) {
		this.groupno = groupno;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Set<Players> getRoles() {
		return players;
	}

	public void setRoles(Set<Players> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Tournament [groupno=" + groupno + ", place=" + place + ", roles=" + players + "]";
	}

}
