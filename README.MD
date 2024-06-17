# Desafio de POO - Modelagem e Diagramação de um Componente iPhone

## Contexto

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

### Lançamento iPhone 2007

Você pode se basear no vídeo de lançamento do iPhone de 2007 nos minutos relevantes de 00:15 até 00:55.

## Funcionalidades a Modelar

### Reprodutor Musical
- **Métodos**:
  - `tocar()`
  - `pausar()`
  - `selecionarMusica(String musica)`

### Aparelho Telefônico
- **Métodos**:
  - `ligar(String numero)`
  - `atender()`
  - `iniciarCorreioVoz()`

### Navegador na Internet
- **Métodos**:
  - `exibirPagina(String url)`
  - `adicionarNovaAba()`
  - `atualizarPagina()`

## Objetivo

1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java.

## Diagrama UML

Aqui está o diagrama UML representando as funcionalidades do iPhone:

```plantuml
@startuml
interface ReprodutorMusical {
    +void tocar()
    +void pausar()
    +void selecionarMusica(String musica)
}

interface AparelhoTelefonico {
    +void ligar(String numero)
    +void atender()
    +void iniciarCorreioVoz()
}

interface NavegadorInternet {
    +void exibirPagina(String url)
    +void adicionarNovaAba()
    +void atualizarPagina()
}

class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    +void tocar()
    +void pausar()
    +void selecionarMusica(String musica)
    +void ligar(String numero)
    +void atender()
    +void iniciarCorreioVoz()
    +void exibirPagina(String url)
    +void adicionarNovaAba()
    +void atualizarPagina()
}
@enduml