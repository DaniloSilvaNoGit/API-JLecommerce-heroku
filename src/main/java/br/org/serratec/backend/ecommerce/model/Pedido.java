package br.org.serratec.backend.ecommerce.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import br.org.serratec.backend.ecommerce.enums.PedidoStatus;
import lombok.Data;

@Entity
@Table(name = "pedido")
@Data
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "data_pedido")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPedido;

	@Column(name="status", nullable = false)
	private PedidoStatus pedidoStatus;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@OneToMany(mappedBy = "id.pedido")
	private Set<PedidoItem> itens = new HashSet<>();


	@Transient
	public Double getTotal() {
		double soma = 0.0;
		for(PedidoItem item : itens) {
			soma += item.getSubTotal();
		}
		return soma;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataPedido() {
		return this.dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public PedidoStatus getPedidoStatus() {
		return this.pedidoStatus;
	}

	public void setPedidoStatus(PedidoStatus pedidoStatus) {
		this.pedidoStatus = pedidoStatus;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<PedidoItem> getItens() {
		return this.itens;
	}

	public void setItens(Set<PedidoItem> itens) {
		this.itens = itens;
	}



}
