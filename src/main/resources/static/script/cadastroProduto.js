document.addEventListener("DOMContentLoaded", () => {
	
    const form = document.getElementById("detalheProdutoForm");

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const nomeProduto = document.getElementById("nomeProduto").value;
        const preco = document.getElementById("preco").value;
        const nomeOrnamento = document.getElementById("nomeOrnamento").value;
		const imgUrl = document.getElementById("imgUrl").value;
		const descricaoProduto = document.getElementById("descricaoProduto").value;
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
					imgUrl,
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