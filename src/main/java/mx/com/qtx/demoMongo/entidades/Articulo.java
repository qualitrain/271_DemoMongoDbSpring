package mx.com.qtx.demoMongo.entidades;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Articulo {
	@Id
	private String _id;
	@Field(name = "cve_articulo")
	private String cveArticulo;
	private String descripcion;
	@Field(name = "costo_prov_1")
	private BigDecimal costoProv1;
	@Field(name = "precio_lista")
	private BigDecimal precioLista;
	
	
	public Articulo() {
		super();
	}

	public Articulo(String _id, String cveArticulo, String descripcion, BigDecimal costoProv1, BigDecimal precioLista) {
		super();
		this._id = _id;
		this.cveArticulo = cveArticulo;
		this.descripcion = descripcion;
		this.costoProv1 = costoProv1;
		this.precioLista = precioLista;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getCveArticulo() {
		return cveArticulo;
	}

	public void setCveArticulo(String cveArticulo) {
		this.cveArticulo = cveArticulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getCostoProv1() {
		return costoProv1;
	}

	public void setCostoProv1(BigDecimal costoProv1) {
		this.costoProv1 = costoProv1;
	}

	public BigDecimal getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(BigDecimal precioLista) {
		this.precioLista = precioLista;
	}

	@Override
	public String toString() {
		return "Articulo [_id=" + _id + ", cveArticulo=" + cveArticulo + ", descripcion=" + descripcion
				+ ", costoProv1=" + costoProv1 + ", precioLista=" + precioLista + "]";
	}	

}
