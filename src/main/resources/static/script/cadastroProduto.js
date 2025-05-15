document.addEventListener("DOMContentLoaded", () => {
	
    const form = document.getElementById("cadastroProdutoForm");

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const nomeProduto = document.getElementById("nomeProduto").value;
        const preco = document.getElementById("preco").value;
        const nomeOrnamento = document.getElementById("nomeOrnamento").value;
		const img_url = document.getElementById("img_url").value;
		const categoriaProduto = parseInt(document.getElementById("categoriaProduto").value);
		const tipoProduto = parseInt(document.getElementById("tipoProduto").value);
		

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
					img_url,
					categoriaProduto: {
					                   id: categoriaProduto
					               }, 
					tipoProduto: {
					                   id: tipoProduto
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