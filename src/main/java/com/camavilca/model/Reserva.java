package com.camavilca.model;
import javax.persistence.Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity
public class Reserva {
	
	//David
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "res_id")
	private long res_id;
	
	@Column(name = "cli_id")
	private int cli_id;
	
	@Column(name = "des_id") 
	private int des_id;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "res_asiento")
	private int res_asiento;
	
	@Column(name = "res_fecha") 
	private String res_fecha;
	
	@Column(name = "res_fecha_reserva")
	private String res_fecha_reserva;
	
	@Column(name = "res_hora")
	private String res_hora;
	
	public Reserva(long res_id, int cli_id, int des_id, double precio, int res_asiento, String res_fecha,
			String res_fecha_reserva, String res_hora) {
		super();
		this.res_id = res_id;
		this.cli_id = cli_id;
		this.des_id = des_id;
		this.precio = precio;
		this.res_asiento = res_asiento;
		this.res_fecha = res_fecha;
		this.res_fecha_reserva = res_fecha_reserva;
		this.res_hora = res_hora;
	}
	
	public Reserva() {
		super();
	}
	
	public long getRes_id() {
		return res_id;
	}
	public void setRes_id(long res_id) {
		this.res_id = res_id;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cli_id")
	
	public int getCli_id() {
		return cli_id;
	}
	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "des_id")
	
	public int getDes_id() {
		return des_id;
	}
	public void setDes_id(int des_id) {
		this.des_id = des_id;
	}
	public int getRes_asiento() {
		return res_asiento;
	}
	public void setRes_asiento(int res_asiento) {
		this.res_asiento = res_asiento;
	}
	public String getRes_hora() {
		return res_hora;
	}
	public void setRes_hora(String res_hora) {
		this.res_hora = res_hora;
	}
	public String getRes_fecha() {
		return res_fecha;
	}
	public void setRes_fecha(String res_fecha) {
		this.res_fecha = res_fecha;
	}
	public String getRes_fecha_reserva() {
		return res_fecha_reserva;
	}
	public void setRes_fecha_reserva(String res_fecha_reserva) {
		this.res_fecha_reserva = res_fecha_reserva;
	}
	
	@Override
	public String toString() {
		return "Reserva [res_id=" + res_id + ", cli_id=" + cli_id + ", des_id=" + des_id + ", precio=" + precio
				+ ", res_asiento=" + res_asiento + ", res_fecha=" + res_fecha + ", res_fecha_reserva="
				+ res_fecha_reserva + ", res_hora=" + res_hora + "]";
	}
	
	
}
