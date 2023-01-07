package ismo.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Etage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num_etage;
	
	
	@Column
	private int nb_appartements_tot;

	@OneToMany(mappedBy = "Etage", fetch = FetchType.LAZY)
	private List<Immeuble> immeubles;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "num_immeuble")
	private Immeuble immeuble; 
	
}
