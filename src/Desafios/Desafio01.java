package Desafios;

public class Desafio01 {
    public static void main(String[] args) {

        /*
         * Descrição do Desfio: Crie um programa que representa Três
         Ninjas vila da folha (kanoha) de "Naruto" e suas respectivas missôes.
         ......................................................
         * Cada ninja tem um nome , uma idade e uma
         missão atribuida a ele, com o nome da missão , nivel de dificuldade e status de conclusão.
         */

        //Declaradndo as variaveis
        String nomeNinja1 = "Naruto";
        int idade1 = 14;
        String misaoNinja1 = "Atravessar o Rio";
        char nivelMissao1 = 'C';
        String statusMissao1 = "Em andamento";

        if (idade1 < 15) {
            if (nivelMissao1 == 'C' || nivelMissao1 == 'D') {
                statusMissao1 = "Concluidaaaaa";
            } else {
                statusMissao1 = "Nao foi possivel concluir a misão.";
            }

        } else {
            statusMissao1 = "Concluida com sucesso.";
        }

        //Impresões na tela usando o ln
        System.out.println(" Meu nome é: " + nomeNinja1);
        System.out.println(" tenho: " + idade1 + " Anos ");
        System.out.println(" Minha missão é: " + misaoNinja1);
        System.out.println(" O nivel da minha misão é: " + nivelMissao1);
        System.out.println(" Atualmente a misão está em : " + statusMissao1);


        System.out.println("*******************************************");

        //Declaradndo as variaveis
        String nomeNinja2 = "Minato Namikaze";
        int idade2 = 30;
        String misaoNinja2 = "Subir na arvore";
        char nivelMissao2 = 'C';
        String statusMissao2 = "Concluida";

        if (idade1 < 15) {
            if (nivelMissao1 == 'C' || nivelMissao1 == 'D') {
                statusMissao1 = "Concluidaaaaa";
            } else {
                statusMissao1 = "Nao foi possivel concluir a misão, você não tem idade suficiente .";
            }

        } else {
            statusMissao1 = "Concluida com sucesso.";
        }

        //Impresões na tela usando o ln
        System.out.println(" Meu nome é: " + nomeNinja2);
        System.out.println(" tenho: " + idade2 + " Anos ");
        System.out.println(" Minha missão é: " + misaoNinja2);
        System.out.println(" O nivel da minha misão é: " + nivelMissao2);
        System.out.println(" Atualmente a misão está em : " + statusMissao2);



        System.out.println("*******************************************");

        //Declaradndo as variaveis
        String nomeNinja3 = "Hashirama Senju";
        int idade3 = 11;
        String misaoNinja3 = "Defender a aldeira";
        char nivelMissao3 = 'B';
        String statusMissao3 = "Concluida";

        if (idade1 < 15) {
            if (nivelMissao1 == 'C' || nivelMissao1 == 'D') {
                statusMissao1 = "Concluidaaaaa";
            } else {
                statusMissao1 = "Você não tem idade vá dormir ...";
            }

        } else {
            statusMissao1 = "Concluida com sucesso.";
        }

        //Impresões na tela usando o ln
        System.out.println(" Meu nome é: " + nomeNinja3);
        System.out.println(" tenho: " + idade3 + " Anos ");
        System.out.println(" Minha missão é: " + misaoNinja3);
        System.out.println(" O nivel da minha misão é: " + nivelMissao3);
        System.out.println(" Atualmente a misão está em : " + statusMissao3);


        System.out.println("*******************************************");


    }
}
