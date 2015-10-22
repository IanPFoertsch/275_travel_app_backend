package production.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Position")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "profiles") //maps to the profiles database table
public class Profile implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@Column(name = "user_identifier")

	private String userIdentifier;
	
	@Column(name = "adults")
	private int adults;
	
	@Column(name = "teenagers")
	private int teenagers;
	@Column(name = "children")
	private int children;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "homelocation_x")
	private double homelocation_x;
	@Column(name = "homelocation_y")
	private double homelocation_y;
	@Column(name = "worklocation_x")
	private double worklocation_x;
	@Column(name = "worklocation_y")
	private double worklocation_y;
	
	
	/**
	 * @return the userIdentifier
	 */
	public String getUserIdentifier() {
		return userIdentifier;
	}
	/**
	 * @return the adults
	 */
	public int getAdults() {
		return adults;
	}
	/**
	 * @return the teenagers
	 */
	public int getTeenagers() {
		return teenagers;
	}
	/**
	 * @return the children
	 */
	public int getChildren() {
		return children;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @return the homelocation_x
	 */
	public double getHomelocation_x() {
		return homelocation_x;
	}
	/**
	 * @return the homelocation_y
	 */
	public double getHomelocation_y() {
		return homelocation_y;
	}
	/**
	 * @return the worklocation_x
	 */
	public double getWorklocation_x() {
		return worklocation_x;
	}
	/**
	 * @return the worklocation_y
	 */
	public double getWorklocation_y() {
		return worklocation_y;
	}
	/**
	 * @param userIdentifier the userIdentifier to set
	 */
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}
	/**
	 * @param adults the adults to set
	 */
	public void setAdults(int adults) {
		this.adults = adults;
	}
	/**
	 * @param teenagers the teenagers to set
	 */
	public void setTeenagers(int teenagers) {
		this.teenagers = teenagers;
	}
	/**
	 * @param children the children to set
	 */
	public void setChildren(int children) {
		this.children = children;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @param homelocation_x the homelocation_x to set
	 */
	public void setHomelocation_x(double homelocation_x) {
		this.homelocation_x = homelocation_x;
	}
	/**
	 * @param homelocation_y the homelocation_y to set
	 */
	public void setHomelocation_y(double homelocation_y) {
		this.homelocation_y = homelocation_y;
	}
	/**
	 * @param worklocation_x the worklocation_x to set
	 */
	public void setWorklocation_x(double worklocation_x) {
		this.worklocation_x = worklocation_x;
	}
	/**
	 * @param worklocation_y the worklocation_y to set
	 */
	public void setWorklocation_y(double worklocation_y) {
		this.worklocation_y = worklocation_y;
	}
	
	
	
}
