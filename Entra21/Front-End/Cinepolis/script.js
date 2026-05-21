const sala = document.getElementById("sala");
const total = document.getElementById("total");

const filas = ["A","B","C","D","E","F","G" ,"H"];
const lugaresPorFila = 10;

const ocupados = [
  "A3",
  "B2",
  "C4",
  "D3",
  "E5",
  "F5",
  "G5",
  "H9",
  "H10",
  "H1",
  "H2"
];

let selecionados = 0;



filas.forEach(fila => {

  const linha = document.createElement("div");
  linha.classList.add("linha");

  for(let i = 1; i <= lugaresPorFila; i++){

    const assento = document.createElement("div");

    assento.classList.add("assento");

    const codigo = `${fila}${i}`;

    assento.innerText = codigo;

    if(ocupados.includes(codigo)){
      assento.classList.add("ocupado");
    }

    assento.addEventListener("click", () => {

      if(assento.classList.contains("ocupado")) return;

      assento.classList.toggle("selecionado");

      selecionados = document.querySelectorAll(".assento.selecionado").length;

      total.innerText = selecionados;

    });

    linha.appendChild(assento);

  }

  sala.appendChild(linha);

});