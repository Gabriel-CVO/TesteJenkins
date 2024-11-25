package com.venda.ingresso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.venda.ingresso.entities.Ingresso;
import com.venda.ingresso.repositories.IngressoRespository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class IngressoService {
	
	private IngressoRespository ingressoRepository;

	public IngressoService(IngressoRespository ingressoRespository) {
		this.ingressoRepository = ingressoRespository;
	}
	
	@Transactional
	public List<Ingresso> buscarIngressos(){
		return ingressoRepository.buscarIngressos();
	}

	@Transactional
	public Optional<Ingresso> buscarIngressosPorId(int id) {
        return ingressoRepository.buscarIngressosPorId(id);
    }
	
	
	@Transactional
	public Ingresso adicionarIngresso(Ingresso ingresso) {
        return ingressoRepository.save(ingresso);
    }
	
	@Transactional
	public Ingresso atualizarIngresso(Ingresso ingresso, int id) {
		Ingresso ingressoExistente = ingressoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Ingresso não encontrado"));
				
		ingressoExistente.setCpf_comprador(ingresso.getCpf_comprador());
		ingressoExistente.setNome_comprador(ingresso.getNome_comprador());
		ingressoExistente.setIdade_comprador(ingresso.getIdade_comprador());
				
        return ingressoRepository.save(ingressoExistente);
    }
	
	@Transactional
	public void apagarIngressoPorId(int id) {
		ingressoRepository.apagarIngressoPorId(id);
    }
	

}
