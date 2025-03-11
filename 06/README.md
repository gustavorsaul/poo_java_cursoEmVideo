# Pilares POO JAVA

- `E` = encapsulamento
    - A = abstração
- `H` = herança
- `P` = polimorfismo

## Encapsulamento

- `Encapsular`: ocultar partes independentes da implementação, permitindo contruir partes invisíveis ao mundo exterior.

- `Vantagens`:
    - Tornar mudanças invisíveis
    - Facilitar reutilização de código
    - Reduzir efeitos colaterais

- `Interface`: lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito com um objeto dessa classe.

## Exemplo

### - Controle remoto

- `<< interface >>`
    - Controlador
        - ligar()
        - desligar()
        - maisVolume()
        - menosVolume()
        - ligarMudo()
        - play()
        - pause()
    - Todos métodos públicos

- `ControleRemoto` 
    - Definir a classe
        - volume
        - ligado
        - tocando
    - Todos atributos privados
    - `ControleRemoto` implementa `<< interface >>`
        - Métodos da interface vão para a classe principal
    - Definir métodos adicionais
        - getters e setters
            - getVolume(), setVolume()
            - getLigado(), setLigado()
            - getTocando(), setTocando() 
