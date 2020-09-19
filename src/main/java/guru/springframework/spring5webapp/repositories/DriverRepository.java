package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Car;
import guru.springframework.spring5webapp.domain.Driver;
import org.springframework.data.repository.CrudRepository;


public interface DriverRepository extends CrudRepository<Driver, Long> {
}
