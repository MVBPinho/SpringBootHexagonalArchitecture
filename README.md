#Curso
- nome: Arquitetura Hexagonal/Ports and Adapters NA PRÁTICA
- url: https://www.udemy.com/course/arquitetura-hexagonal-ou-ports-and-adapters-na-pratica/?couponCode=PPINTENTP3

# Wiremock
- Baixar o Jar do wiremock através da URL: https://wiremock.org/docs/download-and-installation/
- Após baixar, executar o seguinte comando na pasta raiz que o download foi realizado: java -jar wiremock-standalone-3.7.0 --port 8082
- Na pasta mappings criar dois arquivos:
  
  * Arquivo 1 : address.json
    Colar o texto abaixo

    {
    "request": {
        "method": "GET",
        "url": "/addresses/38400000"
    },
    "response": {
        "status": 200,
        "headers": {
            "Content-Type": "application/json"
        },
        "jsonBody": {
            "street": "Rua Hexagonal",
            "city": "Uberlândia",
            "state": "Minas Gerais"
        }
    }
}


  * Arquivo 2 : address_2.json
 Colar o texto abaixo
{
    "request": {
        "method": "GET",
        "url": "/addresses/38400001"
    },
    "response": {
        "status": 200,
        "headers": {
            "Content-Type": "application/json"
        },
        "jsonBody": {
            "street": "Rua das Flores",
            "city": "São Paulo",
            "state": "São Paulo"
        }
    }
}


# Docker
- Abrir um terminal na pasta docker-local
- Executar o comando: docker-compose up para baixar a imagem que está na pasta.
- Executar o comando docker ps e pegar o id da instancia do banco do mongodb
- Após realizar o download, executar o comando para acessar o mongodb: docker exec -it IDDDDDDDDD /bin/bash
- Após conectar no banco, digitar o comando para se autenticar no banco: mongosh -u root -p
- Digitar a senha configurada no arquivo: example
- Digite o comando para verificar as tabelas: show collections
- Digitar o comando para acessar a tabela: use hexagonal
- Executar o comando para fazer um select all: db.customers.find()

  # Kafka
  - Baixar o programa OffSet Explorer 3.0 ou o plugin KafkaLytic no IntelliJ.
  - Criar um cluster: localhost:9092 e com o nome de sugestão hexagonal.
  - Criar os tópicos: tp-cpf-validated e tp-cpf-validation.
