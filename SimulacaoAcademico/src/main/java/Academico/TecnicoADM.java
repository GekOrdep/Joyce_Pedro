package Academico;

import java.util.Date;

public class TecnicoADM extends Pessoa {
    public TecnicoADM(String _Nome, String _CPF, Date _DtNascimento) {
        super(_Nome, _CPF, _DtNascimento);
    }
    String login;
    String matricula;
}
