# Linux Experience | [Digital Innovation One](https://web.dio.me/) | 2023
 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/P3d50/Santander-Bootcamp-Mobile-Developer-Digital-Innovation-One-2021/blob/main/LICENSE) 

# Sobre o Bootcamp

Esse programa é para profissionais de tecnologia que querem aperfeiçoar seus conhecimentos no sistema operacional Linux em uma trilha imersiva, rápida e eficiente. O Linux Experience possui apenas 41 horas, que você pode finalizar em poucos dias, de atividades 100% voltadas para os desafios do mercado de trabalho.   Nesse programa você vai aprender a principal vocação do sistema operacional Linux, seus comandos fundamentais e como gerenciar serviços de um servidor.

# Sobre o desafio, e o projeto proposto

A tecnologia de Containers promete mudar a maneira como as operações de TI são realizadas, abstraindo ambientes de desenvolvimento e otimizando o consumo de recursos. Nesse contexto, conheça o Docker, implemente uma estrutura de Microsserviços com as melhores práticas do mercado internacional e ganhe independência entre aplicações e infraestrutura em mais um conteúdo exclusivo por aqui.

Pré-requisitos: conhecimentos básicos em Linux, Docker e AWS.

Neste desafio, você deverá replicar (e porque não, melhorar) este [projeto prático](https://github.com/denilsonbonatti/toshiro-shibakita) 
, criando um repositório próprio e, com isso, aumentando ainda mais seu portfólio de projetos no GitHub! Para isso, inspire-se na história de TOSHIRO SHIBAKITA e vamos evoluir com a ajuda da Nuvem ☁️😍☁️


# Sobre o Projeto apresentado

O projeto foi criado do zero e não a partir do proposto, é uma api desenvolvida em  spring boot. Essa api é uma aplicação Spring boot atualmente com um front em Thymeleaf, 
onde é inserido o usuário e senha da plataforma da DIO, e algumas informações pessoais como nome, idade, etc. Essa api utiliza dois microserviços. Um microsserviço que faz webscrapping na pagina da DIO, utilizando o login e senha para obter os certificados daquela conta. Um segundo serviço que pegas esses certificados, as informações iseridas e gera uma bio eviando essas informações para a api do chat-GPT3, junto com um prompt que também foi definido na api.


# Sobre a execução do projeto
  - clonar o projeto
  - na pasta raiz do projeto executar o comando abaixo, para dar permissão de execução para o script, esse script builda a imagem do container e roda uma instância do container.

    ```bash
      $ chmod +x start.sh
    ```
  - executar o script 
    ```bash
      $ ./start.sh
    ```
    
  - acessar a url do local onde o container está rodando com a porta "8080" e a uri "/home", ex: http://localhost:8080/home
 


# Autor

P3d50

https://www.linkedin.com/in/pedro-ramos-3b35aaa0/
