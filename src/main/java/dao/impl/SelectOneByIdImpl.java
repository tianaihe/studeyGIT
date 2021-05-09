package dao.impl;

import dao.SelectOneById;
import domain.Car;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class SelectOneByIdImpl implements SelectOneById {
    JdbcTemplate jdbcTemplate= new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public Car selectOne(int cid) {
        String sql="select * from car where cid=?";
        Car car=new Car();
       // car=jdbcTemplate.query(sql, new BeanPropertyRowMapper<Car>(Car.class),cid);
       car= jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Car>(Car.class),cid);
        return car;
    }
}
