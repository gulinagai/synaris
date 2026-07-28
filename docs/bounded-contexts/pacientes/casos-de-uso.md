# Casos de Uso — Contexto Pacientes

# UC-001 — Cadastrar Paciente

## Objetivo

Permitir que um colaborador autorizado realize o cadastro de um novo paciente no sistema.

---

## Atores

- Recepcionista
- Administrador

---

## Pré-condições

- O usuário deve estar autenticado.
- O usuário deve possuir permissão para cadastrar pacientes.

---

## Fluxo Principal

1. O usuário acessa a tela de cadastro de paciente.
2. O sistema solicita os dados cadastrais.
3. O usuário informa os dados obrigatórios.
4. O sistema valida os dados informados.
5. O sistema verifica se já existe um paciente cadastrado com o mesmo CPF.
6. O sistema registra o novo paciente.
7. O sistema confirma o cadastro realizado.

---

## Fluxos Alternativos

### FA-01 — CPF já cadastrado

No passo 5, caso já exista um paciente com o CPF informado:

1. O sistema interrompe o cadastro.
2. O sistema informa que já existe um paciente com esse CPF.

---

### FA-02 — Dados inválidos

Durante a validação dos dados:

1. O sistema identifica inconsistências.
2. O sistema informa os campos inválidos.
3. O usuário corrige as informações.
4. O fluxo principal é retomado.

---

## Pós-condições

### Sucesso

- O paciente é persistido na base de dados.
- O paciente passa a estar disponível para futuras consultas.

### Falha

- Nenhuma informação é persistida.

---
