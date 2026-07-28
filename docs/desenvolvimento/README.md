# Desenvolvimento

## Objetivo

Esta pasta reúne toda a documentação relacionada ao processo de desenvolvimento do Synaris.

Seu propósito é definir padrões que garantam consistência durante todo o ciclo de vida do projeto, desde a criação de uma nova funcionalidade até sua integração à branch principal.

Os documentos aqui presentes estabelecem convenções para organização das branches, mensagens de commit e fluxo de trabalho adotado durante o desenvolvimento.

Essa documentação deve ser seguida em todas as funcionalidades do projeto, independentemente do Bounded Context ao qual pertençam.

---

# Organização

A documentação de desenvolvimento está dividida em três documentos principais.

## Estratégia de Branches

Define a estratégia de versionamento utilizada no projeto.

Esse documento descreve:

* estrutura das branches;
* convenção de nomenclatura;
* quando criar uma branch;
* quando realizar o merge;
* quando remover uma branch.

---

## Convenção de Commits

Define o padrão utilizado para criação das mensagens de commit.

Esse documento estabelece:

* tipos de commit adotados;
* formato das mensagens;
* escopos;
* boas práticas para criação de um histórico limpo e consistente.

---

## Fluxo de Desenvolvimento

Define o processo completo de desenvolvimento de uma funcionalidade.

Esse documento descreve todas as etapas que devem ser seguidas durante a implementação de um Bounded Context ou de qualquer outra funcionalidade do sistema, desde o planejamento até sua integração na branch principal.

---

# Princípios

O desenvolvimento do Synaris segue os seguintes princípios.

## Funcionalidades completas

Cada branch representa uma única funcionalidade.

Toda a documentação, modelagem, implementação e testes relacionados àquela funcionalidade devem ser realizados dentro da mesma branch.

---

## Histórico organizado

Os commits devem representar pequenas evoluções da funcionalidade.

Cada commit deve possuir um único objetivo claramente definido, permitindo compreender facilmente a evolução do projeto por meio do histórico do Git.

---

## Documentação antes da implementação

Sempre que aplicável, a documentação deve ser elaborada antes da implementação.

A modelagem do domínio, as regras de negócio e as decisões arquiteturais servem como base para o desenvolvimento do código.

---

## Desenvolvimento incremental

As funcionalidades devem ser implementadas de forma incremental.

Cada entrega deve representar uma evolução completa, coesa e potencialmente integrável ao projeto.

---

## Consistência

Todos os módulos do sistema devem seguir o mesmo processo de desenvolvimento.

A padronização reduz inconsistências, facilita manutenção e torna a evolução do projeto previsível.

---

# Escopo

Esta documentação é aplicável a todo o repositório.

Qualquer nova funcionalidade, correção, refatoração ou melhoria deve seguir os padrões definidos nesta pasta.

Caso o processo de desenvolvimento evolua ao longo do projeto, esta documentação deverá ser atualizada antes da adoção do novo fluxo.
