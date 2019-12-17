package Database.Tables;

import Database.Beans.Category;
import Database.DB;
import java.sql.ResultSet;


public class CategoryManagment {
    
    
    public static boolean addCategory(Category category){
        
        return DB.iud("INSERT INTO category(category,description) VALUES('"+category.getCategory()+"','"+category.getCategoryDes()+"')");
    }
    
    public static boolean updateCategory(Category category){
        return DB.iud("UPDATE category SET category.category = '"+category.getCategory()+"', category.description= '"+category.getCategoryDes()+"' WHERE category.idcategory = '"+category.getOldCategoryId()+"' ");
    }
    
    public static ResultSet getAllCategory(String category){
      
        return DB.search("SELECT * FROM category WHERE category.category = '"+category+"' ");
    }
    
    public  static ResultSet getCategorySet(){
        return DB.search("SELECT * FROM category");
    }
    
    public static boolean isCategoryAvailable(String category){
        try {
   
        ResultSet resultSet = DB.search("SELECT idcategory FROM category WHERE category = '"+category+"' ");
        
        if(resultSet.next()){
            return true;
        }
          } catch (Exception e) {
              e.printStackTrace();
        }
        
        return false;
    }
    
      public static ResultSet getCategoryLike(String category) {
            return DB.search("SELECT category FROM category WHERE category LIKE '" + category + "%' ");
       
    }
    
}
