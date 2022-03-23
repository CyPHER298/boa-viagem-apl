package br.com.horacio.boa_viagem.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Viagem {

	private Long id;
	private String destino;
	private String tipo;
	private LocalDate chegada;
	private LocalDate saida;
	private Double orcamento;
	private Integer pessoas;
}

@Table name = "TBL_VIAGEM"
@Entity public class Viagem
{
	@Id
	@Column name = ("ID_VIAGEM")
	
	@Column name = ("TX_DESTINO")
	
	@Column name = ("TP_VIAGEM")
	
	@Column name = ("DT_CHEGADA")
	
	@Column name = ("DT_SAIDA")
	
	@Column name = ("VLR_ORCAMENTO")
	
	@Column name = ("QTD_PESSOAS")
}