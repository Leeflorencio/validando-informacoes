package com.br.beecrowd;

import java.util.Scanner;

public class ValideInformacoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        Integer idade;
        Double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Informe as seguintes informações: Nome, idade, salário, sexo e estado cívil: ");
            nome = sc.next();
            idade = sc.nextInt();
            salario = sc.nextDouble();
            sexo = sc.next();
            estadoCivil = sc.next();

            if (nome.length() < 3) {
                System.out.println("Nome precisa ter mais de 3 caracteres");
            } else if (idade < 0 || idade > 150) {
                System.out.println("Informe uma idade entre 0 e 150 anos");
            } else if (salario < 0) {
                System.out.println("Informe um salário maior que 0: ");
            } else if (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
                System.out.println("Digite 'F' para sexo Feminino ou 'M' para sexo Masculino");
            } else if (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c")
                    && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
                System.out.println("Digite 'S' para solteiro, 'C' para casado, 'V' para viuvo e 'd' para divorciado");
            } else {
                break;
            }

        } while (true);

        System.out.println("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Salário: "
                + salario + "\n" + "Sexo: " + sexo + "\n" + "Estado Civil: " + estadoCivil);
    }
}
