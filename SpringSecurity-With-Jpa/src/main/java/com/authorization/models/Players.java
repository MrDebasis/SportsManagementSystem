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
public class Players {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="players_id")
	private Integer playersId;
	
	@Column(name="players_name")
	private String playersName;
	
	@Column
	private String age;
	
	@Column
	private String gender;
	
	@Column
	private float hight;
	
	@Column
	private int weight;
	
	@Column
	private String password;
	
	@Column
	private boolean enabled;
	
	//dont use hear @NotNull
	@Column
	private String round1;
	
	//dont use hear @NotNull
	@Column
	private String semifinal;
	
	//dont use hear @NotNull
	@Column
	private String finall;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "players_id"), 
	inverseJoinColumns = @JoinColumn(name = "roleid"))
	private Set<Roles> roles = new HashSet<Roles>();

	

	public String getRound1() {
		return round1;
	}

	public void setRound1(String round1) {
		this.round1 = round1;
	}

	public String getFinall() {
		return finall;
	}

	public void setFinall(String finall) {
		this.finall = finall;
	}

	public String getSemifinal() {
		return semifinal;
	}

	public void setSemiFinal(String semifinal) {
		this.semifinal = semifinal;
	}

	
	public void setSemifinal(String semifinal) {
		this.semifinal = semifinal;
	}

	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}

	public Integer getPlayersId() {
		return playersId;
	}

	public void setPlayersId(Integer playersId) {
		this.playersId = playersId;
	}

	public String getPlayersName() {
		return playersName;
	}

	public void setPlayersName(String playersName) {
		this.playersName = playersName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getHight() {
		return hight;
	}

	public void setHight(float hight) {
		this.hight = hight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Players [playersId=" + playersId + ", playersName=" + playersName + ", age=" + age + ", gender="
				+ gender + ", hight=" + hight + ", weight=" + weight + ", password=" + password + ", enabled=" + enabled
				+ ", roles=" + roles + "]";
	}

	

}
