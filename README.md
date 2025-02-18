# dio-trilha-java-oop
Repositório para armazenar exercícios de POO do bootcamp Bradesco Java-DIO

Enunciado dos exercícios feitos neste repositório

## ContaBancaria

O execício deve ter um menu interativo para chamar as funções e ter uma opção de sair para finalizar a execução

Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
Consultar saldo
- consultar cheque especial
- Depositar dinheiro;
- Sacar dinheiro;
- Pagar um boleto.
- Verificar se a conta está usando cheque especial.

Siga as seguintes regras para implementar

- A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
- O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
- Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
- Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
- Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.


## HerancaIngresso

Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema. O ingresso deve ter um valor, nome do filme e informar se é dublado ou legendado. A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso família. Cada ingresso deve ter um método que retorna o seu valor real ( baseado no valor informado na criação do ingresso) para os de meia entrada o seu valor deve ser de metade do valor, para os ingressos família deve-se retornar o valor multiplicado pelo número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.

## HierarquiaUsuarioSistema

Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, use os seguintes requisitos:

- Classe Gerente que terá os atributos: Nome, Email, Senha e um atributo que informa se ele é administrador, esse último deve ser sempre verdadeiro;
- Classe Vendedor que terá os seguintes atributos: Nome, Email, Senha, Quantidade de vendas e um atributo que informa se ele é administrador, esse útimo deve ser sempre falso;
- Classe Atendente que terá os seguintes atributos: Nome, Email, Senha, Valor em caixa e um atributo que informa se ele é administrador, esse ultimo deve ser sempre falso.

- Cada classe deve ter seus respectivos getters e setters ( para atributos que façam sentido ter) e as classes devem ter os seguintes métodos

- A classe Gerente deve ter os métodos Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar logff, alterar dados, alterar senha;
- A classe Vendedor deve ter os métodos Realizar venda ( incrementar o número de vendas quando acionado), Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha;
- A classe Atendente deve ter os métodos Receber pagamentos (onde o método recebe um valor que deve ser incrementado no valor em caixa), Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar senha;

## ModelandoIphone

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class Ipod {
        +TocarMusica()
        +PausarMusica()
        +SelecionarMusica(String musica)
    }

    class Telefone {
        +Liga(String numero)
        +Atende()
        +IniciarCorreioVoz()
    }

    class NavegadorInternet {
        +ExibirPagina(String url)
        +AdicionarNovaAba()
        +AtualizarPagina
    }

    class iPhone {
    }

    iPhone -> ReprodutorMusical
    iPhone -> AparelhoTelefonico
    iPhone -> NavegadorInternet
```
