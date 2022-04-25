package model;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class ListaCompra {
	
	private static Integer id = 0;
	private List<Produto> produtos = new ArrayList<>();
	private Double valorTotal = 0.0;
	private Double descontos = 0.0;
	
	public void apresentacaoCompra(HorarioCompra horarioCompra) {
		System.out.println("- NFCE Nº " + id);
		System.out.println("- HORÁRIO: " + horarioCompra.getDataHoraFormatoBrasileiro());
		System.out.println("- DIA DA SEMANA: " + horarioCompra.getDiaDaSemana() + "\n");
	}
	
	public ListaCompra(List<Produto> produtos, HorarioCompra horarioCompra) {
		id += 1;
		this.produtos = produtos;
		
		apresentacaoCompra(horarioCompra);
		
		if(horarioCompra.getHora() >= 20
				|| horarioCompra.getDataHora().getDayOfWeek() == DayOfWeek.SATURDAY 
				|| horarioCompra.getDataHora().getDayOfWeek() == DayOfWeek.SUNDAY) {
			
			System.out.println("- DESCONTOS EXCLUSIVO !!!\n");
			
			this.produtos.forEach(produto -> {
				System.out.print(produto);
				valorTotal += produto.getPreco();
				double valorDoDesconto = produto.getPreco() * .10;
				descontos += valorDoDesconto;
				System.out.printf(" - R$ %.2f = R$ ", valorDoDesconto);
				produto.setPreco(produto.getPreco() - valorDoDesconto);
				System.out.printf("%.2f%n", produto.getPreco());
			});
		} else {
			this.produtos.forEach(produto -> {
				System.out.println(produto);
				valorTotal += produto.getPreco();
			});
		}
		System.out.printf("%n- TOTAL DA COMPRA: R$ %.2f%n", valorTotal);
		System.out.printf("- DESCONTO: R$ %.2f%n", descontos);
		System.out.printf("- TOTAL COM DESCONTO: R$ %.2f%n", valorTotal - descontos);
		System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
	}

}
