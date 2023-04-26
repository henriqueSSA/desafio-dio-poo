package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcap Java Developer");
		bootcamp.setDescricao("Descrição BootCamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devHenrique = new Dev();
		devHenrique.setNome("Henrique");
		devHenrique.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos" + devHenrique.getConteudosInscritos());
		devHenrique.progredir();
		System.out.println("Progresso");
		System.out.println("Conteudos inscritos" + devHenrique.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devHenrique.getConteudosConcluidos());
		System.out.println("XP"+ devHenrique.calcularTotalXp());
		
		System.out.println("----------------------------");
		
		
		Dev devAndre = new Dev();
		devHenrique.setNome("Andre");
		devAndre.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos" + devAndre.getConteudosInscritos());
		devAndre.progredir();
		devAndre.progredir();
		devAndre.progredir();
		System.out.println("Progresso");
		System.out.println("Conteudos inscritos" + devAndre.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devHenrique.getConteudosConcluidos());
		System.out.println("XP"+ devAndre.calcularTotalXp());
		
		

	}

}
