Parte 1 — Conceitual

**_O que é Clean Code?_**

Clean Code, a meu ver, seria uma filosofia para um desenvolvimento, não uma metodologia ou um padrão de projeto. 
Digo isso, pois ele traz tópicos que ele acredita serem errados (nisso eu falo do livro que originou esse pensamento) 
e os defende com casos e exemplos que fazem de fato o desenvolvedor refletir, eu, por exemplo, tenho pensado 2 vezes
antes de nomear uma variável, classe ou método, e quando percebo que o nome não ficou bom vou lá e o mudo.

**_Cite pontos positivos da utilização de Clean Code em nossos projetos;_**

O bom de seguir o clean code, por exemplo, é que o código sendo limpo fica melhor de trabalhar com ele, atualizar, 
refatorar, expandir, testar e principalmente quando chega alguém novo na equipe, essa pessoa consegue se encontrar 
mais rapidamente no projeto e a equipe na totalidade se torna mais produtiva.

**_Cite 5 Regras práticas de Clean Code que mais te chamou a atenção._**

- Métodos devem fazer somente uma coisa e bem feita
- Nomes devem ser claros
- Evite comentários, se os fizer não seja redundante
- Evitar repetição de código
- Teste sempre seu código

**Vou deixar alguns exemplos de códigos que ferem essas regras ao longo das classes. Os comentários verdes representam
minhas explicações do porquê não fazer as coisas, os cinzas são os que ferem a regra dos comentários**
- As regras dos métodos e nomes duvidosos está com um exemplo na interface formas circulares e na classe circulo.
- A regra dos comentários está com exemplos na classe cubo.
- A regra da repetição de código está na classe da esfera.

A regra dos testes eu tentei implementar, porém, em projetos básicos é impossível usar JUnit, logo eu não teria como 
fazer os testes. Mas ela basicamente serve para alertar o programador de que se ele não testar seus códigos, isso pode
num futuro acarretar erros que ele nem imagina, afinal se ele não testou ele não sabe qual resultado virá mediante
acontecimento x ou y.




