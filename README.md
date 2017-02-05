# T2CC2
LMG - Linguagem para Modelagem da Grafo

## Membros:
Marcelo Otaviano dos Santos Júnior - 
Murilo Guedes Toloni - 
Cristiano Ornelas -
Iago Bernardes - 

## Sobre:
A linguagem LMG tem como objetivo ser intuitiva por ser escrita em português, e por facilitar a manipuação de grafos para pessoas que não são familiarizadas com conceitos mais complexos de programação.

## Instruções para o uso:
Por ser uma linguagem que se baseia em Python e suas bibliotecas "networkx" e "matplotlib", é necessário ter o Python em sua versão 2.6 ou superiores instalado em seu computador. Link para a instalação do Python -> https://www.python.org/downloads/

Para instalar os pacotes necessários e bibliotecas, primeiramente deve-se instalar o setuptools. Link para o download do setuptools 34.1.1 -> https://pypi.python.org/pypi/setuptools

Para instalar as bibliotecas, começando pela networkx, basta executar o comando `pip install networkx` , em seguida para a instalação da matplotlib, basta executar o comando caso utilize Debian/Ubuntu -> `sudo apt-get install python-matplotlib` ou Fedora/Redhat -> `sudo yum install python-matplotlib` 

## Instruções para a execução através do LinguagemLMG.jar

Executar o .jar com 2 parâmetros necessários para tal, sendo o primeio o caminho do código em .lmg, e o segundo o destino do arquivo em .py com o código pronto para execução.

Exemplo em Windows: `java -jar LinguagemLMG.jar ex1.lmg out.py`

