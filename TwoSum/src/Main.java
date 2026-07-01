class Solution {

    // Declara o metodo público 'twoSum' que vai retornar um array de inteiros (int[]).
    // Ele recebe como parâmetros o array de números inteiros (nums) e o valor que queremos alcançar (target).
    public int[] twoSum(int[] nums, int target) {

        // Loop externo: A variável 'i' começa em 0 e vai até o final do array.
        // Ela serve para pegar o PRIMEIRO número da nossa tentativa de soma.
        for (int i = 0; i < nums.length; i++){

            // Loop interno: A variável 'j' começa logo após o 'i' (ou seja, i + 1) e vai até o final.
            // Ela serve para pegar o SEGUNDO número da tentativa, para não somarmos um número com ele mesmo.
            for (int j = i + 1; j < nums.length; j++){

                // Condição: Verifica se o valor na posição 'i' somado ao valor na posição 'j' é igual ao nosso alvo (target).
                if (nums[i] + nums[j] == target){

                    // Se a condição for verdadeira, cria um novo array na hora contendo as posições [i, j] e o devolve como resposta.
                    // O "return" também encerra a execução do metodo imediatamente.
                    return new int[]{i, j};
                }
            }
        }

        // Se o código passar por todos os loops e não encontrar nenhum par que dê o resultado, ele cai aqui.
        // Neste seu código, ele está retornando o próprio array 'nums' original como uma espécie de "fallback" (plano B).
        return nums;
    }
}