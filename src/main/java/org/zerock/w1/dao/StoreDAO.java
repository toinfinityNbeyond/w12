package org.zerock.w1.dao;

import org.zerock.db.util.JdbcTemplate;
import org.zerock.w1.dto.StoreDTO;

public class StoreDAO {

    public void insert(final StoreDTO storeDTO) throws RuntimeException {

       String sql =  "insert into tbl_store (name,area,menus,link) values (?,?,?,?)";

       new JdbcTemplate() {
           @Override
           protected void execute() throws Exception {
               preparedStatement = connection.prepareStatement(sql); //prepareStatement 랑 ?와 세트.
               preparedStatement.setString(1, storeDTO.getName()); //getXXX 가져와서 조회.복사해서
               preparedStatement.setString(2, storeDTO.getArea());
               preparedStatement.setString(3, storeDTO.getDesc());
               preparedStatement.setString(4, storeDTO.getLink());

               preparedStatement.executeUpdate(); // insert문일 때 사용
       }.makeAll();

    }

}
