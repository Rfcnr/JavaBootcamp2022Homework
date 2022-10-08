package kodlamaioHomepage.business;

import kodlamaioHomepage.core.logging.ILogger;
import kodlamaioHomepage.dataAccess.IBaseDao;
import kodlamaioHomepage.entities.Instructor;

public class InstructorManager {
    private IBaseDao instructorDao;
    private ILogger[] instructorLoggers;

    public InstructorManager(IBaseDao instructorDao, ILogger[] instructorLoggers) {
        this.instructorDao = instructorDao;
        this.instructorLoggers = instructorLoggers;
    }

    public void addNewInstructor(Instructor instructor) throws Exception {
        // business rules...
        checkInstructorRules(instructor);

        instructorDao.addInstructorToDatabase(instructor);

        for(ILogger logger : instructorLoggers) {
            logger.log(instructor.getInstructorFullName() + ", the instructor with the ID number " + instructor.getInstructorID() + ", has been logged.");
        }
    }

    private void checkInstructorRules(Instructor instructor) throws Exception {
        if (!isTheInstructorIdUnique(instructor.getInstructorID()))
            throw new Exception("Instructor id must be unique.");
    }

    private boolean isTheInstructorIdUnique(int id){

        for(Instructor instructor : instructorDao.getInstructorListFromDatabase())
        {
            if (instructor.getInstructorID() == id) return false;
        }
        return true;
    }

}
