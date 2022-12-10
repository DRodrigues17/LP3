Como utilizei pilares da orientação a objetos:

Encapsulamento: Utilizei encapsulamento tanto nas classes Mãe quanto nas classes filhas para privar qualquer 
instancia de fora de acessar aos dados, perceba que as classes  Mãe têm seus atributos com a vizibilidade
"protected" para que apenas as classes que herdam delas possam acessar, já as filhas tem seu atributos privados,
impossibilitando o acesso a elas, o beneficio do encapsulamento é esse, protejer as informações dos objetos;

Abstração: Abstração acredito que foi usada de forma sutil, pois abistrai infromações como cor do prisma ou o material
de que é feito, o que é benefico pois assim botamos só informações que de fato usaremos no projeto;

Herança: Utilizei ele entre as classes abstratas e as normais, uma vez que toda forma utilizada no trabalho se encaixe
em um dauqeles grupos, pode-se usar a herança para evitar a repetição de código, botando na forma somente atributos que
no contexto da aplicação, correspondem ao objeto exclusivamente;

Polimorfismo com interfaces: Usei ele para os contratos de metodos, pois todas as formas possuem uma area 
(e um volume se tridimensional), considerando isso a interface server para impor um contrato sobre aqueles que a 
implementam (com ou sem parametros), não tornando obrigatório o jeito em que ele será implementado mas exegindo que a
classe o faça;

Ps: optei por usar exemplo pois achei ele perfeito para exemplificar tal tópico enquanto assistia um video do principio
SOLID, segue abaixo o link do video;

link  -> https://youtu.be/_jDNAf3CzeY