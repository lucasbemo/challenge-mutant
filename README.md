# challenge-mutant

Magneto deseja recrutar o maior números de candidados mutantes possível para lutar contra os X-Men.
Para isso, eu resolvi ajuda-lo.
Desenvolvi uma API que informa se um humano é ou não um Mutant a partir de uma sequência de DNA informada.

Uma sequência DNA váilida nada mais é que um array de Strings que representa cada fila de uma tabela de NxN.
E as Letras informadas na String só pode ser (A,T,C,G).

A API irá informar se o Humano do DNA informado é um Mutante, se o DNA conter mais de uma sequência de quatro letras iguas de forma oblicua, horizontal ou vertical


### Invocando API hospedada na cloud.

##### /mutant/

Especificação da API:
```
API: Mutant
Action: POST
URL: http://ec2-52-90-72-224.compute-1.amazonaws.com:9000/mutant/
Body: {"dna": ["TTTTTT", "TACGTA", "ATGCAT", "TACGCA", "ATGTAT", "TATGTA"]}
Description: Retorna 200 caso o DNA informado seja de um Mutant, caso contrario, retorno é 403.
```

```sh
curl -d '{"dna": ["TTTTTT", "TACGTA", "ATGCAT", "TACGCA", "ATGTAT", "TATGTA"]}' -H "Content-Type: application/json" -X POST http://ec2-52-90-72-224.compute-1.amazonaws.com:9000/mutant/
```

##### /stats/

Especificação da API:
```
API: stats
Action: GET
URL: http://ec2-52-90-72-224.compute-1.amazonaws.com:9000/stats/
Description: Retorna dados estatísticos do uso da API /mutant.
```

```sh
curl -H "Content-Type: application/json" -X GET http://ec2-52-90-72-224.compute-1.amazonaws.com:9000/stats/
```


## Getting Started Localmente

**Requerimento**
* Java (no mínimo a versão 8)
* docker
* docker-compose

Para ter todo o ambiente local rodando, basta executar o comando:

```sh
make get-started
```

Após ter todo o ambiente executando na sua máquina, invoque a API localmente passando uma sequência de DNA.

- Verificando um DNA Mutante.
```sh
curl -d '{"dna": ["TTTTTT", "TACGTA", "ATGCAT", "TACGCT", "ATGTAT", "TATGTT"]}' -H "Content-Type: application/json" -X POST http://localhost:9000/mutant/
```

Você terá o HttpStatusCode 200:

```json
{
    "dna": [
        "TTTTTT",
        "TACGTA",
        "ATGCAT",
        "TACGCA",
        "ATGTAT",
        "TATGTA"
    ],
    "isMutant": true
}
```

- Verificando um DNA Não Mutante.
```sh
curl -d '{"dna": ["TTTGTT", "TACGTA", "ATGCAT", "TACGCT", "ATGTAT", "TATGTT"]}' -H "Content-Type: application/json" -X POST http://localhost:9000/mutant/
```

Você terá o HttpStatusCode 403:

```json
{
    "dna": [
        "TTTTTT",
        "TACGTA",
        "ATGCAT",
        "TACGCA",
        "ATGTAT",
        "TATGTA"
    ],
    "isMutant": false
}
```


## Comandos Localmente.

Segue abaixo os comandos para desenvolvimento local.

- Build app.

```shell
make build-app
```

- Run app.

```shell
make run-app
```


Localmente com docker.

- Build docker imagem da app

```shell
make build-app-image
```

- Executar container da app.

```shell
make run-app-docker
```

- Executar mongo em container.

```shell
make run-database
```

- Executar app e mongo dentro de containers.

```shell
make run-full
```
