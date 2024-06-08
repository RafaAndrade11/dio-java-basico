# ABSTRAÇÃO

Devemos trazer o problema do repositório de Herança para cá. Com as classes herdando os métodos de uma classe pai, como
poderemos especificar o que cada classe filha fará?

Pensemos o seguinte: Temos uma classe pai que é o ServiçoMensagemInstantanea e temos algumas classes filhas herdando os
métodos dela. Porém, cada classe filha pode ou não ter algumas particularidades, por exemplo, o FacebookMessenger quer 
salvar as mensagens em um local e o MSNMessenger quer salvar em outro.

Usamos a abstração para fazer isso. Ao implementar o abstract a classe ServiçoMensagemInstantanea, as outras classes 
são obrigadas a implementar seus métodos dentro dela mesmo. Com isso, conseguimos fazer as devidas alterações.

Todos precisam fazer a mesma coisa e cada um fará de sua maneira.
