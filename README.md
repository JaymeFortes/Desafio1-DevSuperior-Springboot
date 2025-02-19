# Desafio: Componentes e Injeção de Dependência - DevSuperior

Este repositório contém a implementação do desafio **Componentes e Injeção de Dependência**, parte do módulo **Back-end** do curso **Formação Desenvolvedor Moderno** da [DevSuperior](https://devsuperior.com.br).

## Objetivo

Criar um sistema para calcular o **valor total de um pedido**, considerando:
- **Porcentagem de desconto**
- **Valor do frete**, conforme regras definidas

## Regras de Cálculo

O valor total do pedido é calculado aplicando o desconto ao valor básico do pedido e adicionando o frete.

| Valor Básico do Pedido | Frete |
|-------------------------|-------|
| Abaixo de R$ 100.00    | R$ 20.00 |
| De R$ 100.00 até R$ 200.00 (exclusive) | R$ 12.00 |
| R$ 200.00 ou mais      | Grátis |

### Exemplos de Entrada e Saída

#### **Exemplo 1**
**Entrada:**
```
Pedido código: 1034
Valor básico: R$ 150.00
Desconto: 20.0%
```
**Saída:**
```
Pedido código 1034
Valor total: R$ 132.00
```

#### **Exemplo 2**
**Entrada:**
```
Pedido código: 2282
Valor básico: R$ 800.00
Desconto: 10.0%
```
**Saída:**
```
Pedido código 2282
Valor total: R$ 720.00
```

#### **Exemplo 3**
**Entrada:**
```
Pedido código: 1309
Valor básico: R$ 95.90
Desconto: 0.0%
```
**Saída:**
```
Pedido código 1309
Valor total: R$ 115.90
```

## Estrutura do Projeto

O projeto deve conter os seguintes componentes:

### **Classes**
- **Order**: Representa um pedido.
- **OrderService**: Responsável pelo cálculo do valor total do pedido.
- **ShippingService**: Responsável pelo cálculo do frete.

### **Requisitos de Implementação**

- Utilizar **Java** com **Spring Boot**.
- A lógica deve ser implementada em **serviços separados** para pedidos e frete.
- Os serviços devem ser componentes anotados com `@Service`.
- A saída deve ser mostrada no **log do terminal**.

## Como Rodar o Projeto

1. **Clone o repositório**:
   ```sh
   git clone https://github.com/JaymeFortes/Desafio1-DevSuperior-Springboot.git
   ```
2. **Importe o projeto na IDE** (IntelliJ, Eclipse, VS Code, etc.).
3. **Execute o projeto** normalmente.
4. **Verifique os logs no terminal** para a saída esperada.

## Entrega

1. **Crie um repositório no GitHub**.
2. **Implemente as classes e serviços conforme descrito**.
3. **Suba o código para o repositório**.
4. **Envie o link do repositório**.



