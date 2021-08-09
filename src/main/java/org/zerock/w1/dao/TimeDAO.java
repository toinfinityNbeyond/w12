package org.zerock.w1.dao;

import org.zerock.db.util.JdbcTemplate;


public class TimeDAO {

    public String getTime() throws RuntimeException {

        StringBuffer buffer = new StringBuffer();

        new JdbcTemplate() {
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement("select now()");
                resultSet = preparedStatement.executeQuery();
                resultSet.next();
                System.out.println(resultSet.getString(1));
            }
        }.makeAll();;

        return buffer.toString();
    }
}












//package org.zerock.w1.dao;
//
//import com.mysql.cj.protocol.Resultset;
//import com.mysql.cj.x.protobuf.MysqlxPrepare;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//import static java.lang.Class.forName;
//
//public class TimeDAO {
//
//    static {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public String getTime() throws RuntimeException {
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet resultSet = null;
//        String currenTime = null;
//
//
//        try{
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bit08db","bituser","bituser");
//            //127.0.0.1 대신localhost를 써야 안전
//            preparedStatement = connection.prepareStatement("select now()");
//            resultSet = preparedStatement.executeQuery();
//
//            resultSet.next();
//
//            currenTime = resultSet.getString(1); // 첫번째 값을 뽑아라.
//
//        }catch (Exception e){
//            throw new RuntimeException(e.getMessage());
//        }finally {
//            if(resultSet != null) {
//                try { resultSet.close();} catch (Exception e) {}
//            }
//            if(preparedStatement != null) {
//                try { preparedStatement.close();} catch (Exception e) {}
//            }
//            if(connection != null) {
//                try { connection.close();} catch (Exception e) {}
//            }
//
//        }
//
//        return currenTime;
//    }
//}
////런타임 받아도 되고 안받아도 되고
//문제가 생기면 예외를 던져라