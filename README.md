## challenge-mutant

API para detectar se um humano é Mutante ou não.


### Executando localmente.

Segue abaixo os comandos para desenvolvimento local.

#### Build da app

```shell
make build-app
```

#### Build docker imagem da app

```shell
make build-docker-image
```

#### Executar a imagem no container

```shell
make run-app-image
```

#### Invocando a API

A aplicação disponibilizará uma API com o seguinte path:

Action: POST
```
    http://localhost:9000/mutant/
```

e espera receber uma sequência de DNA representada por um array (uma matriz de NxN), como:

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

Cada string da sequência de DNA só pode conter as letras ATCG

* Exemplo de utilização:

```console
curl -d '{"dna": ["TTTTTT", "TACGTA", "ATGCAT", "TACGCA", "ATGTAT", "TATGTA"]}' -H "Content-Type: application/json" -X POST http://localhost:9000/mutant/
```


### Invocando API remoto

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