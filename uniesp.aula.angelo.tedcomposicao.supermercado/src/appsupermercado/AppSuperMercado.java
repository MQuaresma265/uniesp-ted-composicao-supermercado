package appsupermercado;

import java.util.Arrays;

import model.HorarioCompra;
import model.ListaCompra;
import model.Produto;
import repository.ListaCompraRepository;

public class AppSuperMercado {
	
	public static void main(String[] args) {
		
		Produto item1 = new Produto("Leite Ninho", 38.99);
		Produto item2 = new Produto("Fralda pacote pequeno", 22.50);
		Produto item3 = new Produto("Maçã o kg", 10);
			
		HorarioCompra dataHoraSextaSemDesconto = new HorarioCompra(25, 4, 2022, 19, 0, 0);
											
		ListaCompra compraSextaSemDesconto = new ListaCompra(Arrays.asList(item1, item2, item3), dataHoraSextaSemDesconto);
		
		ListaCompraRepository.compras.add(compraSextaSemDesconto);
		
		Produto item01 = new Produto("Ovos 15 unidade", 9);
		Produto item02 = new Produto("Frango", 17.99);
		Produto item03 = new Produto("Toscana o kg", 24);
			
		HorarioCompra dataHoraSextaComDesconto = new HorarioCompra(25, 4, 2022, 20, 0, 0);
											
		ListaCompra compraSextaComDesconto = new ListaCompra(Arrays.asList(item01, item02, item03), dataHoraSextaComDesconto);
		
		ListaCompraRepository.compras.add(compraSextaComDesconto);
		
		Produto item001 = new Produto("Nissin Lamen", 5);
		Produto item002 = new Produto("Polpa fruta a unidade", 3.9);
		Produto item003 = new Produto("Energetico Monster", 9.9);
			
		HorarioCompra dataHoraSextaComDesconto2 = new HorarioCompra(25, 4, 2022, 21, 0, 0);
											
		ListaCompra compraSextaComDesconto2 = new ListaCompra(Arrays.asList(item001, item002, item003), dataHoraSextaComDesconto2);
		
		ListaCompraRepository.compras.add(compraSextaComDesconto2);
		
		Produto item0001 = new Produto("PIZZA GRANDE", 15);
		Produto item0002 = new Produto("REFRIGERANTE", 8);
		Produto item0003 = new Produto("SUCO CITRICO", 7.5);
			
		HorarioCompra dataHoraSextaComDesconto3 = new HorarioCompra(23, 4, 2022, 13, 0, 0);
											
		ListaCompra compraSextaComDesconto3 = new ListaCompra(Arrays.asList(item0001, item0002, item0003), dataHoraSextaComDesconto3);
		
		ListaCompraRepository.compras.add(compraSextaComDesconto3);
	}

}
