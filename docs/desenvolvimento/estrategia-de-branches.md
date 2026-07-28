# Estratégia de Branches

## Objetivo

Este documento define a estratégia de versionamento adotada no Synaris.

Seu objetivo é estabelecer um fluxo de desenvolvimento simples, consistente e previsível, permitindo que cada funcionalidade seja desenvolvida de forma isolada até estar pronta para integração à branch principal.

A estratégia adotada busca manter um histórico organizado, facilitar revisões, reduzir conflitos durante o desenvolvimento e tornar a evolução do projeto facilmente compreensível.

---

# Branch principal

O projeto possui uma única branch permanente.

```text
main
```

A branch `main` representa sempre a versão estável do projeto.

Somente funcionalidades concluídas, documentadas, implementadas, testadas e revisadas podem ser integradas à `main`.

Nenhum desenvolvimento deve ser realizado diretamente nesta branch.

---

# Branches de funcionalidade

Todo desenvolvimento deve ocorrer em uma branch de funcionalidade.

Cada branch representa uma única funcionalidade ou entrega incremental do sistema.

Uma funcionalidade deve possuir um objetivo único e claramente definido, permitindo que seja desenvolvida, revisada e integrada de forma independente.

Toda a documentação, modelagem do domínio, implementação, testes e refatorações necessárias para concluir essa funcionalidade devem ocorrer dentro da mesma branch.

Após a conclusão da funcionalidade, a branch deverá ser integrada à `main` por meio de um Pull Request.

---

# Convenção de nomenclatura

As branches de funcionalidade devem seguir o padrão:

```text
feature/<contexto>-<funcionalidade>
```

O nome deve ser curto, descritivo e utilizar letras minúsculas.

Palavras compostas devem ser separadas por hífen.

Exemplos:

```text
feature/pacientes-cadastro

feature/pacientes-atualizacao

feature/pacientes-consulta

feature/atendimento-agendamento

feature/farmacia-dispensacao

feature/financeiro-faturamento
```

---

# Escopo de uma branch

Cada branch deve possuir apenas um objetivo.

Todo trabalho realizado nela deve contribuir exclusivamente para a conclusão da funcionalidade que representa.

Caso seja identificada uma necessidade não relacionada ao objetivo da branch, essa alteração deverá ser desenvolvida em uma nova branch de funcionalidade.

Essa abordagem mantém as entregas menores, facilita revisões, reduz conflitos durante o merge e produz um histórico de desenvolvimento mais organizado.

---

# Ciclo de vida

O ciclo de vida de uma branch de funcionalidade segue as etapas abaixo.

1. Criar a branch a partir da `main`.

2. Atualizar a documentação impactada pela funcionalidade.

3. Modelar ou atualizar o domínio, quando necessário.

4. Implementar a funcionalidade.

5. Criar ou atualizar os testes.

6. Revisar toda a entrega.

7. Abrir um Pull Request.

8. Integrar a branch à `main`.

9. Remover a branch após o merge.

---

# Desenvolvimento dentro da branch

Toda branch representa uma entrega completa.

Isso significa que todas as atividades necessárias para concluir aquela funcionalidade devem ocorrer dentro da mesma branch, incluindo:

* atualização da documentação;
* modelagem do domínio;
* atualização dos diagramas;
* implementação;
* testes;
* refatorações relacionadas à funcionalidade.

A documentação evolui junto com o código e deve permanecer consistente durante todo o desenvolvimento.

---

# Integração

A integração à `main` deve ocorrer somente quando a funcionalidade estiver concluída.

Antes da integração, devem ser verificados:

* documentação atualizada;
* modelagem consistente com a implementação;
* implementação concluída;
* testes executados;
* ausência de conflitos com a branch principal.

Após o merge, a branch de funcionalidade deverá ser removida.

---

# Pull Requests

Toda integração com a `main` deve ocorrer por meio de um Pull Request.

O Pull Request representa o ponto oficial de revisão da funcionalidade e registra sua integração ao histórico do projeto.

Cada Pull Request deve representar uma única entrega funcional.

---

# Correções

Caso seja necessário corrigir uma funcionalidade já integrada à `main`, deverá ser criada uma nova branch de funcionalidade.

As correções devem seguir o mesmo fluxo definido neste documento, incluindo documentação, implementação, testes e revisão.

Alterações nunca devem ser realizadas diretamente na branch principal.

---

# Evolução da estratégia

Esta estratégia poderá ser revisada conforme a evolução do projeto ou a necessidade de adoção de novos processos.

Toda alteração deverá ser documentada antes de ser incorporada ao fluxo oficial de desenvolvimento do Synaris.
