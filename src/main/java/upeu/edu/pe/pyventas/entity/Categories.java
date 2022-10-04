package upeu.edu.pe.pyventas.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Categories implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int CategoryID;
	private String CategoryName;
	
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
