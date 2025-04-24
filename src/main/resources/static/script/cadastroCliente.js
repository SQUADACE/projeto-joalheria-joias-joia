document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("cadastro_UsuarioForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nome_usuario = document.getElementById("nome_usuario").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const data_nascimento = document.getElementById("data_nascimento").value;
		const senha = document.getElementById("senha").value;
		
		try {

			const response = await fetch("http://localhost:8080/cadastro_usuario", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nome_usuario,
					cpf,
					email,
					telefone,
					data_nascimento,
					senha,
					tipo_usuario:{
						id_tipo_Usuario: 2
					}
	
				}),
			});

			if (response.ok) {
				alert("Usuário cadastrado com sucesso!");
				window.location.href = "cadastroendereco.html";
			} else {
				alert("Erro ao cadastrar o usuário");
			}
		} catch (error) {
			console.error("Erro ao Cadastrar o usuário:", error);
		}

	});
});