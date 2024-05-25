# HERANÇA

<a href="https://im.ge/i/uml-abstracao.KaixQ1"><img src="https://i.im.ge/2024/05/25/KaixQ1.uml-abstracao.md.png" alt="uml abstracao" border="0"></a>

Imagina se em cada serviço de mensagem instantânea que fosse implementado ao sistema tivéssemos que implementar todos os métodos novamente.
Seria muito trabalhoso e ao adicionar uma regra de negócio em um, teríamos que implementar em todos os outros, fazendo a manutenção ser muito difícil.

Para isso, utilizamos o conceito de herança. Ao criar a classe ServicoMensagemInstantanea, podemos identificar que as classes que extenderam ela tem muitas
funções em comum. Então essa classe fica responsável por ter esses métodos e as outras somente extendem os métodos, podendo também alterar e modificar as que
forem necessárias.