

import Model.Funcionario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewClass {
    
    public static void main(String[] args) throws ParseException {
         
        java.util.Date dataUtil = new java.util.Date();  
        java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
        System.out.println(dataSql); 
    }
    
}
