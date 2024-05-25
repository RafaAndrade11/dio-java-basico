# HERANÇA

![uml heranca](https://github.com/RafaAndrade11/dio-java-basico/assets/143004155/47da6582-4ae9-4da1-bd4b-739eb7fb4cba)

Imagina se em cada serviço de mensagem instantânea que fosse implementado ao sistema tivéssemos que implementar todos os métodos novamente.
Seria muito trabalhoso e ao adicionar uma regra de negócio em um, teríamos que implementar em todos os outros, fazendo a manutenção ser muito difícil.

Para isso, utilizamos o conceito de herança. Ao criar a classe ServicoMensagemInstantanea, podemos identificar que as classes que extenderam ela tem muitas
funções em comum. Então essa classe fica responsável por ter esses métodos e as outras somente extendem os métodos, podendo também alterar e modificar as que
forem necessárias.