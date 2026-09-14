# Java Enterprise Lab

Laboratório prático para retomada e consolidação de Java 21 e desenvolvimento backend, aplicando conceitos de orientação a objetos, arquitetura de software, testes e boas práticas em cenários empresariais reais.

## Objetivo

Este projeto foi criado para transformar estudos teóricos em prática, utilizando problemas inspirados em contextos reais de:

- equipamentos
- logística
- estoque
- compras
- manutenção
- abastecimentos
- operações empresariais

A proposta é evoluir o projeto gradualmente, começando com Java puro e avançando para Spring Boot, banco de dados, testes, segurança, mensageria, observabilidade e arquitetura.

---

## Status atual

Em desenvolvimento.

### Implementado

- Java 21
- Maven
- modelagem orientada a objetos
- encapsulamento
- enum
- regras de negócio
- validações de domínio básicas
- controle de status de equipamento
- atualização controlada de horímetro

---

## Primeiro domínio: Equipamentos

O primeiro exercício do projeto modela um equipamento de operação.

Exemplo:

```text
Equipamento
├── id
├── nome
├── modelo
├── fabricante
├── status
└── horimetro