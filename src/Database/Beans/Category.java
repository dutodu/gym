package Database.Beans;


public class Category {

    private String category;
    private String categoryDes;
    private int oldCategoryId;
    
    

    public String getCategory() {
        return category;
    } 
    public void setCategory(String category) {
        this.category = category;
    }

    
    
    public String getCategoryDes() {
        return categoryDes;
    }
    public void setCategoryDes(String categoryDes) {
        this.categoryDes = categoryDes;
    }

    
    
    public int getOldCategoryId() {
        return oldCategoryId;
    }
    public void setOldCategoryId(int oldCategoryId) {
        this.oldCategoryId = oldCategoryId;
    }
    
}
