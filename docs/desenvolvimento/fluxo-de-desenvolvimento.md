# Fluxo de Desenvolvimento

## Objetivo

Este documento define o processo oficial de desenvolvimento adotado no Synaris.

Seu objetivo é estabelecer um fluxo padronizado para o desenvolvimento de novas funcionalidades, garantindo consistência entre documentação, modelagem do domínio, implementação, testes e integração do código.

Todo desenvolvimento realizado neste projeto deve seguir o processo descrito neste documento.

---

# Princípios

O processo de desenvolvimento do Synaris é guiado pelos seguintes princípios:

* o domínio é compreendido antes da implementação;
* a documentação faz parte da entrega;
* a documentação evolui junto com o sistema;
* cada funcionalidade é desenvolvida de forma isolada;
* cada entrega representa uma evolução incremental do sistema;
* a branch principal deve permanecer sempre estável.

---

# Unidade de desenvolvimento

A menor unidade de desenvolvimento do projeto é uma funcionalidade.

Cada funcionalidade representa uma entrega incremental de valor ao sistema e deve possuir um objetivo único e claramente definido.

Todo o ciclo de desenvolvimento da funcionalidade é realizado dentro de uma única branch, seguindo a estratégia definida em **Estratégia de Branches**.

---

# Ordem das etapas

Sempre que aplicável, toda funcionalidade deve seguir a seguinte sequência:

1. Planejamento
2. Criação da branch
3. Atualização da documentação impactada
4. Modelagem do domínio
5. Implementação
6. Testes
7. Revisão
8. Pull Request
9. Integração à `main`

---

# Processo de desenvolvimento

## 1. Planejamento

Antes de qualquer implementação, deve ser definido o objetivo da funcionalidade.

Nesta etapa devem ser compreendidos:

* o problema de negócio;
* os requisitos envolvidos;
* as regras de negócio existentes;
* o contexto afetado;
* o impacto da funcionalidade sobre o domínio.

Nenhuma implementação deve iniciar antes que o domínio esteja suficientemente compreendido.

---

## 2. Criação da branch

Após o planejamento, deve ser criada uma branch de funcionalidade seguindo a estratégia definida em **Estratégia de Branches**.

Toda a evolução da funcionalidade ocorrerá exclusivamente nesta branch.

---

## 3. Documentação

Antes da implementação, deve ser identificada toda a documentação impactada pela funcionalidade.

Sempre que necessário, os documentos do Bounded Context correspondente deverão ser criados ou atualizados.

Dependendo da funcionalidade, poderão ser atualizados, entre outros:

* README;
* linguagem ubíqua;
* regras de negócio;
* casos de uso;
* modelo de domínio;
* DDD tático;
* DER;
* diagrama de classes;
* decisões de design.

Nem toda funcionalidade exigirá alterações em todos esses documentos.

Devem ser atualizados apenas os artefatos impactados pela entrega.

A documentação representa a modelagem da solução e serve como referência para a implementação.

---

## 4. Modelagem

Com a documentação atualizada, deve ser validado o modelo de domínio.

Quando aplicável, deverão ser identificados:

* entidades;
* objetos de valor;
* agregados;
* serviços de domínio;
* eventos de domínio;
* repositórios;
* fábricas.

A implementação somente deve iniciar quando o modelo de domínio estiver consistente com a solução proposta.

---

## 5. Implementação

A implementação deve respeitar o domínio modelado e a documentação produzida.

Caso sejam identificadas mudanças durante o desenvolvimento, a documentação correspondente deverá ser atualizada antes da conclusão da funcionalidade.

O código deve permanecer alinhado ao modelo de domínio durante todo o desenvolvimento.

---

## 6. Testes

Após a implementação, devem ser criados ou atualizados os testes necessários para validar a funcionalidade.

Sempre que possível, os testes devem cobrir:

* regras de negócio;
* casos de uso;
* validações;
* cenários de sucesso;
* cenários de erro.

A funcionalidade somente deverá ser considerada concluída quando os testes representarem adequadamente seu comportamento esperado.

---

## 7. Revisão

Antes da integração com a branch principal, toda a funcionalidade deve ser revisada.

A revisão deve verificar:

* aderência ao domínio;
* consistência da documentação;
* qualidade da implementação;
* cobertura dos testes;
* conformidade com os padrões definidos pelo projeto.

---

## 8. Pull Request

Após a conclusão da revisão, deverá ser aberto um Pull Request para integração com a branch `main`.

Cada Pull Request deve representar uma única funcionalidade concluída.

O Pull Request constitui o ponto oficial de revisão e integração da entrega ao histórico do projeto.

---

## 9. Integração

Após a aprovação do Pull Request, a funcionalidade deverá ser integrada à branch `main`.

Depois do merge, a branch utilizada para o desenvolvimento deverá ser removida.

A branch `main` deve permanecer sempre estável e conter apenas funcionalidades concluídas.

---

# Atualização da documentação

A documentação faz parte da implementação.

Sempre que uma funcionalidade alterar regras de negócio, modelo de domínio, arquitetura, diagramas ou qualquer informação documentada, os respectivos documentos deverão ser atualizados durante o desenvolvimento da própria funcionalidade.

A documentação nunca deve permanecer desatualizada em relação ao código.

---

# Escopo das entregas

Cada funcionalidade deve possuir um único objetivo.

Alterações não relacionadas ao objetivo da branch deverão ser desenvolvidas em uma nova funcionalidade.

Essa abordagem reduz conflitos, facilita revisões, produz Pull Requests menores e mantém o histórico do projeto organizado.

---

# Evolução incremental

O Synaris é desenvolvido de forma incremental.

Cada funcionalidade representa uma evolução completa do sistema e deve ser integrada apenas quando estiver documentada, implementada, testada e revisada.

Essa abordagem permite que o projeto evolua continuamente, preservando a estabilidade da branch principal.

---

# Responsabilidade

Todo desenvolvedor responsável por uma funcionalidade também é responsável por:

* manter a documentação impactada atualizada;
* seguir a estratégia de branches;
* utilizar a convenção de commits definida pelo projeto;
* manter a implementação alinhada ao domínio;
* garantir a qualidade da funcionalidade antes da integração.

---

# Alterações neste fluxo

Este documento representa o processo oficial de desenvolvimento do Synaris.

Qualquer alteração neste fluxo deverá ser documentada antes de ser adotada no projeto, garantindo que todo o processo de desenvolvimento permaneça consistente e padronizado.
