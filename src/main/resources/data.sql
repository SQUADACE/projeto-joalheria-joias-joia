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
(1, "Anel Rubi Vivara", 1.5, "anel rubi top", 2, 1, 3, "https://lojavivara.vtexassets.com/arquivos/ids/884330/Anel-Classic-Oriental-em-Ouro-Amarelo-18k-com-Rubi-e-Diamantes-17398_2_set.jpg?v=638592393533030000"),
(2, "Colar Esmeralda", 25.0, "colar esmeralda brilhante", 1, 1, 1, "https://lojavivara.vtexassets.com/arquivos/ids/906682-1600-1600/Pingente-Expressao-Retangular-em-Ouro-Amarelo-18k-com-Esmeralda-104082_1_set.jpg?v=638724009518200000"),
(3, "Pulseira de Topázio", 80.0, "pulseira de topázio", 2, 2, 2, "https://montecarlo.vtexassets.com/arquivos/ids/703012/NIM028124_1.jpg?v=638647074386970000"),
(4, "Anel de Paládio", 50.0, "anel de paládio", 3, 3, 1, "https://www.luxjoias.com/images/anelformaturapaladium_18.jpg"), 
(5, "Brincos de Ródio", 200.0, "brincos de ródio", 2, 1, 3, "https://images.tcdn.com.br/img/img_prod/1198977/brinco_argola_rodio_com_zirconias_brancas_701_1_464ce61c19eee962a13416709fb535d6.jpg"),
(6, "Relógio de Prata", 175.0, "relógio de prata", 2, 3, 5, "https://seculus.vtexassets.com/arquivos/ids/242869-800-auto?v=638798005490700000&width=800&height=auto&aspect=true"),
(7, "Pulseira de Safira", 35.0, "pulseira de safira", 4, 2, 4, "https://images.tcdn.com.br/img/img_prod/938998/pulseira_riviera_com_zirconias_safira_redondas_e_micro_zirconias_brancas_cravejadas_ao_redor_9416_1_8b0b692e94b046d26e813fad5cbf8f73.jpg"),
(8, "Anel de Ouro", 40.0, "anel de ouro", 1, 2, 3, "https://lojavivara.vtexassets.com/arquivos/ids/745673/Anel-Viena-em-Ouro-Amarelo-18k-1823_1_set.jpg?v=638437289738700000"),
(9, "Colar de Platina", 120.0, "colar de platina", 2, 3, 2, "https://tiffany.vtexassets.com/arquivos/ids/171815/colar-tiffany-solitaire-em-platina-com-diamante-14001557_2.jpg?v=638285956593630000"),
(10, "Pulseira de Diamante", 900.0, "pulseira de diamante", 3, 3, 4, "https://tiffany.vtexassets.com/arquivos/ids/173626/pulseira-tiffany-victoria-line-em-platina-com-diamantes-13674108_1.jpg?v=638285965036400000"),
(11, "Brincos de Rubi", 10.0, "brincos de rubi", 1, 2, 3, "https://lojavivara.vtexassets.com/arquivos/ids/862897/Brinco-Classico-Especial-em-Ouro-Branco-18k-com-Rubi-e-Diamantes-9342_2_set.jpg?v=638518599699100000"),
(12, "Relógio de Ouro", 75.0, "relógio de ouro", 3, 1, 5, "https://images.tcdn.com.br/img/img_prod/687890/relogio_seiko_solar_coutura_perpetual_alarm_dourado_ssc700_7117_1_cda4a7c420605f15014e66b5c893ea93_20250220101616.jpg"),
(13, "Anel de Esmerala", 240.0, "anel de esmeralda", 1, 1, 2, "https://www.verse-joaillerie.com.br/cdn/shop/products/anel_solitario_ouro_amarelo_de_esmeralda_celebrate.png?v=1660920766"),
(14, "Anel de Diamante", 100.0, "anel de diamante", 3, 2, 1, "https://img.irroba.com.br/fit-in/600x600/filters:fill(fff):quality(80)/helderjo/catalog/aneis/sol1407-anel-de-noivado-com-diamantes-princess-helder-joalheiros.jpg"),
(15, "Colar de Rubi", 1000.0, "colar de rubi", 2, 3, 2, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYYGkC7N27DhEwP1n6ZTTz2opTmKSV78q3pw&s"),
(16, "Brincos de Safira", 300.0, "brincos de safira", 4, 1, 3, "https://acdn-us.mitiendanube.com/stores/001/983/988/products/32252az11-8bf48726a96f08e46e16588990944426-1024-1024.jpg"),
(17, "Relógio de Platina", 95.0, "relógio de platina", 2, 3, 5, "https://www.sarajoias.com.br/rolex/fotos/upright_watch_assets_portrait/m126506-0001.webp"),
(18, "Anel de Prata", 220.0, "anel de prata", 2, 2, 1, "https://www.pratafina.com.br/upload/produto/imagem/b_anel-de-prata-com-s-mbolo-do-infinito-e-zirc-nia-cristal-1.webp"),
(19, "Brincos de Ouro", 320.0, "brincos de ouro", 2, 1, 2, "https://maisejoias.bwimg.com.br/maisejoias/produtos/brinco-no-folheado-a-ouro-18k-1708625935.8929.jpg"),
(20, "Pulseira de Esmeralda", 120.0, "pulseira de esmeralda", 3, 2, 4, "https://lojavivara.vtexassets.com/arquivos/ids/777123/Pulseira-Baby-em-Ouro-Amarelo-18k-com-Esmeralda-e-Diamantes-13706_1_set.jpg?v=638437347674330000");