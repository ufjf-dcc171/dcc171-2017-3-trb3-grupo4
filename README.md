**Trabalho 3 DCC171**

**Nome: João Pedro de Souza Jardim Costa 
Matricula: 201476044 
Curso: Sistemas de Informação**

**Nome: Maria Meiriele Dias da Silva 
Matricula: 201476009 
Curso: Sistemas de Informação**

**Texto Explicativo:**

O sistema tem como objetivo armazenar e trabalhar com o gerenciamento de tarefas, projetos e pessoas associadas. Além disso, visa ter uma estruturação de fácil entendimento para o usuário.
Os dados estão estruturados em classes baseadas no conceito de orientação a objetos. Temos a classe Pessoa que possui nome_Pessoa, e_mail,  nome_Tarefa  a qual ela está associada. Indivíduos cadastrados nessa classe serão os responsáveis por executar as tarefas presente em cada projetos.  O projeto faz parte da classe Tarefa composta por (nome_Projeto, nome_Tarefa, estado, data_inicio, data_fim, percentual_de_andamento,duracao_esperada. As tarefas podem ser realizadas por mais de uma Pessoa e pode ocorrer de uma tarefa depender de outra para prosseguir na execução do projeto.

**Modelo de dados:**


Clique no link abaixo para visualizar.


https://drive.google.com/open?id=1VySBuwhbjSp48uqDFZwPQPNoVk4e_FIu

Classes utilizadas:

**Interfaces:**

o	JanelaEditarAdicionar;

o	JanelaListaTarefas;

o	JanelaPendentes;

o	JanelaPessoas;

o	JanelaPrincipal;

**Dados:**

o	Pessoa;

o	Tarefa;

**Conexão do banco:**

o	ConexaoDB;

**JanelaEditarAdicionar =** permite nomear o projeto, colocar a duração estimada, e o percentual de andamento do mesmo.

**JanelaListaTarefas =** Lista todas as tarefas existentes.

**JanelaPendentes =** Lista todas as tarefas pendentes, ou seja, começadas e não terminadas ou que estão dependendo de outras tarefas associadas.

**Janela Pessoa =** Permite adicionar ou remover pessoas que colaboram com o projeto.

**JanelaPrincipal : Composta de vários botões de comandos como:**

link para a imagem abaixo:

https://drive.google.com/open?id=18FouObfFtSLH7ZsnCO-bGL0Zr0ld12dz

**ComboBox Projetos:** Que traz todos o projeto cadastrados no sistema.

**Listar Concluidas:** Lista todas as tarefas concluídas na tabela abaixo

**Listar Correntes:** Lista todas as tarefas que estão em andamento na tabela abaixo.

**Pessoas Associadas**: Mostra o nome e email das pessoas associadas as tarefas na tabela abaixo.

**Listar Prontas a Iniciar:** Lista as tarefas que foram cadastradas mas que ainda não foram iniciadas.

**Editar:** Edita as tarefas.

**Adicionar Tarefas:** Adiciona uma nova Tarefa a um determinado Projeto.

**Listar Pendentes:** Lista tarefas que não foram terminadas.

**Pendências:** Mostra tarefas que estão pendentes de outras.

**Remover Tarefa:** Remove uma tarefa que ainda não foi terminada.

**Adicionar Projeto:** Basta colocar o nome do projeto no campo ao lado e clicar para adicionar, que um novo projeto será guardado, e já aparecerá no ComboBox da janela.

**Remover Projeto:** Basta inserir o nome do projeto corretamente e clicar em remover projeto.

**Iniciar Tarefa:** Inicializa uma nova tarefa.

**Finalizar Tarefa:** Finaliza a tarefa, ou seja, da como pronta a tarefa em questão.


**Instruções para a execução inicial e montagem do banco de dados:**

1.	Criar banco de dados local no projeto: 
Nome: **tarefas** 
Usuário: **usuario** 
Senha: **senha**
2.	Execute o arquivo **Banco de dados.sql** para que todas as tabelas e estrutura do banco de dados sejam criadas.


