/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author LabGSG
 */
public class HelloService {
    public static String sayHello (String nama, String username, String password, String password2, String birthday,String gender, String email) {
        return 
       "<h2> CREATE YOUR FACEBOOK ACCOUNT</h2>"+
        " <table>"+
        "<tr><td>"+
        " <p>  "+"Your Name </td><td>:</td>"+"<td>"+nama+"</td></tr>"+
        "<tr><td>"+
        " <p>  "+"Your Username </td><td>:</td>"+"<td>"+username+"</td></tr>"+      
            "<tr><td>"+
        " <p>  "+"Your Email </td><td>:</td>"+"<td>"+email+"</td></tr>"+      
            "<tr><td>"+
        " <p>  "+"Birthday </td><td>:</td>"+"<td>"+birthday+"</td></tr>"+
                 "<tr><td>"+
        " <p>  "+"Gender </td><td>:</td>"+"<td>"+gender+"</td></tr>"+
         "<tr><td>"+
        "</table>"+     
        "</form>";
    }
}
