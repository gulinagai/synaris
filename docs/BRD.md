BUSINESS REQUIREMENTS DOCUMENT (BRD)

Sistema de Gerenciamento Hospitalar

Versão: 1.0

Data: 30/06/2026

Autor: Gustavo Nagai Amorim



1. Visão Geral

1.1 Objetivo

Desenvolver uma API REST para gerenciamento hospitalar, permitindo gerenciar pacientes, médicos, consultas, internações, prontuários, exames e faturamento.



1.2 Escopo

O sistema de gestão hospitalar contemplará os seguintes módulos e funcionalidades de negócio:

Gestão de pacientes

Gestão de médicos

Gestão de consultas

Gestão de exames

Gestão de financeiro

Gestão de usuários

Gestão de permissões

Gestão de atendimentos

Gestão de Prontuários

Gestão de diagnósticos

Gestão de leitos

Gestão de prescrições médicas

Gestão de convênios

Gestão de internações





1.3 Fora do Escopo

Aplicação mobile

Integração com sistemas governamentais (SUS, CNES, etc.)

Integração com equipamentos hospitalares

Telemedicina

Portal do paciente

Business Intelligence (BI) e dashboards analíticos avançados

Notificações por SMS ou WhatsApp

Relatórios gerenciais

Dashboard analítico

Exportação PDF/Excel





2. Problema de Negócio

Atualmente hospitais utilizam diversos processos manuais para controle e gerenciamento hospitalar, podendo ocasionar perda de informações, em muitos casos, informações sensíveis e sigilosas, isso pode causar retrabalho e dificuldade de rastreamento do histórico clínico dos pacientes.



3. Objetivos de Negócio

Centralizar informações

Melhorar atendimento

Otimizar processo operacional

Reduzir erros

Melhorar segurança

Garantir rastreabilidade

Facilitar auditorias



4. Stakeholders

Administrador – Gerencia o sistema

Recepcionista – Agenda consultas

Médico - Atende pacientes

Enfermeiro – Atualiza internações

Farmacêutico - Controla medicamentos e dispensação

Financeiro – Emite cobranças

Paciente – Recebe atendimento



5. Requisitos Funcionais

5.1 Atendimento

RF001 – O sistema deve permitir cadastrar pacientes.

RF002 – O sistema deve permitir consultar pacientes.

RF003 – O sistema deve permitir atualizar os dados cadastrais dos pacientes.

RF004 – O sistema deve permitir desativar pacientes preservando o histórico.

RF005 – O sistema deve permitir pesquisar pacientes por CPF, nome ou número do prontuário.

RF006 – O sistema deve permitir cadastrar médicos.

RF007 – O sistema deve permitir atualizar os dados dos médicos.

RF008 – O sistema deve permitir consultar médicos por especialidade.

RF009 – O sistema deve permitir agendar consultas.

RF010 – O sistema deve permitir remarcar consultas.

RF011 – O sistema deve permitir cancelar consultas.

RF012 – O sistema deve permitir consultar a agenda médica.

RF013 – O sistema deve permitir iniciar um atendimento.

RF014 – O sistema deve permitir registrar diagnóstico.

RF015 – O sistema deve permitir registrar observações clínicas.

RF016 – O sistema deve permitir registrar prescrições médicas.

RF017 – O sistema deve permitir solicitar exames.

RF018 – O sistema deve permitir registrar resultados de exames.

RF019 – O sistema deve permitir finalizar um atendimento.

RF020 – O sistema deve manter o prontuário eletrônico completo do paciente.

RF021 – O sistema deve permitir consultar o histórico clínico do paciente.

RF022 – O sistema deve registrar todas as evoluções clínicas do atendimento.


5.2 Internação

RF023 – O sistema deve permitir registrar internações.

RF024 – O sistema deve permitir consultar internações.

RF025 – O sistema deve permitir transferir pacientes entre leitos.

RF026 – O sistema deve permitir registrar alta hospitalar.

RF027 – O sistema deve permitir cadastrar leitos.

RF028 – O sistema deve informar a ocupação dos leitos.

RF029 – O sistema deve permitir bloquear leitos para manutenção.

RF030 – O sistema deve registrar o histórico de ocupação dos leitos.


5.3 Farmácia

RF031 – O sistema deve permitir cadastrar medicamentos.

RF032 – O sistema deve permitir atualizar informações dos medicamentos.

RF033 – O sistema deve permitir consultar medicamentos.

RF034 – O sistema deve permitir dispensar medicamentos.

RF035 – O sistema deve permitir registrar devoluções de medicamentos.

RF036 – O sistema deve permitir consultar o histórico de dispensações.

RF037 – O sistema deve validar prescrições antes da dispensação.


5.4 Estoque

RF038 – O sistema deve permitir cadastrar produtos.

RF039 – O sistema deve permitir registrar lotes.

RF040 – O sistema deve permitir registrar entradas de estoque.

RF041 – O sistema deve permitir registrar saídas de estoque.

RF042 – O sistema deve permitir registrar perdas.

RF043 – O sistema deve permitir consultar o saldo do estoque.

RF044 – O sistema deve permitir consultar produtos próximos ao vencimento.

RF045 – O sistema deve permitir realizar inventário de estoque.

RF046 – O sistema deve registrar toda movimentação de estoque.


5.5 Financeiro

RF047 – O sistema deve permitir cadastrar convênios.

RF048 – O sistema deve permitir vincular pacientes aos convênios.

RF049 – O sistema deve gerar cobranças de atendimentos.

RF050 – O sistema deve registrar pagamentos.

RF051 – O sistema deve registrar glosas.

RF052 – O sistema deve consultar faturas.

RF053 – O sistema deve emitir comprovantes financeiros.



5.6 Administração

RF054 – O sistema deve permitir cadastrar usuários.

RF055 – O sistema deve permitir autenticação por e-mail e senha.

RF056 – O sistema deve controlar permissões por perfil.

RF057 – O sistema deve permitir alteração de senha.

RF058 – O sistema deve registrar o último acesso.

RF059 – O sistema deve permitir ativar e desativar usuários.

RF060 – O sistema deve registrar logs administrativos.


6. Requisitos Não Funcionais

RNF01 – Segurança
O sistema deve permitir acesso apenas a usuários autenticados e autorizados, de acordo com seu perfil de acesso.

RNF02 – Confidencialidade
O sistema deve garantir que as informações dos pacientes sejam acessíveis somente por usuários com permissão adequada.

RNF03 – Integridade dos Dados
O sistema deve garantir a consistência e a integridade das informações armazenadas, evitando perda ou corrupção de dados.

RNF04 – Desempenho
O sistema deve responder às requisições dos usuários em tempo adequado para garantir uma boa experiência de utilização.

RNF05 – Disponibilidade
O sistema deve permanecer disponível para uso durante o horário de funcionamento da instituição, exceto em períodos programados de manutenção.

RNF06 – Confiabilidade
O sistema deve garantir que operações críticas sejam executadas corretamente, preservando a consistência das informações.

RNF07 – Escalabilidade
O sistema deve permitir a inclusão de novos módulos e funcionalidades sem necessidade de alterações significativas em sua estrutura.

RNF08 – Manutenibilidade
O sistema deve possuir arquitetura e organização que facilitem sua manutenção, correção de falhas e evolução.

RNF09 – Usabilidade
A API deve possuir documentação clara e atualizada para facilitar sua utilização por desenvolvedores e consumidores do serviço.

RNF10 – Auditabilidade
O sistema deve registrar operações relevantes realizadas pelos usuários, permitindo auditoria e rastreabilidade das ações.

RNF11 – Interoperabilidade
O sistema deve permitir integração com outros sistemas por meio de interfaces padronizadas.

RNF12 – Portabilidade

O sistema deve possibilitar sua implantação em diferentes ambientes, sem necessidade de alterações em suas funcionalidades.





7. Regras de Negócio

Atendimento

RN001 – Cada paciente deve possuir um CPF único.

RN002 – O CPF não poderá ser alterado após o cadastro.

RN003 – O CRM do médico deve ser único.

RN004 – Um médico não poderá possuir duas consultas para o mesmo horário.

RN005 – Um paciente não poderá possuir duas consultas no mesmo horário.

RN006 – Consultas somente poderão ser agendadas para datas futuras.

RN007 – Consultas canceladas não poderão ser realizadas.

RN008 – Apenas consultas com status "Agendada" ou "Confirmada" poderão iniciar atendimento.

RN009 – Todo atendimento deverá possuir um médico responsável.

RN010 – O atendimento somente poderá ser finalizado após o registro do diagnóstico.

RN011 – Toda consulta realizada deverá gerar um registro no prontuário.

RN012 – O histórico clínico nunca poderá ser removido.


Internação

RN013 – Um paciente somente poderá possuir uma internação ativa.

RN014 – Um leito somente poderá estar ocupado por um paciente simultaneamente.

RN015 – Um paciente somente poderá ocupar um único leito durante uma internação.

RN016 – A alta hospitalar deverá liberar automaticamente o leito.

RN017 – Um leito bloqueado não poderá receber internações.


Farmácia

RN018 – Medicamentos somente poderão ser dispensados mediante prescrição válida.

RN019 – Medicamentos vencidos não poderão ser dispensados.

RN020 – Toda dispensação deverá registrar responsável, data e horário.

RN021 – Uma dispensação reduz automaticamente o saldo do estoque.

RN022 – Toda devolução deverá gerar uma movimentação de estoque.


Estoque

RN023 – Nenhum produto poderá possuir saldo negativo.

RN024 – Todo lote deverá possuir data de validade.

RN025 – Toda movimentação deverá registrar usuário, data e motivo.

RN026 – Produtos vencidos não poderão ser movimentados para dispensação.

RN027 – O inventário deverá registrar divergências entre estoque físico e lógico.


Financeiro

RN028 – Toda cobrança deverá estar vinculada a um atendimento.

RN029 – Convênios somente poderão ser utilizados quando estiverem ativos.

RN030 – Pagamentos não poderão exceder o valor da cobrança.

RN031 – Cancelamentos financeiros deverão permanecer registrados para auditoria.


Administração

RN032 – Apenas administradores poderão cadastrar usuários.

RN033 – Apenas administradores poderão alterar perfis de acesso.

RN034 – Toda alteração crítica deverá registrar usuário, data e horário.

RN035 – Usuários somente poderão acessar funcionalidades compatíveis com seu perfil.

RN036 – Usuários desativados não poderão autenticar no sistema.



8. Casos de Uso

UC01 – Autenticar usuário

Atores: Administrador, Médico, Recepcionista, Enfermeiro

Objetivo: Permitir que um usuário acesse o sistema mediante autenticação.



UC02 – Cadastrar usuário

Ator: Administrador

Objetivo: Registrar um novo usuário autorizado a utilizar o sistema.



UC03 – Gerenciar usuários

Ator: Administrador

Objetivo: Consultar, atualizar, ativar ou desativar usuários do sistema.



UC04 – Cadastrar paciente

Atores: Recepcionista, Administrador

Objetivo: Registrar um novo paciente no sistema.



UC05 – Consultar pacientes

Atores: Recepcionista, Médico, Enfermeiro, Administrador

Objetivo: Pesquisar pacientes cadastrados.



UC06 – Atualizar cadastro de paciente

Atores: Recepcionista, Administrador

Objetivo: Atualizar informações cadastrais de um paciente.



UC07 – Cadastrar médico

Ator: Administrador

Objetivo: Registrar um novo médico no sistema.



UC08 – Consultar médicos

Atores: Recepcionista, Administrador

Objetivo: Pesquisar médicos cadastrados.



UC09 – Agendar consulta

Atores: Recepcionista, Administrador

Objetivo: Agendar uma consulta entre paciente e médico.



UC10 – Remarcar consulta

Atores: Recepcionista, Administrador

Objetivo: Alterar data ou horário de uma consulta.



UC11 – Cancelar consulta

Atores: Recepcionista, Administrador

Objetivo: Cancelar uma consulta previamente agendada.



UC12 – Consultar agenda médica

Atores: Médico, Recepcionista

Objetivo: Visualizar os horários disponíveis e consultas agendadas.



UC13 – Iniciar atendimento

Ator: Médico

Objetivo: Registrar o início do atendimento de uma consulta.



UC14 – Registrar atendimento

Ator: Médico

Objetivo: Registrar diagnóstico, observações e prescrições médicas.



UC15 – Finalizar atendimento

Ator: Médico

Objetivo: Encerrar o atendimento e atualizar o prontuário do paciente.



UC16 – Consultar prontuário eletrônico

Atores: Médico, Enfermeiro

Objetivo: Consultar o histórico clínico do paciente.



UC17 – Registrar internação

Atores: Médico, Administrador

Objetivo: Registrar a internação de um paciente.



UC18 – Registrar alta hospitalar

Atores: Médico

Objetivo: Registrar a alta do paciente e liberar o leito ocupado.



UC19 – Consultar ocupação de leitos

Atores: Médico, Enfermeiro, Administrador

Objetivo: Visualizar a situação dos leitos do hospital.



9. Restrições

LGPD

CPF único

CRM único

Java 21

Spring Boot



10. Premissas

acesso via navegador

autenticação JWT

banco relacional

API REST



11. Riscos



12. Critérios de Aceitação



13. Glossário

Paciente

Consulta

Internação

Alta

Leito

Prescrição

Prontuário 