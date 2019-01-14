import lt.itakademija.exam.ProjectManager;
import lt.itakademija.exam.test.BaseTest;

public class ProjectManagerTestImpl extends BaseTest {
    @Override
    protected ProjectManager createProjectTracker() {
        return new ProjectManagerImp();
    }
}
