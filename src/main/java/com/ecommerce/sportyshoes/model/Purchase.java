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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "purchase")
@DynamicUpdate
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private long user_id;
private long product_id;

@Enumerated(EnumType.STRING)
private Category category;
private int quantity;
private Date createdAt;
private Date updatedAt;
}
