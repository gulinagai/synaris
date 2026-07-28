# Convenção de Commits

## Objetivo

Este documento define o padrão de mensagens de commit adotado no Synaris.

O objetivo é manter um histórico organizado, consistente e facilmente compreensível, permitindo identificar rapidamente a natureza de cada alteração realizada no projeto.

---

# Padrão adotado

O Synaris utiliza o padrão **Conventional Commits**.

Todas as mensagens de commit devem seguir o formato:

```text
<tipo>(<escopo>): <descrição>
```

Onde:

* **tipo** identifica a natureza da alteração;
* **escopo** identifica o módulo, contexto ou área afetada;
* **descrição** resume objetivamente a alteração realizada.

---

# Tipos de commit

## feat

Utilizado para implementação de novas funcionalidades.

Exemplos:

```text
feat(pacientes): implementa cadastro de paciente

feat(atendimento): adiciona registro de consulta
```

---

## fix

Utilizado para correção de defeitos.

Exemplos:

```text
fix(pacientes): corrige validação de CPF

fix(farmacia): corrige cálculo de estoque
```

---

## docs

Utilizado para criação ou atualização da documentação.

Exemplos:

```text
docs(pacientes): documenta linguagem ubíqua

docs(desenvolvimento): define estratégia de branches
```

---

## refactor

Utilizado para alterações estruturais que não modificam o comportamento da aplicação.

Exemplos:

```text
refactor(pacientes): extrai CPF para Value Object

refactor(atendimento): reorganiza serviços de domínio
```

---

## test

Utilizado para criação ou atualização de testes.

Exemplos:

```text
test(pacientes): adiciona testes de cadastro

test(financeiro): amplia cobertura do serviço
```

---

## build

Utilizado para alterações relacionadas à construção da aplicação.

Exemplos:

```text
build: atualiza dependências

build: configura plugin do Maven
```

---

## chore

Utilizado para tarefas de manutenção que não alteram regras de negócio nem funcionalidades da aplicação.

Exemplos:

```text
chore: atualiza .gitignore

chore: reorganiza estrutura do projeto
```

---

# Escopo

O escopo identifica a área afetada pela alteração.

Sempre que possível, deve representar um Bounded Context, módulo ou diretório claramente identificado no projeto.

Exemplos de escopo:

* pacientes
* atendimento
* farmacia
* laboratorio
* financeiro
* iam
* desenvolvimento
* arquitetura
* negocio

---

# Descrição

A descrição deve ser escrita em português.

Ela deve ser objetiva, direta e representar exatamente a alteração realizada.

Boas práticas:

* utilizar verbo no presente;
* iniciar com letra minúscula;
* evitar descrições genéricas;
* descrever apenas uma alteração por commit.

Exemplos:

```text
implementa cadastro de paciente

adiciona DER do contexto

corrige validação de e-mail

documenta regras de negócio
```

---

# Granularidade

Cada commit deve representar uma única alteração lógica.

Alterações independentes não devem ser agrupadas em um mesmo commit.

Commits menores tornam o histórico mais legível, facilitam revisões e simplificam a identificação de problemas.

---

# Organização do histórico

Durante o desenvolvimento de uma funcionalidade, os commits devem representar a evolução natural da entrega.

Sempre que possível, a sequência deve refletir o fluxo de desenvolvimento adotado pelo projeto:

1. documentação;
2. modelagem do domínio;
3. implementação;
4. testes;
5. refatorações necessárias.

Essa organização facilita a compreensão da evolução de cada funcionalidade ao longo do histórico do Git.

---

# Commits proibidos

Não devem ser utilizados commits com mensagens genéricas ou sem significado técnico.

Exemplos de mensagens que não devem ser utilizadas:

```text
update

ajustes

teste

commit

alterações

correções

wip

...
```

Toda mensagem deve descrever claramente a alteração realizada.

---

# Alterações nesta convenção

Qualquer modificação nesta convenção deverá ser documentada antes de ser adotada no projeto.

A padronização do histórico é considerada parte da qualidade técnica do Synaris e deve ser preservada durante toda a evolução da aplicação.
