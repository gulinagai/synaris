# DDD Tático — Contexto Pacientes


# Aggregate

## Paciente

O Aggregate **Paciente** é responsável por manter a consistência dos dados cadastrais do paciente.

Todas as operações de criação e alteração devem ocorrer através do Aggregate Root.

---

# Aggregate Root

- Paciente

---

# Entities

## Paciente

Representa uma pessoa que receberá atendimento médico.

É responsável por garantir as invariantes do cadastro.

---

# Value Objects

## CPF

Representa o CPF do paciente.

Responsabilidades:

- validar formato
- armazenar apenas valores válidos
- garantir igualdade por valor

---

## Email

Representa o endereço de e-mail do paciente.

Responsabilidades:

- validar formato
- armazenar apenas valores válidos

---

## Telefone

Representa o(s) números(s) de telefone para contato do paciente.

Responsabilidades:

- validar formato
- armazenar apenas valores válidos
- garantir igualdade por valor

---


# Domain Services

Nenhum.

Nesta etapa todas as regras pertencem ao Aggregate Paciente.

---

# Domain Events

Nenhum.

Não há necessidade de publicação de eventos nesta primeira versão.

---

# Repositories

## PacienteRepository

Responsável pela persistência do Aggregate Paciente.

Operações previstas:

- salvar paciente
- buscar por id
- buscar por CPF
- verificar existência por CPF

---

# Factories

Nenhuma.

A criação do Aggregate é suficientemente simples para ocorrer através do construtor ou método de fábrica da própria entidade.

---

# Invariantes do Aggregate

O Aggregate Paciente deve garantir que:

- Nome é obrigatório.
- CPF é obrigatório.
- Data de nascimento é obrigatória.
- Sexo é obrigatório.
- Um paciente nunca pode existir sem CPF.

A unicidade do CPF é validada pela aplicação utilizando o repositório antes da persistência.

---
