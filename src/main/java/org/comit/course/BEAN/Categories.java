package org.comit.course.BEAN;

public class Categories {
	int CategoryId;
	String name;
	String description;
	
	public Categories() {
		CategoryId=0;
		name="";
		description="";
		
		System.out.println(CategoryId);
		System.out.println(name);
		System.out.println(description);
	}

	public Categories(int categoryId, String name, String description) {
		super();
		CategoryId = categoryId;
		this.name = name;
		this.description = description;
	}

	public int getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
	
	
				
				
