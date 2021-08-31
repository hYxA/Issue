package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

public class IssueManager {
    private IssueRepository repository;

    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }

    public void IssueAdd(Issue item) {
        repository.save(item);
    }

    public Issue[] searchBy(String text) {
        Issue[] result = new Issue[0];
        for (Issue issue : repository.findAll()) {
            if (matches(issue, text)) {
                Issue[] tmp = new Issue[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = issue;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Issue issue, String search){
        if (issue.getAssignee().equalsIgnoreCase(search)){
            return true;
        }
        if (issue.getAuthor().equalsIgnoreCase(search)){
            return true;
        }
        if (issue.getLabel().equalsIgnoreCase(search)){
            return true;
        }
        if (issue.getPriority().equalsIgnoreCase(search)){
            return true;
        }
        return false;
    }

}
