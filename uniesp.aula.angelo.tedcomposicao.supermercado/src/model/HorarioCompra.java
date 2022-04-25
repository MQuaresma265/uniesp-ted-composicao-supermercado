package model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HorarioCompra {
	
	private LocalDateTime dataHora;
	private int hora;

	public HorarioCompra(int dia, int mes, int ano, int hora, int minuto, int segundo) {

		if (dia < 1 || dia > 31) {
			throw new IllegalArgumentException("O dia informado deve ser entre 1 e 31 !");
		}
		if (mes < 1 || mes > 12) {
			throw new IllegalArgumentException("O mês informado deve ser entre 1 e 12 !");
		}
		if (ano != 2022) {
			throw new IllegalArgumentException("O ano informado deve ser o atual !");
		}
        if(!(hora >=0 && hora <24 )) {
            throw new IllegalArgumentException("Hora inválida");
        }
        if(!(minuto >=0 && minuto < 60)) {
            throw new IllegalArgumentException("Minutos inválidos");
        }
        if(!(segundo >=0 && segundo < 60)) {
            throw new IllegalArgumentException("Segundos inválidos");  
        }
        
        String dataHoraFormatada = String.format("%02d/%02d/%02d %02d:%02d:%02d", dia, mes, ano, hora, minuto, segundo);		
		this.setDataHora(LocalDateTime.parse(dataHoraFormatada, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		this.hora = hora;
	}
	
	public String getDiaDaSemana() {
		if(dataHora.getDayOfWeek() == DayOfWeek.MONDAY) {
			return "Segunda-feira";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.TUESDAY) {
			return "Terça-feira";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
			return "Quarta-feira";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.THURSDAY) {
			return "Quinta-feira";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.FRIDAY) {
			return "Sexta-feira";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.SATURDAY) {
			return "Sábado";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.SUNDAY) {
			return "Domingo";
		}
		return "";
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public String getDataHoraFormatoBrasileiro() {
		return String.format("%02d/%02d/%02d %02d:%02d:%02d", dataHora.getDayOfMonth(), dataHora.getMonthValue(), dataHora.getYear(), dataHora.getHour(), dataHora.getMinute(), dataHora.getSecond());
	}
}
