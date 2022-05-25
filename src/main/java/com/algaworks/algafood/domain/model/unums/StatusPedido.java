package com.algaworks.algafood.domain.model.unums;

public enum StatusPedido {

	CRIADO(1, "Criado"),
	CONFIRMADO(2, "Confirmado"),
	ENTREGUE(3, "Entregue"),
	CANCELADO(4,"Cancelado");
	
	private int cod;
	private String descricao;
	
	private StatusPedido(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static StatusPedido toEnum(Integer cod) {
		
		if(cod== null) {
			return null;
		}
		
		for(StatusPedido x: StatusPedido.values()) {
			if(cod.equals(x.getCod())) {
				return x;				
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
