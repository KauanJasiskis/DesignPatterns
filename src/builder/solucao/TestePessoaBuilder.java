package builder.solucao;

import java.time.LocalDate;

public class TestePessoaBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder().nome("Kauan")
                .sobreNome("Jasiskis")
                .documento("123345678912")
                .email("kauan@gmail.com")
                .apelido("dd")
                .dataNascimento(LocalDate.of(2002, 12, 6))
                .build();
        System.out.println(pessoa);
    }
}
