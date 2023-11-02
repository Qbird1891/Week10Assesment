package Week10.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2021
 * Oct 30, 2023
 */
@Entity
@Data
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;
	private String title;
	private String author;
	private String category;
	private int publicationDate;


}
