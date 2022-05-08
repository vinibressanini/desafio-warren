# Desafio - Warren

## Repositório para o desafio de programação da Warren Academy

* [Descrição](#Descrição)
  * [Desafio1](#Desafio1)
    
    Alguns números inteiros positivos n possuem uma propriedade na qual a soma de n + reverso(n) resultam em números ímpares. Por exemplo, 36 + 63 = 99 e 409 + 904 = 1313. Considere que n ou reverso(n) não podem começar com 0.
    Existem 120 números reversíveis abaixo de 1000.
    Construa um algoritmo que mostre na tela todos os números n onde a soma de n + reverso(n) resultem em números ímpares que estão abaixo de 1 milhão.
    
  * [Desafio2](#Desafio2)
    
    Um professor de programação, frustrado com a falta de disciplina de seus alunos, decidi cancelar a aula se menos de x alunos estiverem presentes quando a aula for iniciada. O tempo de chegada varia entre:

    Normal: tempoChegada <= 0
    Atraso: tempoChegada > 0
    Construa um algoritmo que dado o tempo de chegada de cada aluno e o limite x de alunos presentes, determina se a classe vai ser cancelada ou não ("Aula cancelada” ou “Aula normal”).

    Exemplo:

    Entrada de dados:
    x = 3
    tempoChegada = [-2, -1, 0, 1, 2]

    Saída de dados:
    Aula normal.

    Explicação:
    Os três primeiros alunos chegaram no horário. Os dois últimos estavam atrasados. O limite é de três alunos, portanto a aula não será cancelada.
   
* [Como Utilizar](#Como-Utilizar)
    * [Desafio 1](#Desafio-1)
      
      Para executar este desafio basta "fazer um fork", uma vez feito o projeto irá para os seus repositórios. Lá você deve cloná-lo para a sua máquina em uma pasta de       sua escolha. Agora basta abri-lo por meio da IDE de sua preferência. Uma vez com o projeto, faça o seguinte caminho, desafio-warren/src/questoes, lá se encontram       os desafios. Acesse a classe Questao1 e execute ela, no console será retornado todos os números reversíveis onde a soma de n + n reverso é menor que 1.000.000 e       a quantidade de números reversíveis. 
      
    * [Desafio 2](#Desafio-2)

      No mesmo package se encontra a classe Questao2, ao ser executada será exibido no console as informações para o usuário. De primeira mão será exibida a uma mensagem para o usuário informar o horário de chegada dos alunos, o usuário deverá informar números negativos e/ou 0 caso o aluno chegue antecipadamente e números positivos caso o aluno chegue atrasado, para encerrar o envio dos horários deve-se informar o número 9999. Logo após será exibida uma mensagem para o usuário indicando que ele deve informar o limite de alunos presentes para a aula ocorrer. Após a coleta destas informações o resultado é exibido no console.
      
* [Tecnologias Utilizadas](#Tecnologias-Utilizadas)

   Java 11.0.9 2020-10-20 LTS  
   
   IntelliJ IDEA 2021.3.2 (Community Edition) Build #IC-213.6777.52, built on January 28, 2022
  
  


    
