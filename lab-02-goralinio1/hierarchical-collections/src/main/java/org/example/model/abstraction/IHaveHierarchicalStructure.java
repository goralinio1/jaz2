package org.example.model.abstraction;

import java.util.List;

public interface IHaveHierarchicalStructure<TIem> {

    void setParent(TIem geography);

    List<TIem> getChildren();

    TIem getParent();

    int getId();

    Integer getParentId();
}
