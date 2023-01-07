package ismo.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Rue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code_rue;
	
	@Column
	private String nom_rue;
	
	@OneToMany(mappedBy = "Rue", fetch = FetchType.LAZY)
	private List<Immeuble> imeubles;
	
	
}
