
# dsList            

O dsList é uma aplicação desenvolvida em Java com o framework Spring, que permite o gerenciamento de informações sobre jogos. Os dados são armazenados em um banco de dados PostgreSQL executado em um container, garantindo portabilidade e fácil configuração.

##  Tecnologias Utilizadas

- Java (versão 21)
- Spring Framework:
    - Spring Boot
    - Spring Data JPA
    - Spring Web
    - H2 Database
    - PostgreSQL Driver
- PostgreSQL
- Docker (para o container do banco de dados)
- Maven (para gerenciamento de dependências)
## Funcionalidades

A aplicação possui duas tabelas principais

1. Jogos:

- Possui dados sobre os jogos, incluindo:
    
    - GAME_YEAR
    - SCORE
    - GENRE
    - IMG_URL
    - LONG_DESCRIPTION
    - PLATAFORMS
    - SHORT_DESCRIPTION
    - TITLE

1. Listas:
- Contém categorias como:
    - Aventura e RPG
    - Jogos de plataforma
## Documentação da API

#### Retorna todos os jogos mas com dados resumidos.

```http
  GET http://localhost:8080/games
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
|  |  |  |

#### Retorna um jogo com todas as informações.

```http
  GET http://localhost:8080/games/4
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `int` | **Obrigatório**. O ID do item que você quer |

#### Retorna as listas existentes
```http
  GET http://localhost:8080/lists
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
|       |  | |

#### Retorna os jogos contidos em uma lista especifica.

```http
  GET http://localhost:8080/lists/2/games
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `int` | **Obrigatório**. O ID da lista que você quer |

#### Muda a posição de um jogo em determinada lista

```http
  POST http://localhost:8080/lists/2/replace
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `int` | **Obrigatório**. O ID da lista que você quer, e um body raw do tipo json, preenchendo as variáveis "sourceIndex" : 1, destinationIndex : 3.  Esses valores são o jogo que vai mudar de posição e a posição que ele vai ficar|
