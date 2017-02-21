package com.lps.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity()//实体
@Table(name="users",catalog="webone")
public class Users implements java.io.Serializable{
	//映射表
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="user_name")
	private String userName;
//	private Integer cityId;
	@ManyToOne(cascade=CascadeType.ALL)
	private Citys city;
	@OneToOne(cascade=CascadeType.ALL,mappedBy="user")//mappedBy相当于inverse="true"控制反转
	private Cards card;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="users_dep", joinColumns={@JoinColumn(name="users_id",referencedColumnName="id")}  
    , inverseJoinColumns={@JoinColumn(name="dep_id",referencedColumnName="id")})
	private Set<Departments> departments=new HashSet<Departments>(0);
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Citys getCity() {
		return city;
	}
	public void setCity(Citys city) {
		this.city = city;
	}
//	public Integer getCityId() {
//		return cityId;
//	}
//	public void setCityId(Integer cityId) {
//		this.cityId = cityId;
//	}
	public Cards getCard() {
		return card;
	}
	public void setCard(Cards card) {
		this.card = card;
	}
	public Set<Departments> getDepartments() {
		return departments;
	}
	public void setDepartments(Set<Departments> departments) {
		this.departments = departments;
	}
	
	
	
}
