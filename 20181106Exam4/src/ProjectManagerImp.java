import lt.itakademija.exam.Issue;
import lt.itakademija.exam.Project;
import lt.itakademija.exam.ProjectManager;
import java.util.Collection;
import java.util.LinkedList;

public class ProjectManagerImp implements ProjectManager {

    private LinkedList<Project> projects = new LinkedList<>(); //sukuriam sarasa, nes juk projektus kazkur reikes deti
    LinkedList<Issue> issues = new LinkedList<>(); // sukuriam sarasa, nes juk ivykius kazkur reikes deti

    @Override
    public Project createProject(String id, String summary) { //pakeiciam s, s1 pagal doc
        if (id == null || summary == null) { // patikrinam ar projectas su duomenimis (id, summary)
            throw new NullPointerException();
        }
        if (id.equals("") || summary.equals("")) { //patikrinam ar stringas nera empty
            throw new IllegalArgumentException();
        }
        Project project = new Project(id, summary); //kadangi nera paduodamas metodui kaip argumentas, tai atsiranda poreikis projekta sukurti cia
        projects.add(project); //idedam projekta i sarasa
        return project;
    }

    @Override
    public Collection<Project> getProjects() { //nera poreikio iteruoti nes atiduodam visus projektus (skliaustuose nera argumneto)
        return projects;
    }

    @Override
    public Project getProjectById(String id) {
        for (Project project :projects) {
            if (project.getId().equals(id)) {
                return project; //iskart returninu, nera poreikio deti i sarasa nes nepraso (atitinkamai ir saraso nekuriam)
            }
        }
        return null;
    }

    @Override
    public Issue createIssue(Project project, String summary) {
        if (project == null || summary == null) {
            throw new NullPointerException();
        }
        if (summary.equals("")) { //jeigu kaip argumentas priimamas string, tai be null reikia tikrinti ir empty
            throw new IllegalArgumentException();
        }
        Issue issue = new Issue(project, summary); //argumentai pagal konstruktoriu
        issues.add(issue);
        return issue;
    }

    @Override
    public Issue createIssue(String id, String summary) {
        if (id == null || summary == null) {
            throw new NullPointerException();
        }
        if (id.equals("") || summary.equals("")) { //jeigu kaip argumentas priimamas string, tai be null reikia tikrinti ir empty
            throw new IllegalArgumentException();
        }
        Project project = getProjectById(id);
        Issue issue = new Issue(project, summary);
        //Issue issue = new Issue(getProjectById(id), summary); //argumentai turi buti pagal konstruktoriu, todel negalimpaduoti tik stringu
        issues.add(issue);
        return issue;
    }

    @Override
    public Collection<Issue> getIssues(Project project) {
        LinkedList<Issue> issuesByProject = new LinkedList<>();//sarasas metodo viduj, nes praso grazinti sarasa (o ne viena objekta)
        for (Issue issue : issues) {
            if (issue.getProject().equals(project)) {
                issuesByProject.add(issue);
            }
        }
        return issuesByProject;
    }

    @Override
    public Collection<Issue> getIssues(String id) {
        LinkedList<Issue> issuesByProjectId = new LinkedList<>();//sarasas metodo viduj, nes praso grazinti sarasa (o ne viena objekta)
        for (Issue issue : issues) {
            if (issue.getProject().getId().equals(id)) {//isue turi projekta, o projektas turi id
                issuesByProjectId.add(issue);
            }
        }
        return issuesByProjectId;
    }
}