package service;

import domain.Car;

import java.util.List;

public interface ICarService {
    List<Car> selectCar (int num);

    Car selectOne (int cid);
}
