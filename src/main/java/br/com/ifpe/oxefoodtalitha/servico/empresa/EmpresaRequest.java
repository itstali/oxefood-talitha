package br.com.ifpe.oxefoodtalitha.servico.empresa;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.ifpe.oxefoodtalitha.modelo.empresa.Empresa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EmpresaRequest {
	
    private String chave;

    @Size(max = 1000)
    @NotNull
    @NotEmpty
    private String site;
    
    private String cnpj;
    
    private String inscricaoEstadual;
    
    private String nomeEmpresarial;
    
    private String nomeFantasia;
	
	private String fone;
		
	private String foneAlternativo;
	
    public Empresa buildEmpresa() {

    return Empresa.builder()
        .chave(chave)
        .cnpj(cnpj)
        .inscricaoEstadual(inscricaoEstadual)
        .nomeEmpresarial(nomeEmpresarial)
        .nomeFantasia(nomeFantasia)
        .fone(fone)
        .foneAlternativo(foneAlternativo)
        .build();
    }

}
