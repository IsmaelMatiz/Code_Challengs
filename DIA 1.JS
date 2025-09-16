milista=[13,5,4,9,48]

function eliminar(arr) {
  const result = [];
  for (let i = 0; i < arr.length; i++) {
    if (i % 2 === 0) {
      result.push(arr[i]);
    }
  }
  return result;
}

resultado = eliminar(milista)
console.log(resultado)
console.log(milista)