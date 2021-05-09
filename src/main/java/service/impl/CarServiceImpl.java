package service.impl;

import dao.ICarDao;
import dao.SelectOneById;
import dao.impl.ICarDaoImpl;
import dao.impl.SelectOneByIdImpl;
import domain.Car;
import service.ICarService;

import java.util.List;

public class CarServiceImpl implements ICarService {
   private ICarDao ic= new ICarDaoImpl();
   SelectOneById selectOneById=new SelectOneByIdImpl();

    @Override
    public List<Car> selectCar(int num) {
        List<Car> cars = ic.selectCar(num);
        return cars;
    }

    @Override
    public Car selectOne(int cid) {
        Car car = selectOneById.selectOne(cid);
        return car;
    }
}
