document.addEventListener("DOMContentLoaded", () => {

	// OBTÉM OS PARÂMETROS DA URL
	const urlParams = new URLSearchParams(window.location.search);
	// PEGA O VALOR DO ID
	const produtoId = urlParams.get("id");
	// SE TIVER O PRODUTO
	if (produtoId) {
		// REALIZA O POST ENVIENDO AS INFORMAÇÕES PARA O BACKEND
		fetch(`http://localhost:8080/cadastro_produto/${produtoId}`)
			.then(response => response.json()) // NO FORMATO JSON
			.then(produto => {
				// ATUALIZA A IMAGEM DO PRODUTO E O NOME
				document.getElementById("produto-img").src = produto.imgUrl;
				document.getElementById("produto-img").alt = produto.nomeProduto;
				// ATUALIZA O NOME DO PRODUTO
				document.getElementById("produto-nome").textContent = produto.nomeProduto;
				// ATUALIZA A DESCRIÇÃO DO PRODUTO
				document.getElementById("produto-descricao").textContent = descricaoProduto;
				// ATUALIZA O PREÇO DO PRODUTO
				document.getElementById("produto-preco").textContent = 'R$ ${produto.preco.toFixed(2)}';
			})
			// SE HOUVER ERRO
			.catch(error => console.error("Erro ao carregar produto:", error));
	}
});