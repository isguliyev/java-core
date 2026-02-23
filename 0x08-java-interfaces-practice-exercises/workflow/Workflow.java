import activity.Activity;

import java.util.List;
import java.util.ArrayList;

public class Workflow {
    private List<Activity> activities;

    public Workflow() {
        setActivitys(new ArrayList<Activity>());
    }

    public void registerActivity(Activity activity) {
        this.activities.add(activity);
    }

    public void setActivitys(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Activity> getActivitys() {
        return this.activities;
    }
}