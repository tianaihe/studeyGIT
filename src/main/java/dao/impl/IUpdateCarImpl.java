package dao.impl;

import dao.IUpdateCar;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class IUpdateCarImpl implements IUpdateCar {
    JdbcTemplate jdbcTemplate= new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public void updateCar(int cid,String number,String brand ,int price) {
        String sql="update car set number=?,brand=?,price=? where cid=? ";
        jdbcTemplate.update(sql,number,brand,price,cid);
    }
}
