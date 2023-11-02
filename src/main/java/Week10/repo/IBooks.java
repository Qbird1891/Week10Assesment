package Week10.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Week10.Beans.Books;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2021
 * Oct 30, 2023
 */
@Repository
public interface IBooks extends JpaRepository<Books, Long> {

}
