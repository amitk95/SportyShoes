package com.ecommerce.sportyshoes.model;

import java.util.Date;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.ecommerce.sportyshoes.enums.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;



@Data
@Entity
@Table(name = "products")
@DynamicUpdate
@DynamicInsert

@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String name;
private String description;
private long price;
private long availability;

@Enumerated(EnumType.STRING)
private Category category;
private Date createdAt;
private Date updatedAt;
}
