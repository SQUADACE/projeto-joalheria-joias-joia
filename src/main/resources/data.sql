-- Conteúdo do Cadastro do Cliente
INSERT IGNORE INTO tb_tipo_usuario (id_tipo_usuario, nome_tipo_usuario) VALUES
(1, 'Admin'),
(2, 'Cliente'),
(3, 'Vendedor'),
(4, 'Gerente');

-- Conteúdo do Cadastro do Produto
INSERT IGNORE INTO tb_categoria_produto (id_categoria_produto, categoria_produto, descricao_categoria) VALUES
(1, 'Anéis', 'Acessório para os dedos'),
(2, 'Colares', 'Acessório para o pescoço'),
(3, 'Brincos', 'Acessório para as orelhas'),
(4, 'Pulseiras', 'Acessorio para os braços'),
(5, 'Relógios', 'Acessório para não atrasar no SENAI');

-- Inserindo Tipos (se não existirem)
INSERT IGNORE INTO tb_tipo_produto (id_tipo_produto, tipo_produto, descricao_tipo_produto) VALUES
(1, 'Ouro', '18k'),
(2, 'Prata', '750'),
(3, 'Bijuteria', 'É biju mas é de rico');

-- Inserindo Ornamentos
INSERT IGNORE INTO tb_ornamento(id_ornamento, nome_ornamento, descricao_ornamento) VALUES
(1, 'Rubi', '1k'),
(2, 'Esmeralda', '14k'),
(3, 'Diamante', '8k'),
(4, 'Safira', '3k');

--Inserindo alguns exemplos de usuários
INSERT IGNORE INTO tb_usuario(id_usuario, nome_usuario, cpf, email, telefone, data_nascimento, senha, id_tipo_usuario) VALUES
(1, "Otávio", "38383838383", "otavio@gmail.com", "902103454", "2010-01-01", "0000", 2),
(2, "Gustavo", "30303030303", "gustavo@gmail.com", "991462020", "2017-09-09", "2099", 2),
(3, "Kaique", "21212121212", "kaique@gmail.com", "980308181", "2019-11-11", "8999", 2),
(4, "Alves", "09090909090", "alves@gmail.com", "921013949", "2020-10-10", "2120", 2),
(5, "Pedro", "12120909101", "pedro@gmail.com", "991302020", "2021-12-12", "1234", 2);

--Inserindo exemplos de endereços desses usuários
INSERT IGNORE INTO tb_endereco(id_endereco, numero_casa, rua, bairro, cidade, uf, cep, complemento, id_usuario) VALUES
(1, "113", "Rua Cônego Lúcio Floro Graziosi", "Ipanema Ville", "Sorocaba", "SP", "18071060", "casa", 1),
(2, "234", "Rua Olinda de Almeida Mastrandéa", "Jardim Piazza di Roma", "Sorocaba", "SP", "18051750", "apartamento ", 2),
(3, "85", "Rua Alberto Peron", "Vitória Régia", "Sorocaba", "SP", "18078460", "mansão", 3),
(4, "20", "Rua Adolpho Goldman", "Vitória Régia", "Sorocaba", "SP", "18078451", "casarão", 4),
(5, "190", "Rua Angelo Camargo Sampaio", "Vila Helena", "Sorocaba", "SP", "18071120", "casinha", 5);

--Inserindo produtos
INSERT IGNORE INTO tb_produto(id_produto, nome_produto, preco, descricao_produto, id_ornamento, id_tipo_produto, id_categoria_produto, img_url) VALUES
(1, "Anel Bela Nevasca", 299.99, "Delicado e imponente na medida certa, o Anel Bela Nevasca é inspirado na beleza sutil dos flocos de neve.", 2, 1, 3, "http://localhost:8080/images/img%20anel.jpg"),
(2, "Anel Estrela Polar", 189.99, "Guiado pela luz de uma estrela distante, o Anel Estrela Polar é um tributo à beleza imortal do céu noturno.", 1, 1, 1, "http://localhost:8080/images/imgAnel2.jpg"),
(3, "Anel Brilho do Ártico", 200.00, "Inspirado pela majestade e mistério das paisagens geladas do norte, o Anel Brilho do Ártico é um tributo à pureza e à luminosidade do inverno.", 2, 2, 2, "http://localhost:8080/images/imgAnel3.jpg"),
(4, "Brinco Floco de Luz", 360.00, "Delicados como o primeiro floco de neve e radiantes como a luz que o toca, são a definição de elegância sutil.", 3, 3, 1, "http://localhost:8080/images/imgBrinco.jpg"), 
(5, "Brinco Noite Invernal", 400.0, "Como a serenidade de uma noite gelada sob o céu estrelado, o Brinco Noite Invernal captura a beleza mística e silenciosa.", 2, 1, 3, "http://localhost:8080/images/imgBrinco2.jpg"),
(6, "Brinco Lágrimas de Gelo", 399.99, "Elegantes como o reflexo do inverno em sua forma mais pura, os Brincos Lágrimas de Gelo capturam a beleza delicada das gotas congeladas.", 2, 3, 5, "http://localhost:8080/images/imgBrinco3.jpg"),
(7, "Colar Caminho das Estrelas", 150.00, "Como se tivesse sido forjado com poeira cósmica e sonhos antigos, o Colar Caminho das Estrelas guia os corações que buscam a luz.", 4, 2, 4, "http://localhost:8080/images/imgColar.jpg"),
(8, "Colar Encanto do Ártico", 200.00, "Como um sussurro vindo das terras geladas do norte, o Colar Encanto do Ártico revela a beleza silenciosa e majestosa do inverno eterno.", 1, 2, 3, "http://localhost:8080/images/imgColar2.jpeg"),
(9, "Colar Neblina Cristalina", 289.99, "Como um suspiro suave de inverno, o Colar Neblina Cristalina evoca a leveza e o mistério das manhãs cobertas pela neblina. ", 2, 3, 2, "http://localhost:8080/images/imgColar3.jpg"),
(10, "Pulseira Frosty Glam", 200.00, "A elegância do inverno com um toque de brilho irresistível. A Pulseira Frosty Glam combina o frescor das manhãs geladas.", 3, 3, 4, "http://localhost:8080/images/imgPulseira.jpg"),
(11, "Pulseira Rastro de Cristais", 299.99, "Como um delicado rastro deixado pela luz sobre a neve, a Pulseira Rastro de Cristal captura a beleza efêmera do inverno em sua forma mais brilhante.", 1, 2, 3, "http://localhost:8080/images/imgPulseira2.jpg"),
(12, "Pulseira Chama Fria", 199.00, "Uma fusão entre a intensidade do fogo e a serenidade do gelo, a Pulseira Chama Fria é uma joia que exala mistério e sofisticação.", 3, 1, 5, "http://localhost:8080/images/imgPulseira3.jpg"),
(13, "Broche Pérola de Neve", 240.0, "Um toque de inverno eterno em forma de elegância. O Broche Pérola de Neve é inspirado na pureza dos flocos que dançam ao vento.", 1, 1, 2, "http://localhost:8080/images/imgBroche.jpg"),
(14, "Broche Cristal Mágico", 100.0, "Com um toque de encanto e mistério, o Broche Cristal Mágico é uma peça que parece capturar a essência das forças sobrenaturais.", 3, 2, 1, "http://localhost:8080/images/novoBroche2.jpg"),
(15, "Broche Miragem de Neve", 169.99, "Como um sonho etéreo nas paisagens geladas, o Broche Miragem de Neve captura a beleza fugaz e deslumbrante.", 2, 3, 2, "http://localhost:8080/images/novoBroche1.3.jpg"),
(16, "Presilha Brisa do Inverno", 349.99, "Inspirada na leveza das manhãs frias, a Presilha Brisa do Inverno traz um toque poético ao seu visual.", 4, 1, 3, "http://localhost:8080/images/imgPresilha.jpg"),
(17, "Relógio de Platina", 95.0, "relógio de platina", 2, 3, 5, "https://www.sarajoias.com.br/rolex/fotos/upright_watch_assets_portrait/m126506-0001.webp"),
(18, "Anel de Prata", 220.0, "anel de prata", 2, 2, 1, "https://www.pratafina.com.br/upload/produto/imagem/b_anel-de-prata-com-s-mbolo-do-infinito-e-zirc-nia-cristal-1.webp"),
(19, "Brincos de Ouro", 320.0, "brincos de ouro", 2, 1, 2, "https://maisejoias.bwimg.com.br/maisejoias/produtos/brinco-no-folheado-a-ouro-18k-1708625935.8929.jpg"),
(20, "Pulseira de Esmeralda", 120.0, "pulseira de esmeralda", 3, 2, 4, "https://lojavivara.vtexassets.com/arquivos/ids/777123/Pulseira-Baby-em-Ouro-Amarelo-18k-com-Esmeralda-e-Diamantes-13706_1_set.jpg?v=638437347674330000");