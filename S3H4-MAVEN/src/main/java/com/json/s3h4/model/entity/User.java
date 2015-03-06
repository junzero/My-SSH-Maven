package com.json.s3h4.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 用户实体
 * @author 
 */

@Entity
@Table(name="tb_user")
public class User {
	
	@Id
	@Column(name="user_id")
	@SequenceGenerator(name="seq_user", sequenceName="seq_user_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="seq_user")
	private Long id;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_age")
	private Integer age;
	
	@Column(name="user_gender")
	private String gender;
	
	@Column(name="user_birth")
	private String birthday;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String toString(){
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(this);
	} 

}
