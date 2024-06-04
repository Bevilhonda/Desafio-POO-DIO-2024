package com.banco;

import desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Olá Mundo ! ");

        Conteudo conteudo = new Curso("Curso Java" , "DIO 2024",60);
        Curso curso1 = new Curso("Curso Java" , "DIO 2024",60);
        Curso curso2 = new Curso("Curso Kotlin" , "DIO 2024",60);

        Mentoria mentoria = new Mentoria("Mentoria de Java","Descrição ; Mentoria de Java", LocalDate.now());

        System.out.println(conteudo);

        BootCamp bootCamp = new BootCamp(
                "Programação Java.","Descrição : Bootcamp Java Developer.");

        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev pedro = new Dev("Pedro","Batista");
        pedro.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos inscritos: " + pedro.getConteudoEscritos());
        pedro.progredir();
        System.out.println("*************************");
        System.out.println("Conteudos inscritos: " + pedro.getConteudoEscritos());
        pedro.progredir();
        System.out.println("Conteudos inscritos: " + pedro.getConteudoEscritos());
        System.out.println("Conteudos concluidos: " + pedro.getConteudoConcluido());
        System.out.println("XP:" +  pedro.calcularTotalXP());



        Dev jorge = new Dev("Jorge","Lima");
        jorge.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos inscritos: " + jorge.getConteudoEscritos());
        jorge.progredir();
        System.out.println("*************************");
        System.out.println("Conteudos inscritos: " + jorge.getConteudoEscritos());
        jorge.progredir();
        System.out.println("Conteudos inscritos: " + jorge.getConteudoEscritos());
        System.out.println("Conteudos concluidos: " + jorge.getConteudoConcluido());
        System.out.println("XP:" +  jorge.calcularTotalXP());


    }
}