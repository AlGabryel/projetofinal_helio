# EcoTrack: Hábitos Sustentáveis
O grupo é formado por : Allan Gabryel, Carlos Eduardo , Pedro Augusto e Ruan Marcílio.
Esse projeto visa combater os problemas ambientais através do incentivo de práticas sustentáveis no dia a dia. O usuário pode monitorar e registrar os próprios hábitos sustentáveis e observar o progresso semanal, também é possível aceitar "verdes" e puxar dicas ecológicas de uma API gratuita.

EcoTrack — Aplicativo de Sustentabilidade
O EcoTrack é um aplicativo Android criado para ajudar pessoas a adotarem hábitos sustentáveis no dia a dia.
Com ele, o usuário pode acompanhar hábitos, ver desafios ecológicos e receber dicas ambientais.

Este projeto foi desenvolvido usando Kotlin e Jetpack Compose, seguindo arquitetura limpa e organizada.

Estrutura do projeto

app/
 ├── data/
 ├── domain/
 ├── ui/
 ├── utils/

domain/
Aqui fica o "cérebro" do app.
Não tem Android, não tem Compose, não tem API.
Só regras e estruturas importantes.

model/
Guarda os modelos (as “coisas” do app).
Exemplo: EcoTip.kt, que representa uma dica.

repository/
São “contratos” (interfaces).
Eles dizem o que o app deve fazer, mas não dizem como.

usecase/
Cada arquivo faz uma tarefa importante, como: buscar dicas, salvar hábitos e carregar desafios.

data/ (Onde as informações são buscadas)
Aqui ficam implementações reais:
Retrofit (caso use API)
Banco de dados
Implementações dos repositories
Eles falam com o mundo real.

ui/ (Telas do aplicativo)
Toda a parte visual do app.

navigation/
Define as rotas do app (qual tela vai abrir).

home/
Componentes e tela inicial.

habits/
Lista e gerenciamento de hábitos sustentáveis.

challenges/
Mostra desafios e metas ambientais.

theme/
Define as cores, fontes e o visual geral do app.

utils/ (Ferramentas úteis)

UiEvent.kt
Usado para enviar eventos entre ViewModel e telas
(ex.: mostrar mensagem, navegar, carregar algo).

ResultWrapper.kt
Ajuda a lidar com resultados de API ou banco.
Organiza: Sucesso, Erro ou Carregando
