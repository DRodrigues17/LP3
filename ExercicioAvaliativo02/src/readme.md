Como utilizei pilares da orientação a objetos:

Encapsulamento: Utilizei encapsulamento tanto na classe Mãe quanto nas classes filhas para privar qualquer 
instancia de fora de acessar aos dados, perceba que as classes Mãe têm seus atributos com a visibilidade
"protected" para que apenas as classes que herdam delas possam acessar, já as filhas têm seus atributos privados,
impossibilitando o acesso a elas, o benefício do encapsulamento é esse, proteger as informações dos objetos;

Abstração: Abstração acredito que foi usada de forma sutil, pois abstrai informações como cor do prisma ou o material
de que é feito, o que é benéfico, pois assim botamos só informações que usaremos de fato no projeto;

Herança: Utilizei ele entre as classes abstratas e as normais, visto que toda forma utilizada no trabalho se encaixe
em um daqueles grupos, pode-se usar a herança para evitar a repetição de código, botando na classe somente atributos
que no contexto da aplicação, correspondem ao objeto exclusivamente;

Polimorfismo com interfaces: Usei ele para os contratos de métodos, pois todas as formas possuem uma area 
(e um volume se tridimensional), considerando isso a interface serve para impor um contrato sobre aqueles que a 
implementam (com ou sem parâmetros), não tornando obrigatório o jeito em que ele será implementado, mas exigindo que a
classe o faça;

Ps: optei por usar exemplo pois achei ele perfeito para exemplificar tal tópico enquanto assistia um video do principio
SOLID, segue abaixo o link do video;

link  -> https://youtu.be/_jDNAf3CzeY