# Encapsulamento

Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuído em
métodos com finalidades específicas que complementa uma ação em nossa aplicação.

<a href="https://im.ge/i/uml-encapsulamento.KairVc"><img src="https://i.im.ge/2024/05/25/KairVc.uml-encapsulamento.png" alt="uml encapsulamento" border="0"></a>

O programa aborda o tema de encapsulamento da seguinte maneira:

A classe Computador possui o método main e o usuário recebe e envia mensagens. Não seria pertinente que o usuário 
veja tudo o que a classe Messenger faz. Para o usuário, o interessante é que ele receba e envie as mensagens.

Logo, fazemos com que os métodos de verificação de conexão e de salvar histórico sejam privados, assim encapsulando
essas funções nos métodos de enviar e receber mensagens.


