package org.zerock.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class JdbcTemplate {

    static{ //메모리에 박제 시키려고. 반환x jar파일 연결.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 동적 로딩
            //- 자바 리플렉션 API(Java Reflection API : 구체적인 클래스의 타입을 알지 못해도 클래스의 변수 및 메소드 등에 접근하게 해주는 API)의 일부. 
            //- 동적 로딩 : 어떠한 클래스가 로딩 될지 모르기 때문에 Class의 forName() 함수를 이용해 해당 클래스를 메모리로 로드하는 것.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected Connection connection;
    protected PreparedStatement preparedStatement;
    protected ResultSet resultSet;


    public void makeAll(){
        try {
            makeConnection();
            execute(); // 추상메서드로 만들고 사용할 때마다 오버라이딩.
            System.out.println("END");
        }catch(Exception e){

        }finally {
            finish();
        }
    }

    protected abstract void execute()throws Exception; // 추상메서드로 선언 . StroeDAO

    private void makeConnection() throws Exception{
        System.out.println("물끓이기");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bit08db?serverTimezone=Asia/Seoul","bituser","bituser");
    }

    private void finish() {
        System.out.println("------------finish--------------");
        System.out.println("Template ResultSet: "+ resultSet);
        System.out.println("Template PreparedStatement: "+preparedStatement);
        System.out.println(connection);

        if(resultSet != null){
            try{ resultSet.close(); }catch(Exception e){}
        }

        if(preparedStatement != null){
            try{ preparedStatement.close(); }catch(Exception e){}
        }

        if(connection != null){
            try{ connection.close(); }catch(Exception e){}
        }
    }
}