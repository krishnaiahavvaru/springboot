/**
 * 
 */
package com.example.demo.vo;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author avaru
 *
 */
@XmlRootElement
public class Team {

	
	public String name;
	public String location;
	public String mascotte;
	public Set<Players> players;
	
	
	
	
	/**
	 * 
	 */
	public Team() {
		super();
	}
	/**
	 * @param name
	 * @param location
	 * @param players
	 */
	public Team(String name, String location, Set<Players> players) {
		this();
		this.name = name;
		this.location = location;
		this.players = players;
	}
	public Team(String name, String location, String mascotte, Set<Players> players) {
		super();
		this.name = name;
		this.location = location;
		this.mascotte = mascotte;
		this.players = players;
	}
	/**
	 * @return the players
	 */
	public Set<Players> getPlayers() {
		return players;
	}
	/**
	 * @param players the players to set
	 */
	public void setPlayers(Set<Players> players) {
		this.players = players;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the mascotte
	 */
	public String getMascotte() {
		return mascotte;
	}
	/**
	 * @param mascotte the mascotte to set
	 */
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}
	
	
}
