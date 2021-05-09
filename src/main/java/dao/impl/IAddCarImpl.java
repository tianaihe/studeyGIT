package dao.impl;

import dao.IAddCar;
import dao.ICarDao;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class IAddCarImpl implements IAddCar {
    private JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSource());
    ICarDao iCarDao=new ICarDaoImpl();

    @Override
    public void addCar(String number, String brand, int price) {//获取到了，打断点发现乱码
        String sql="insert into car values (LAST_INSERT_ID(),?,?,?)";
       jdbcTemplate.update(sql,number,brand,price);//增删改用update
       // iCarDao.selectCar();
    }

    @Override
    public void delectCar(int cid) {
        String sql="DELETE from car where cid=?";
        jdbcTemplate.update(sql,cid);
    }
}
