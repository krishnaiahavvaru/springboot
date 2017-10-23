/**
 * 
 */
package com.example.demo.vo;

/**
 * @author avaru
 *
 */
public class Players {

	public String name;
	public String position;
	
	
	/**
	 * 
	 */
	public Players() {
		super();
	}
	/**
	 * @param name
	 * @param position
	 */
	public Players(String name, String position) {
		this();
		this.name = name;
		this.position = position;
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
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
