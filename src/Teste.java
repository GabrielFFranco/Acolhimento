
import DAO.EncaminhamentoDAO;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gabri
 */
public class Teste {

    public static void main(String[] args) {
        EncaminhamentoDAO encaminhamento = new EncaminhamentoDAO("Saúde", "Hospital Cardíaco", "Ativo", 7685575930L, 1, 123);
        
        try {
            //encaminhamento.setEncaminhamento();

            ArrayList lista = encaminhamento.getEncaminhamento();

            for (Iterator itr = lista.iterator(); itr.hasNext();) {
                int i = 0;
                Object[] campos = (Object[]) itr.next();
                while (i < 6) {
                    System.out.println(campos[i].toString());
                    i++;
                }
            }

            encaminhamento = encaminhamento.getEncaminhamento(2);
            
            System.out.println(encaminhamento.getLocalEnc().toString());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
