public class Apiclass {
    // API para gerar números aleatórios

    // Classe para gerar números aleatórios
    public class RandomNumberGenerator {

        // Função para gerar um número aleatório entre 0 e 100
        public int generateRandomNumber() {
            return (int) Math.floor(Math.random() * 100);
        }

        // Método para retornar os dados da API
        public String getRandomNumber() {
            return "{" +
                    "\"number\": " + generateRandomNumber() +
                    "}";
        }
    }
}
