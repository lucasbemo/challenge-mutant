# challenge-mutant

Magneto deseja recrutar o maior números de candidados mutantes possível para lutar contra os X-Men.
Para isso, eu resolvi ajuda-lo.
Desenvolvi uma API que informa se um humano é ou não um Mutant a partir de uma sequência de DNA informada.

Uma sequência DNA váilida nada mais é que um array de Strings que representa cada fila de uma tabela de NxN.
E as Letras informadas na String só pode ser (A,T,C,G).

A API irá informar se o Humano do DNA informado é um Mutante, se o DNA conter mais de uma sequência de quatro letras iguas de forma oblicua, horizontal ou vertical

Especificação da API:
```
API: isMutant
Action: POST
URL: http://ec2-52-90-72-224.compute-1.amazonaws.com:9000/mutant/
Body: {"dna": ["TTTTTT", "TACGTA", "ATGCAT", "TACGCA", "ATGTAT", "TATGTA"]}
```


### Invocando API hospedada na cloud.

```sh
curl -d '{"dna": ["TTTTTT", "TACGTA", "ATGCAT", "TACGCA", "ATGTAT", "TATGTA"]}' -H "Content-Type: application/json" -X POST http://ec2-52-90-72-224.compute-1.amazonaws.com:9000/mutant/
```

Action: POST
```
http://ec2-52-90-72-224.compute-1.amazonaws.com:9000/mutant/
```
```javascript
{
	"dna": [
		"TTTTTT",
		"TACGTA",
		"ATGCAT",
		"TACGCA",
		"ATGTAT",
		"TATGTA"
	]
}
```



## Getting Started Localmente

Para ter todo o ambiente local rodando, basta executar o comando:

```sh
make get-started
```

Após ter todo o ambiente executando na sua máquina, invoque a API localmente passando uma sequência de DNA.

```sh
curl -d '{"dna": ["TTTTTT", "TACGTA", "ATGCAT", "TACGCA", "ATGTAT", "TATGTA"]}' -H "Content-Type: application/json" -X POST http://localhost:9000/mutant/
```

Você terá o retorno 200:

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
