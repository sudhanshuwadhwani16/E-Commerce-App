package model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column()
	private long id;
	
	@Column
	private String name;
	
	@Column
	private String type;
	
	@Column
	private String Description;
	
	@Lob
    @Column(name = "Image", length = Integer.MAX_VALUE)
	private byte[] image;
	
	@Column
	private double price;

	public Products() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + Description + ", price=" + price + ", image="
				+ Arrays.toString(image) + "]";
	}
}
