document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("detalheProdutoForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		// ARMAZENA OS ATRIBUTOS INFORMADOS NO CADASTRO DO PRODUTO
		const nomeProduto = document.getElementById("nomeProduto").value;
		const preco = document.getElementById("preco").value;
		const nomeOrnamento = document.getElementById("nomeOrnamento").value;
		const img_url = document.getElementById("img_url").value;
		const categoriaProduto = parseInt(document.getElementById("categoriaProduto").value);
		const tipoProduto = parseInt(document.getElementById("tipoProduto").value);


		try {
			//  REALIZA O POST ENVIENDO AS INFORMAÇÕES PARA O BACKEND
			const response = await fetch("http://localhost:8080/cadastro_produto", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nomeProduto,
					preco,
					nomeOrnamento,
					img_url,
					categoriaProduto: {
						id: categoriaProduto
					},
					tipoProduto: {
						id: tipoProduto
					}
				}),
			});
			// SE ESTIVER OK 
			if (response.ok) {
				alert("Produto cadastrado!");
			// SE APRESENTA ALGUMA FALHA	
			} else {
				alert("Falha ao cadastrar produto :O");
			}
			// CASO HAJA ERRO
		} catch (error) {
			console.error("Erro ao cadastrar produto: ", error);
		}
	});
});