document.addEventListener("DOMContentLoaded", () => {
	
    const form = document.getElementById("cadastroProdutoForm");

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const nome_Produto = document.getElementById("nome_Produto").value;
        const preco = document.getElementById("preco").value;
        const nome_ornamento = document.getElementById("nome_ornamento").value;
		const img_url = document.getElementById("img_url").value;
		const categoria_produto = parseInt(document.getElementById("categoria_produto").value);
		const tipo_produto = parseInt(document.getElementById("tipo_produto").value);
		

        try {
			
            const response = await fetch("http://localhost:8080/cadastroproduto", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    nome_Produto,
                    preco,
                    nome_ornamento,
					img_url,
					categoria_produto: {
					                   id: categoria_produto
					               }, 
					tipo_produto: {
					                   id: tipo_produto
					               }
                }),
            });

            if (response.ok) {
                alert("Produto cadastrado!");
            } else {
                alert("Falha ao cadastrar produto :O");
            }
        } catch (error) {
            console.error("Erro ao cadastrar produto: ", error);
        }
    });
});