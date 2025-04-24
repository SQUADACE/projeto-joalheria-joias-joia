document.addEventListener("DOMContentLoaded", () => {

	const urlParams = new URLSearchParams(window.location.search);

	const produtoId = urlParams.get("id");

	if (produtoId) {

		fetch(`http://localhost:8080/cadastro_produto/${produtoId}`)
			.then(response => response.json())
			.then(produto => {
				document.getElementById("produto-img").src = produto.imgUrl;
				document.getElementById("produto-img").alt = produto.nome_Produto;

				document.getElementById("produto-nome").textContent = produto.nome_Produto;

				document.getElementById("produto-descricao").textContent = descricao_Produto;

				document.getElementById("produto-preco").textContent = "R$ ${preco.toFixed(2)}";
			})
			.catch(error => console.error("Erro ao carregar produto:", error));
	}
});