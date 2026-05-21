let editIndex = null;

window.onload = function () {

  const index = localStorage.getItem("editIndex");

  if (index !== null) {

    const usuarios = JSON.parse(localStorage.getItem("usuarios")) || [];

    const usuario = usuarios[index];

    if (usuario) {

      document.getElementById("nome").value = usuario.nome;
      document.getElementById("email").value = usuario.email;
      document.getElementById("telefone").value = usuario.telefone;

      document.getElementById("btnCadastrar").innerText = "Salvar edição";

      editIndex = Number(index);
    }

    localStorage.removeItem("editIndex");
  }
};

function cadastrar() {

  const nome = document.getElementById("nome").value;
  const email = document.getElementById("email").value;
  const telefone = document.getElementById("telefone").value;

  const mensagem = document.getElementById("mensagem");

  const telefoneRegex = /^[0-9]+$/;


  if (!nome || !email || !telefone) {
    mensagem.innerText = "Preencha todos os campos";
    mensagem.style.color = "red";
    return;
  }

  if (!email.includes("@")) {
  mensagem.innerText = "Email inválido: digite novamente";
  mensagem.style.color = "red";
  return;
}

if (!telefoneRegex.test(telefone)) {
  mensagem.innerText = "Telefone inválido: use apenas números e não dá espaço entre o dd e os numeros ";
  mensagem.style.color = "red";
  return;
}

  let usuarios = JSON.parse(localStorage.getItem("usuarios")) || [];

  // =========================
  // EDITAR
  // =========================
  if (editIndex !== null) {

    usuarios[editIndex] = {
      nome,
      email,
      telefone
    };

    mensagem.innerText = "Usuário editado com sucesso";

    document.getElementById("btnCadastrar").innerText = "Cadastrar";

    editIndex = null;

  } 
  // =========================
  // CADASTRAR
  // =========================
  else {

    usuarios.push({
      nome,
      email,
      telefone
    });

    mensagem.innerText = "Usuário cadastrado com sucesso";
  }

  mensagem.style.color = "green";

  localStorage.setItem("usuarios", JSON.stringify(usuarios));

  limparCampos();
}

function limparCampos() {

  document.getElementById("nome").value = "";
  document.getElementById("email").value = "";
  document.getElementById("telefone").value = "";
}