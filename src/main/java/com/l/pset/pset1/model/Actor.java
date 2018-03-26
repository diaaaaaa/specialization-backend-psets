
package com.l.pset.pset1.model;

import java.util.List;

public class Actor {
    private String actorName;
    private List<String> ActorsMaleFemaleRatio;

    public void setActorsMaleFemaleRatio(List<String> actorsMaleFemaleRatio) {
        ActorsMaleFemaleRatio = actorsMaleFemaleRatio;
    }



    public List<String> getActorsMaleFemaleRatio() {
        return ActorsMaleFemaleRatio;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
         this.actorName = actorName;
    }
}
