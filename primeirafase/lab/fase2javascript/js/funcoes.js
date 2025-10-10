
// Função simples

function soma (){
    let primeiroNumero = 20;
    let segundoNumero = 30;
    console.log(primeiroNumero + segundoNumero);
}

soma();
console.log('----------------------------');

//                      parametros
                        // |
function multiplica(valor1 = 0, valor2 = 0){
    let resultado = valor1 * valor2;
console.log(`O resultado da função é: ${resultado}`);
}


        // Argumento
multiplica(2,10);
multiplica();
console.log('----------------------------');

function subtrair(valor1, valor2){
    return valor1 - valor2;

}

const resultadoFuncao = subtrair(45,40);
console.log(resultadoFuncao);
