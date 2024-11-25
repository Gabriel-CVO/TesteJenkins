package com.venda.ingresso.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ingresso")
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ingresso_nome_comprador", length = 255)
    private String nome_comprador;

    @Column(name = "ingresso_cpf_comprador", length = 255)
    private String cpf_comprador;

    @Column(name = "ingresso_idade_comprador")
    private Integer idade_comprador;
    
    @Column(name = "ingresso_status")
    private Integer status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_comprador() {
        return nome_comprador;
    }

    public void setNome_comprador(String nome_comprador) {
        this.nome_comprador = nome_comprador;
    }

    public String getCpf_comprador() {
        return cpf_comprador;
    }

    public void setCpf_comprador(String cpf_comprador) {
        this.cpf_comprador = cpf_comprador;
    }

    public Integer getIdade_comprador() {
        return idade_comprador;
    }

    public void setIdade_comprador(Integer idade_comprador) {
        this.idade_comprador = idade_comprador;
    }

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
    
    
}

