package br.com.ifpe.oxefoodtalitha.modelo.empresa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefoodtalitha.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Empresa")
@Where(clause = "habilitado = true")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Empresa extends EntidadeAuditavel{
	
	
	private static final long serialVersionUID = 6213570350218006889L;

	@NotNull
	@Column(nullable = false)
	private String chave;
	
	@Column
	private String site;
	
	@Column
	private String cnpj;
	
	@Column
	private String inscricaoEstadual;
	
	@Column
	private String nomeEmpresarial;
	
	@Column
	private String nomeFantasia;
	
	@Column
	private String fone;
	
	@Column
	private String foneAlternativo;
}
