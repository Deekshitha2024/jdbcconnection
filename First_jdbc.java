
import java.sql.*;
import java.util.*;

class First_Jdbc{
    public static void main(String[] args){
    try{
        //load driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //create a connection
        // url,username,password
        String url="jdbc:mysql://localhost:3306/teacher";
        String username="root";
        String password="Deeksha@1010";
        Connection con=DriverManager.getConnection(url, username, password);
        Statement stmt=con.createStatement();
        Scanner sc=new Scanner(System.in);
        int id1=sc.nextInt();
        String name2=sc.next();
        String address1=sc.next();
       // int result=stmt.executeUpdate("insert into student( id,name,address) values('100','deeksha','bangalore')");
         int result=stmt.executeUpdate("insert into student( id,name,address) values(id1,'name2','address1')");

        
        if(result>0){
            System.out.println("Successfully inserted");
        }
        else{
            System.out.println("unsuccessfull inserted");
        }


        if(con.isClosed())
        {
            System.out.println("Connection is closed");
        }
        else{
            System.out.println("Connection is created");
        }


    }catch(Exception e){e.printStackTrace();}
    }
}
