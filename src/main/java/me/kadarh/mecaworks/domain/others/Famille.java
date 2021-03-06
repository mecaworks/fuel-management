package me.kadarh.mecaworks.domain.others;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.kadarh.mecaworks.domain.AbstractDomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

/**
 * @author kadarH
 */

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Famille extends AbstractDomain {

	@NotEmpty
	@Column(unique = true)
	private String nom;

	@ManyToOne
	private Classe classe;

}
