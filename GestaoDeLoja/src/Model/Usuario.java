package Model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

public class Usuario {
	private long id;
	private String nome, userName, cargo;
	private boolean estado;
	private Venda venda;
	private LocalDateTime dataHoraCriacao;
	private LocalDateTime ultimoLoguin;
	
	
	Scanner scanner = new Scanner(System.in);
	
	public Usuario() {
		this.id = id++;
		this.cargo = "Caixa";
		this.estado = false;
	}
	
	public void perfil() {
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Username: " + this.userName);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Estado: " + this.estado);
		System.out.println("N de vendas: " + this.venda);
	}
	
	public void adicionar() {
		this.estado = true;
		if(this.isEstado()) {
			
			//System.out.print("ID: ");
			this.id += id;
			System.out.println("Digite o seu nome: ");
			this.nome = scanner.nextLine();
			System.out.println("Digite o seu username");
			this.userName = scanner.nextLine();
		}else {
			//System.out.println("Para adicionar usuario abilite o estado \nEstado: " + this.isEstado());
		}
	}
	
	public void editar() {
		
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}