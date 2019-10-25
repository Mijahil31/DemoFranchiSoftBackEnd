package com.franchisoft.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cliente")
public class ClienteModel {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nombre")
		private String nombre;
		
		@Column(name = "apellido")
		private String apellido;
		
		@Column(name = "direccion")
		private String direccion;
		
		@Column(name = "Dni")
		private String Dni;
		
		@Column(name = "fecha")
		@Temporal(TemporalType.TIMESTAMP)
		private Date fecha;
		
		public ClienteModel(Long id, String nombre, String apellido, String direccion, String dni, Date fecha) {
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.direccion = direccion;
			Dni = dni;
			this.fecha = fecha;
		}

		public ClienteModel() {
		}

		public Long getId() {
			return id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getDni() {
			return Dni;
		}

		public void setDni(String dni) {
			Dni = dni;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		@Override
		public String toString() {
			return "ClienteModel [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
					+ direccion + ", Dni=" + Dni + ", fecha=" + fecha + "]";
		}
		
}
