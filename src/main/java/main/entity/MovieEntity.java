package main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moviedetails")
public class MovieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name = "title")
	private String  title;
	
	@Column(name = "description")
	private String  description;
	
	@Column(name = "programtype")
	private String  programType;
	
	@Column(name = "releaseyear")
	private String  releaseYear;
	
	@Column(name = "poster")
	private String  poster;
	
	@Column(name = "price")
	private String  price;

	public MovieEntity(int id, String title, String description, String programType, String releaseYear,
			String poster, String price) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.programType = programType;
		this.releaseYear = releaseYear;
		this.poster = poster;
		this.price = price;
	}

	public MovieEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProgramType() {
		return programType;
	}

	public void setProgramType(String programType) {
		this.programType = programType;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
