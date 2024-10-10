package org.example.model;

import org.example.model.abstraction.IHaveHierarchicalStructure;

import java.util.ArrayList;
import java.util.List;

public class Geography implements IHaveHierarchicalStructure<Geography> {
    private int id;
    private String name;
    private String type;
    private String code;
    private Integer parentId;
    private Geography parent;
    private List<Geography> children = new ArrayList<Geography>();

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setParent(Geography geography) {
        this.parent = geography;
    }

    @Override
    public List<Geography> getChildren() {
        return this.children;
    }

    @Override
    public Geography getParent() {
        return parent;
    }

    public int getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getParentId() {
        return (Integer) parentId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
