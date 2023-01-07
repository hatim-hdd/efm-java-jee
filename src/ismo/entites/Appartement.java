package ismo.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
public class Appartement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String lettre_appartement;
	
	
	public Appartement(String lettre_appartement, int nb_pieces_total) {
		super();
		this.lettre_appartement = lettre_appartement;
		this.nb_pieces_total = nb_pieces_total;
	}

	@Column
	private int nb_pieces_total;
	
	@OneToMany(mappedBy = "Appartement", fetch = FetchType.LAZY)
	private List<Etage> etages;

}
