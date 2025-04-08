document.addEventListener("DOMContentLoaded", () => {
	
    const form = document.getElementById("cadastroProdutoForm");

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const nome_Produto = document.getElementById("nome_Produto").value;
        const preco = document.getElementById("preco").value;
        const nome_Ornamento = document.getElementById("nome_Ornamento").value;
		const img_url = document.getElementById("img_url").value;
		const categoria_Produto = parseInt(document.getElementById("categoria_Produto").value);
		const tipo_Produto = parseInt(document.getElementById("tipo_Produto").value);
		

        try {
			
            const response = await fetch("http://localhost:8080/cadastro_produto", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    nome_Produto,
                    preco,
                    nome_Ornamento,
					img_url,
					categoria_Produto: {
					                   id: categoria_Produto
					               }, 
					tipo_Produto: {
					                   id: tipo_Produto
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