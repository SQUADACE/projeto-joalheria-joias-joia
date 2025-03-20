document.addEventListener("DOMContentLoaded", () => {
	
    const form = document.getElementById("cadastroProdutoForm");

    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const nome = document.getElementById("nome").value;
        const preco = document.getElementById("preco").value;
        const cor = document.getElementById("cor").value;

        try {
			
            const response = await fetch("http://localhost:8080/cadastroproduto", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    nome,
                    preco,
                    cor
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