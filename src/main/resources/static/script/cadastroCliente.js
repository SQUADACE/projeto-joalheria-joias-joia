document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("cadastro_UsuarioForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		// ARMAZENA OS ATRIBUTOS INFORMADOS NO CADASTRO DO CLIENTE, CADASTRADO NO HTML
		const nomeUsuario = document.getElementById("nomeUsuario").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const dataNascimento = document.getElementById("dataNascimento").value;
		const senha = document.getElementById("senha").value;
		
		try {
			// REALIZA O POST ENVIANDO AS INFORMAÇÕES PARA O BACKEND
			const response = await fetch("http://localhost:8080/cadastro_usuario", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({// NO FORMATO JSON
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
			});
			// SE HOUVER ERRO
			if (!response.ok) {
				throw new Error('Erro ao cadastrar cliente');
			}

							
			const data = await response.json();
			// Armazena o ID do cliente no localStorage
			localStorage.setItem('clienteId', data.idUsuario); // Supondo que o backend retorne { id: 1, ... }
			window.location.href = "cadastroendereco.html";
			// SE HOUVER ERRO
			} catch (error) {
			console.error("Erro ao Cadastrar o usuário:", error);
			alert('Falha ao cadastrar cliente. Tente novamente.')
		}

	});
});