package Model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

public final class Usuario extends Dados{
	private String userName, cargo;
	private boolean estado;
	private Caixa venda;
	private LocalDateTime dataHoraCriacao;
	private LocalDateTime ultimoLoguin;
	
	
	Scanner scanner = new Scanner(System.in);
	
	public Usuario() {
		this.setId(0);
		this.cargo = "Caixa";
		this.estado = false;
	}
	
	public void perfil() {
		System.out.println("Id: " + this.getId());
		System.out.println("Nome:" + this.getNome());
		System.out.println("Username: " + this.userName);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Estado: " + this.estado);
		System.out.println("N de vendas: " + this.venda);
	}
	
	public void adicionar() {
		this.estado = true;
		if(this.isEstado()) {
			
			//System.out.print("ID: ");
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