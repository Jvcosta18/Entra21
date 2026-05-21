let lista = document.getElementById("lista");

function carregarUsuarios() {

  lista.innerHTML = "";

  let usuarios = JSON.parse(localStorage.getItem("usuarios")) || [];

  if (usuarios.length === 0) {
    lista.innerHTML = "<p>Nenhum usuário cadastrado</p>";
    return;
  }

  usuarios.forEach((usuario, index) => {

    let card = document.createElement("div");
    card.classList.add("card");

    card.innerHTML = `
      <p><strong>Nome:</strong> ${usuario.nome}</p>
      <p><strong>Email:</strong> ${usuario.email}</p>
      <p><strong>Telefone:</strong> ${usuario.telefone}</p>

      <div class="botoes-card">

        <button onclick="editarUsuario(${index})" class="btn-editar">
          Editar
        </button>

        <button onclick="deletarUsuario(${index})" class="btn-delete">
          Excluir
        </button>

      </div>
    `;

    lista.appendChild(card);
  });
}

function editarUsuario(index) {

  localStorage.setItem("editIndex", index);

  window.location.href = "index.html";
}

function deletarUsuario(index) {

  let usuarios = JSON.parse(localStorage.getItem("usuarios")) || [];

  usuarios.splice(index, 1);

  localStorage.setItem("usuarios", JSON.stringify(usuarios));

  carregarUsuarios();
}

carregarUsuarios();