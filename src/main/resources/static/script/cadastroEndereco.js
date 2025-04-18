
	
	document.getElementById("cep").addEventListener("input", async function(){
		const cep = this.value.replace(/\D/g, "");
		
		if (cep.length === 8){
			try{
				const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
				
				if(!response.ok) throw new Error("Erro ao buscar CEP");
				
				const dados = await response.json();
				
				if(dados.erro){
					alert("CEP não encontrado.")
					return;
				}
				
				document.getElementById("rua").value = dados.rua;
				document.getElementById("bairro").value = dados.bairro;
				document.getElementById("estado").value = dados.estado;
				document.getElementById("cidade").value = dados.cidade;
				
			} catch(error){
				alert("Erro ao buscar o endereço: " + error.message);
			}
		}
	})
	
	document.addEventListener("DOMContentLoaded", () => {
		const form = document.getElementById("cadastroendereco");
		
    form.addEventListener("submit", async (event) => {
        event.preventDefault();

        const cep = document.getElementById("cep").value;
        const estado = document.getElementById("estado").value;
        const cidade = document.getElementById("cidade").value;
        const bairro = document.getElementById("bairro").value;
        const rua = document.getElementById("rua").value;
        const numero = document.getElementById("numero").value;
        const complemento = document.getElementById("complemento").value;

        try {
			
            const response = await fetch("http://localhost:8080/cadastroendereco", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    cep,
                    estado,
                    cidade,
                    bairro,
                    rua,
                    numero, 
                    complemento
                }),
            });

            if (response.ok) {
                alert("Endereço cadastrado!");
            } else {
                alert("Falha ao cadastrar endereço ;(");
            }
        } catch (error) {
            console.error("Erro ao cadastrar endereço: ", error);
        }
    });
});