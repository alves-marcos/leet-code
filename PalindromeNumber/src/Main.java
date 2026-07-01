class Solution {
    public boolean isPalindrome(int x) {
        String texto = String.valueOf(x);
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        return texto.equalsIgnoreCase(textoInvertido);

    }

}

/*
StringBuilder tem o poder de modificar a String, que em Java é imutavel, com isso usando o metodo reverse, ele inverteu toda a String de forma rapida.
o toString no final, é como se fosse uma foto, para poder pegar a String invertida e usar no equals, para poder comparar
 */

/*
* Neste Exercicio preciso verificar se o inteiro X é um palindromo, ou seja se de traz para frente é igual de frente ate o ultimo.
* 1 - Pego o inteiro e convderto para um String.
* 2 - Poderia usar Split para dividir porem encontrei uma solução mias facil;
* 3 - Usando o metodo StringBuilder().reverse().toString() => eu consigo inverter a String de forma mais simples, sem precisar separar e criar um array;
* 4 - o Return mostra a comparação da primeira conversao com a inversão: Caso seja igual retorna TRUE, se não retorna FALSE
* */