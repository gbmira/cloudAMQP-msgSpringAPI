# Projeto de Mensageria com APIs Java

Este projeto consiste em duas APIs de mensageria desenvolvidas em Java 17, utilizando as mais recentes tecnologias. O objetivo é fornecer um sistema robusto para envio e gerenciamento de mensagens.

## Tecnologias Utilizadas

- **Java 17**: Aproveitando as novas funcionalidades e melhorias de performance da última versão do Java.
- **Spring Framework**: Utilizado para construção de aplicações robustas e escaláveis.
- **RabbitMQ**: Broker de mensagens para garantir a entrega eficiente e confiável das mensagens.
- **CloudAMQP**: Serviço gerenciado de RabbitMQ para fácil escalabilidade e gerenciamento.
- **Maven**: Ferramenta de automação de build e gerenciamento de dependências.
- **PostgreSQL**: Banco de dados relacional para armazenamento persistente das mensagens e informações de usuário.

## Estrutura do Repositório

### API de Usuário (`user-api`)

**Funcionalidades**:
- Registro e autenticação de usuários.
- Gerenciamento de perfis de usuário.
- Histórico de mensagens enviadas e recebidas.

### API de Email (`email-api`)

**Funcionalidades**:
- Envio de emails.
- Gerenciamento de templates de email.
- Logs de envio e status de entrega.
