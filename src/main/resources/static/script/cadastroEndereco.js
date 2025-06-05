document.addEventListener("DOMContentLoaded", () => {

	document.getElementById("cep").addEventListener("input", async function () {
		const cep = this.value.replace(/\D/g, "");

		if (cep.length === 8) {
			try {
				const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
				if (!response.ok) throw new Error("Erro ao buscar CEP");

				const dados = await response.json();
				if (dados.erro) {
					alert("CEP não encontrado.");
					return;
				}

				document.getElementById("rua").value = dados.logradouro;
				document.getElementById("bairro").value = dados.bairro;
				document.getElementById("estado").value = dados.uf;
				document.getElementById("cidade").value = dados.localidade;
			} catch (error) {
				alert("Erro ao buscar o endereço: " + error.message);
			}
		}
	});

	const form = document.getElementById("cadastroEnderecoForm");
	const clienteId = localStorage.getItem('clienteId');

	if (!clienteId) {
		alert("Cliente não encontrado. Por favor, cadastre um cliente primeiro.");
		window.location.href = "cadastroCliente.html";
		return;
	}

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const cep = document.getElementById("cep").value;
		const uf = document.getElementById("estado").value;
		const cidade = document.getElementById("cidade").value;
		const bairro = document.getElementById("bairro").value;
		const rua = document.getElementById("rua").value;
		const numeroCasa = document.getElementById("numero").value;
		const complemento = document.getElementById("complemento").value;

		try {
			const response = await fetch("http://localhost:8080/cadastro_endereco", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					cep,
					uf,
					cidade,
					bairro,
					rua,
					numeroCasa,
					complemento,
					cliente: {
						idUsuario: clienteId
					}
				})
			});

			if (!response.ok) {
				throw new Error('Erro ao cadastrar endereço');
			}

			const data = await response.json();

			alert('Cadastro feito com sucesso.');
			localStorage.removeItem('clienteId');
			window.location.href = 'index.html';

		} catch (error) {
			console.error("Erro ao cadastrar endereço: ", error);
			alert('Falha ao cadastrar. Tente novamente.');
		}
	});
});
