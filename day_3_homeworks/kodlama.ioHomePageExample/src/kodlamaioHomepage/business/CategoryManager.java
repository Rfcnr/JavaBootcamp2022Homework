package kodlamaioHomepage.business;

import kodlamaioHomepage.core.logging.ILogger;
import kodlamaioHomepage.dataAccess.IBaseDao;
import kodlamaioHomepage.entities.Category;

public class CategoryManager {

    private IBaseDao categoryDao;
    private ILogger[] categoryLoggers;

    public CategoryManager(IBaseDao categoryDao, ILogger[] categoryLoggers) {
        this.categoryDao = categoryDao;
        this.categoryLoggers = categoryLoggers;
    }

    public void addNewCategory(Category category) throws Exception {
        // business rules...
        checkCategoryRules(category);

        categoryDao.addCategoryToDatabase(category);

        for(ILogger logger : categoryLoggers) {
            logger.log("Category Name: " + category.getCategoryName() + " is logged.");
        }
    }

    private void checkCategoryRules(Category category) throws Exception {
        if (!isTheCategoryNameUnique(category.getCategoryName()))
            throw new Exception("There cannot be more than one category with the same name.");
        if (!isTheCategoryIdUnique(category.getCategoryId()))
            throw new Exception("Category id must be unique.");
    }
    private boolean isTheCategoryNameUnique(String categoryName){

        for(Category category : categoryDao.getCategoryListFromDatabase())
        {
            if (categoryName.equalsIgnoreCase(category.getCategoryName())) return false;
        }
        return true;
    }

    private boolean isTheCategoryIdUnique(int id){

        for(Category category : categoryDao.getCategoryListFromDatabase())
        {
            if (category.getCategoryId() == id) return false;
        }
        return true;
    }


}
