package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ad_tipusua")
public class TipoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int co_tipusua;
	private String desc_trab;
}
