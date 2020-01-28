package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T_EMPRESA *cd_empresa (NUMBER) (PK) (SQ_T_EMPRESA) *nm_fantasia (VARCHAR(50))
 * dt_abertura (DATE) ds_status (VARCHAR) (Enum) *nr_cnpj (VARCHAR(18))
 */

@Entity
@Table(name="T_EMPRESA")
@SequenceGenerator(name="empresa",sequenceName="SQ_T_EMPRESA",allocationSize=1)
public class Empresa {

	@Id
	@Column(name="cd_empresa")
	@GeneratedValue(generator="empresa", strategy=GenerationType.SEQUENCE)
	private int codigo;

	@Column(name="nm_fantasia",nullable=false,length=50)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name="dt_abertura")
	private Calendar dataAbertura;

	@Enumerated(EnumType.STRING)
	@Column(name="ds_status")
	private Status status;

	@Column(name="nr_cnpj",nullable=false,length=18)
	private String cnpj;
	
	public Empresa() {
		super();
	}
	
	public Empresa(String nome, Calendar dataAbertura, Status status, String cnpj) {
		super();
		this.nome = nome;
		this.dataAbertura = dataAbertura;
		this.status = status;
		this.cnpj = cnpj;
	}

	public Empresa(int codigo, String nome, Calendar dataAbertura, Status status, String cnpj) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataAbertura = dataAbertura;
		this.status = status;
		this.cnpj = cnpj;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}






