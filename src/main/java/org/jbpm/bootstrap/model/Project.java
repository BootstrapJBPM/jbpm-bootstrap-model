package org.jbpm.bootstrap.model;

import java.io.Serializable;
import java.util.List;

public class Project implements Serializable {

    private static final long serialVersionUID = 147465343216850011L;

    private String name;
    private String version;
    private List<String> options;
    private List<String> capabilities;

    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<String> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Project [name=" + name + ", version=" + version + ", options=" + options + ", capabilities=" + capabilities + ", location=" + location + "]";
    }

}
