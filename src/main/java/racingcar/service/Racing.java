package racingcar.service;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.service.RandomNumber;
import racingcar.view.ResultView;

import java.util.*;

public class Racing {

    private static final RandomNumber RANDOM_NUMBER = new RandomNumber();

    public void startRacing(int carCount, int tryCount) {
        Cars cars = new Cars(carCount);
        List<Car> carList = cars.getCarList();

        for (int i = 0; i < tryCount; i++) {
            moveCars(carList);
            System.out.println("");
        }
    }

    public void moveCars(List<Car> cars) {
        for (Car car : cars) {
            car.move(RANDOM_NUMBER.getRandomNumber());
            ResultView.printPosition(car.position());
        }
    }
}
