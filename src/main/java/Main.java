import model.Endereco;
import service.ViacepService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        ViacepService viacepService = new ViacepService();

        try {
            Endereco endereco = viacepService.getEndereco("87025472");
            System.out.println(endereco);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
