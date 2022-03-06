package com.ecommerce.sportyshoes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.ecommerce.sportyshoes.enums.Category;
import com.ecommerce.sportyshoes.enums.UserType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "users")
@DynamicUpdate
@DynamicInsert

@AllArgsConstructor
@NoArgsConstructor
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long iD;
private String firstName;
private String lastName;
private String email;
private String mobile;
private String password;

@Enumerated(EnumType.STRING)
private UserType userType;
private Date createdAt;
private Date updatedAt;
}
