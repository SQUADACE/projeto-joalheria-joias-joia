document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("detalheProdutoForm");

<<<<<<< HEAD
        const nomeProduto = document.getElementById("nomeProduto").value;
        const preco = document.getElementById("preco").value;
        const nomeOrnamento = document.getElementById("nomeOrnamento").value;
		const imgUrl = document.getElementById("imgUrl").value;
		const descricaoProduto = document.getElementById("descricaoProduto").value;
=======
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		// ARMAZENA OS ATRIBUTOS INFORMADOS NO CADASTRO DO PRODUTO
		const nomeProduto = document.getElementById("nomeProduto").value;
		const preco = document.getElementById("preco").value;
		const nomeOrnamento = document.getElementById("nomeOrnamento").value;
		const img_url = document.getElementById("img_url").value;
>>>>>>> df0a8dfcc2820291ed19e7159322d728430cfbb9
		const categoriaProduto = parseInt(document.getElementById("categoriaProduto").value);
		const tipoProduto = parseInt(document.getElementById("tipoProduto").value);

<<<<<<< HEAD
        try {
			
            const response = await fetch("http://localhost:8080/cadastro_produto", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    nomeProduto,
                    preco,
                    nomeOrnamento,
					imgUrl,
=======

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
>>>>>>> df0a8dfcc2820291ed19e7159322d728430cfbb9
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