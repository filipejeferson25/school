package com.filipeprojetoescola.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Tabela Materia")
@NoArgsConstructor
@Data
public class MateriaEntity implements Serializable{

	private static final long serialVersionUID = -4347884940679737637L;

	@Id
	@GeneratedValue
	@GenericGenerator(name = "Incremente", strategy = "Incremente")
	@JsonInclude(Include.NON_NULL)
	@Column(name = "ID")
	private Long id;
	
		@JsonInclude(Include.NON_EMPTY)
		@Column(name = "Name")
		private String name;
	
			@Column(name = "Hours")
			private int hour;
	
				@Column(name = "Cod")
				private String codigo;
	
					@Column(name = "Fequency")
					private int frequency;
					
	
}
