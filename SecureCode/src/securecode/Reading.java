/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securecode;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import static javafx.beans.binding.Bindings.select;
import javax.swing.JOptionPane;
/**
 *
 * @author BINEEK RAJA
 */
public class Reading {
    
    
    public Reading() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException{
        Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/securecode","root","vikashanand");
        String s1=("select * from javadata");
        Statement s=c.createStatement();
        ResultSet rs=s.executeQuery(s1);
       /*while(rs.next())
        {
            Long p=rs.getLong(1);
            System.out.println(p);
        } */
        //Long q;
        //q = rs.getLong(1);
        File f=new File("Code.txt");
        
        ArrayList<Long> alindex = new ArrayList<Long>();
        ArrayList<String> alstring = new ArrayList<String>();
        Scanner scan=new Scanner(f);
        //scan.useDelimiter("[^A-Za-z]+");
        while(scan.hasNextLine()){
            String a=scan.nextLine();
            a=a.replaceAll("[^a-zA-Z0-9_-]", " ");
            //System.out.print(a);
            String word[]= a.split(" ");
      
            
            int wl= word.length;
            for(int l=0;l<wl;l++)
            {
                int prime=101;
                long hash=0;
                
                char[] str=word[l].toCharArray();
                int end=str.length;
                //System.out.println(end);    
                for(int i=0;i<end;i++)
                {
                    hash+=str[i]*Math.pow(prime,i);      
                }
                //System.out.println(hash);            // To Print the Hash Values
                if(hash != 0){
                alindex.add(hash);                     // To store the data in array List
                alstring.add(word[l]);
                }
            }
        }
        ArrayList<Long> dlindex = new ArrayList<Long>();
        ArrayList<String> dlstring = new ArrayList<String>();
        while(rs.next())
        {
            Long p=rs.getLong(1);
            String q=rs.getString(3);
            dlindex.add(p);
            dlstring.add(q);
        }
        
        
        /*while(itrIndex.hasNext() && itrString.hasNext()){  
            Long var1=(Long) itrIndex.next(); 
            String var2=(String) itrString.next();
            System.out.println(var1+" "+var2);  
            }  */
        dlindex.retainAll(alindex);
        dlstring.retainAll(alstring);
        
        
        //Iterator itrIndex = dlindex.iterator();
        Iterator itrString = dlstring.iterator();
        int length= dlstring.size();
        String str[]=new String[length];
        int i=0;
         while(itrString.hasNext()){  
             str[i]=(String) itrString.next();
            //System.out.println(str[i]);
            i++;
        }
         JOptionPane.showMessageDialog(null, str,"The following functions are vulnerable",0);
        
        
    } 
}

