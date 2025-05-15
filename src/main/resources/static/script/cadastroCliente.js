document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("cadastro_UsuarioForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nomeUsuario = document.getElementById("nomeUsuario").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const dataNascimento = document.getElementById("dataNascimento").value;
		const senha = document.getElementById("senha").value;
		
		try {

			const response = await fetch("http://localhost:8080/cadastro_usuario", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nomeUsuario,
					cpf,
					email,
					telefone,
					dataNascimento,
					senha,
					tipoUsuario:{
						idTipoUsuario: 2
					}
	
				})
				.then(response => {
				if (!response.ok) {
				throw new Error('Erro ao cadastrar cliente');
								}
		return response.json(); // Pega o corpo da resposta (esperando que venha o objeto com id)
							})
		.then(data => {
		// Armazena o ID do cliente no localStorage
		localStorage.setItem('clienteId', data.id); // Supondo que o backend retorne { id: 1, ... }

			// Redireciona para a página inicial
			window.location.href = '../sucesso/index.html';
											})

									})

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