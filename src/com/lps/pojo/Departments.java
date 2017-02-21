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
import javax.persistence.Table;
@Entity()//ΚµΜε
@Table(name="departments",catalog="webone")
public class Departments {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="dep_name")
	private String depName;
	@Column(name="dep_cname")
	private String depCname;
//	@ManyToMany(cascade=CascadeType.ALL,mappedBy="departments")
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="users_dep", joinColumns={@JoinColumn(name="dep_id",referencedColumnName="id")}  
    , inverseJoinColumns={@JoinColumn(name="users_id",referencedColumnName="id")})
	private Set<Users> users=new HashSet<Users>(0);
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getDepCname() {
		return depCname;
	}
	public void setDepCname(String depCname) {
		this.depCname = depCname;
	}
	public Set<Users> getUsers() {
		return users;
	}
	public void setUsers(Set<Users> users) {
		this.users = users;
	}
	
}
