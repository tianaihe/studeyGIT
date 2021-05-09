package dao.impl;

import dao.ICarDao;
import domain.Car;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ICarDaoImpl implements ICarDao {
   private JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSource());//为null，数据库没连上

   @Override
   public List<Car> selectCar(int num) {//数据传递到这里都没/问题！
       String sql = "select * from car order by rand() limit ?";
     /* StringBuilder sb = new StringBuilder(sql);
      ArrayList list = new ArrayList();
      if (num<=20 && num>=0){
         //sb.append(num);
         list.add(num);
      }*/
//       List<Car> car = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Car>(Car.class), list.toString());//todo 由于我数据库版本和驱动版本不一致，导致我数据库一直连不上,改了驱动和配置文件
     List<Car> car=null;
       if (num <= 20 && num >= 0) {
           car  = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Car>(Car.class), num);
           System.out.println(car);
       }
       return car;
//return car;
//return null;

  }
}
