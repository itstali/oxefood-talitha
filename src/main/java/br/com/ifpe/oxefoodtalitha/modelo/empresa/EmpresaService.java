package br.com.ifpe.oxefoodtalitha.modelo.empresa;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ifpe.oxefoodtalitha.util.entity.GenericService;

public class EmpresaService extends GenericService{
	@Autowired
	private EmpresaRepository repository;

	@Transactional
	public Empresa save(Empresa empresa) {
		
		super.preencherCamposAuditoria(empresa);
		return repository.save(empresa);
	}
}
