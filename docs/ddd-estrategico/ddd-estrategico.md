# DDD Estratégico

## Objetivo

Este documento apresenta a modelagem estratégica do domínio do projeto **Synaris**, utilizando os princípios do **Domain-Driven Design (DDD)** propostos por Eric Evans.

O objetivo é dividir o domínio em contextos bem definidos, estabelecer responsabilidades claras entre eles e documentar os relacionamentos existentes por meio de um Context Map.

---

# Domínio

O domínio do Synaris consiste na **gestão hospitalar**, abrangendo os processos administrativos, clínicos e operacionais necessários para o funcionamento de um hospital.

---

# Subdomínios

O domínio foi dividido nos seguintes subdomínios.

| Subdomínio | Classificação |
|------------|---------------|
| Atendimento | Core Domain |
| Internação | Core Domain |
| Pacientes | Supporting |
| Profissionais de Saúde | Supporting |
| Farmácia | Supporting |
| Estoque | Supporting |
| Laboratório | Supporting |
| Diagnóstico por Imagem | Supporting |
| Convênios | Supporting |
| Financeiro | Supporting |
| IAM | Generic |
| Estrutura Organizacional | Generic |
| Auditoria | Generic |

---

# Justificativa da Classificação

## Core Domain

Representam o núcleo do negócio hospitalar.

São responsáveis pelos processos clínicos mais importantes.

- Atendimento
- Internação

---

## Supporting Subdomains

Fornecem suporte às operações do Core Domain.

Apesar de importantes, não representam o diferencial competitivo do sistema.

- Pacientes
- Profissionais de Saúde
- Farmácia
- Estoque
- Laboratório
- Diagnóstico por Imagem
- Convênios
- Financeiro

---

## Generic Subdomains

São funcionalidades comuns presentes em diversos sistemas corporativos.

- IAM
- Estrutura Organizacional
- Auditoria

---

# Linguagem Ubíqua

A Linguagem Ubíqua estabelece um vocabulário comum entre especialistas do domínio e a equipe de desenvolvimento, garantindo consistência na comunicação e na modelagem do sistema.

Os principais termos utilizados no Synaris incluem:

- Paciente
- Atendimento
- Consulta
- Internação
- Leito
- Médico
- Enfermeiro
- Farmacêutico
- Receita
- Prescrição
- Exame Laboratorial
- Exame de Imagem
- Laudo
- Convênio
- Cobrança
- Usuário
- Perfil
- Permissão

---

# Bounded Contexts

O sistema foi dividido nos seguintes Bounded Contexts.
Cada subdomínio do Synaris é representado por um único Bounded Context.

| Contexto | Responsabilidade |
|-----------|------------------|
| Pacientes | Gerenciamento do cadastro dos pacientes |
| Profissionais de Saúde | Cadastro e gerenciamento dos profissionais |
| Atendimento | Registro de consultas, prontuários e prescrições |
| Internação | Controle de internações, altas e ocupação de leitos |
| Farmácia | Gestão de medicamentos e dispensações |
| Estoque | Controle de estoque hospitalar |
| Laboratório | Gerenciamento dos exames laboratoriais |
| Diagnóstico por Imagem | Gestão dos exames de imagem e laudos |
| Convênios | Administração dos convênios médicos |
| Financeiro | Cobranças, pagamentos e faturamento |
| IAM | Autenticação e autorização |
| Estrutura Organizacional | Gestão da estrutura física e organizacional |
| Auditoria | Registro e rastreabilidade das operações |

---

# Context Map

O relacionamento entre os Bounded Contexts encontra-se representado no diagrama **Context Map**.

As relações seguem predominantemente o padrão **Customer/Supplier**, onde o contexto de origem depende do modelo disponibilizado pelo contexto de destino.

**Diagrama**

- context-map.drawio
- context-map.png

---


# Referências

- Eric Evans — Domain-Driven Design: Tackling Complexity in the Heart of Software.
- Vaughn Vernon — Implementing Domain-Driven Design.