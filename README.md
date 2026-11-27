# Java Enterprise Lab

Laboratório prático para retomada e consolidação de Java 21 e desenvolvimento backend, aplicando conceitos de orientação a objetos, Collections, arquitetura de software, testes e boas práticas em cenários empresariais reais.

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
- classes e objetos
- encapsulamento
- construtores
- herança
- polimorfismo
- composição
- enums
- regras de negócio
- validações de domínio básicas
- controle de status de equipamento
- atualização controlada de horímetro
- Arrays
- `List` e `ArrayList`
- `Set` e `HashSet`
- `Map` e `HashMap`
- Generics
- Wrapper Classes
- autoboxing e unboxing
- `equals()` e `hashCode()`
- operações com Collections:
    - `add()`
    - `get()`
    - `set()`
    - `remove()`
    - `contains()`
    - `containsKey()`
    - `containsValue()`
    - `keySet()`
    - `values()`
    - `entrySet()`

---

## Primeiro domínio: Equipamentos

O primeiro exercício do projeto modela equipamentos utilizados em operações empresariais.

### Estrutura básica

```text
Equipamento
├── id
├── nome
├── modelo
├── fabricante
├── status
├── horimetro
└── motor
```

### Especializações

```text
Equipamento
    ↑
    ├── Perfuratriz
    └── Caminhao
```

A relação acima é utilizada para praticar herança e polimorfismo.

### Composição

```text
Equipamento
    │
    └── possui Motor
```

O objeto `Motor` é utilizado para praticar composição.

---

## Regras de negócio implementadas

- O horímetro inicial não pode ser negativo.
- O novo horímetro não pode ser menor que o horímetro atual.
- O status do equipamento é alterado através de comportamentos da própria entidade.
- Equipamentos podem possuir comportamentos especializados através de sobrescrita de métodos.
- A igualdade entre equipamentos pode ser definida pelo identificador para uso em estruturas como `HashSet`.

Exemplo:

```text
Horímetro atual: 1250

Atualização para 1265
Resultado: permitido

Atualização para 1200
Resultado: rejeitado
```

---

## Collections

### List

Utilizada para armazenar uma sequência de equipamentos.

```java
List<Equipamento> equipamentos = new ArrayList<>();
```

Principais operações praticadas:

```text
add
get
set
remove
size
```

---

### Set

Utilizado para trabalhar com elementos únicos.

```java
Set<Equipamento> equipamentos = new HashSet<>();
```

Foi utilizado para estudar a relação entre:

```text
HashSet
equals()
hashCode()
```

---

### Map

Utilizado para associar o identificador do equipamento ao próprio objeto.

```java
Map<Long, Equipamento> equipamentos = new HashMap<>();
```

Exemplo:

```text
1 → SANY SR180
2 → CMV TH18
3 → VW 26220
```

Principais operações praticadas:

```text
put
get
containsKey
containsValue
remove
keySet
values
entrySet
```

---

## Tecnologias atuais

- Java 21
- Maven
- Git
- GitHub

---

## Roadmap

### Java

- [x] Classes e objetos
- [x] Encapsulamento
- [x] Construtores
- [x] Herança
- [x] Polimorfismo
- [x] Composição
- [x] Enums
- [x] Arrays
- [x] List
- [x] Set
- [x] Map
- [x] Generics
- [x] Wrapper Classes
- [x] Autoboxing / Unboxing
- [x] equals / hashCode
- [x] String / StringBuilder
- [x] BigDecimal
- [x] Optional
- [x] Lambdas
- [x] Streams
- [x] Method References
- [x] Comparator
- [x] Repositório genérico em memória

## Repositório genérico em memória

Implementação de um repositório utilizando Generics, Collections, Optional e Stream API.

### Funcionalidades

- Cadastro e atualização de equipamentos por identificador.
- Busca por ID utilizando Optional.
- Listagem de equipamentos.
- Filtragem por status e horímetro.
- Ordenação crescente e decrescente.
- Ordenação por nome.
- Contagem de registros.
- Remoção por identificador.

### Conceitos aplicados

- Generics e Bounded Generics.
- Encapsulamento.
- Separação de responsabilidades.
- Stream API.
- Expressões lambda.
- Method References.
- Comparator.
- Optional.
- HashMap.

O repositório utiliza armazenamento em memória, preparando a evolução do projeto para persistência com Spring Data JPA e PostgreSQL.

### Testes

- [ ] JUnit 5
- [ ] Mockito
- [ ] Testes de integração
- [ ] Testcontainers

### Spring

- [ ] Spring Boot
- [ ] Spring Web
- [ ] Spring Data JPA
- [ ] Bean Validation
- [ ] Spring Security
- [ ] APIs REST

### Banco de dados

- [ ] PostgreSQL
- [ ] JPA / Hibernate
- [ ] Flyway

### Arquitetura

- [ ] SOLID
- [ ] Clean Architecture
- [ ] DDD
- [ ] Domain Events
- [ ] Modular Monolith

### Infraestrutura

- [ ] Docker
- [ ] Docker Compose
- [ ] GitHub Actions
- [ ] CI/CD

### Integrações

- [ ] RabbitMQ
- [ ] Redis
- [ ] OpenFeign

### Observabilidade

- [ ] Logs estruturados
- [ ] Spring Actuator
- [ ] Micrometer
- [ ] OpenTelemetry
- [ ] Prometheus
- [ ] Grafana

### Inteligência Artificial

- [ ] Integração com LLM
- [ ] Structured Output
- [ ] Function Calling
- [ ] RAG
- [ ] IA aplicada a cenários empresariais

---

## Estratégia de evolução

```text
Java
↓
Orientação a Objetos
↓
Collections
↓
Lambdas e Streams
↓
Exceptions
↓
Testes
↓
Spring Boot
↓
PostgreSQL
↓
Segurança
↓
Arquitetura
↓
Docker
↓
Mensageria
↓
Observabilidade
↓
IA aplicada
```

---

## Contexto

Os exemplos utilizados neste laboratório são inspirados em problemas reais encontrados em ambientes empresariais envolvendo logística, estoque, equipamentos, manutenção e operações.

A intenção é utilizar esses cenários como base para estudar engenharia de software e desenvolvimento backend de forma aplicada.

---

## Autor

Alcides Thiago