-- Conteúdo do Cadastro do Cliente
INSERT IGNORE INTO tb_tipo_usuario (id_tipo_usuario, nome_tipo_usuario) VALUES
(1, 'Admin'),
(2, 'Cliente'),
(3, 'Vendedor'),
(4, 'Gerente');

-- Conteúdo do Cadastro do Produto
INSERT IGNORE INTO tb_categoria_produto (id_categoria_produto, categoria_produto, descricao_categoria_produto) VALUES
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
INSERT IGNORE INTO tb_ornamento_produto (id_ornamento_produto, nome, descricao) VALUES
(1, 'Rubi', '1k'),
(2, 'Esmeralda', '14k'),
(3, 'Diamante', '8k'),
(4, 'Safira', '3k');