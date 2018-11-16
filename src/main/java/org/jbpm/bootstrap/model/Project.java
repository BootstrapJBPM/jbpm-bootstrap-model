package org.jbpm.bootstrap.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project implements Serializable {

    private static final long serialVersionUID = 147465343216850011L;

    private String name;
    private String packageName;
    private String version;
    private List<String> options;
    private List<String> capabilities;

    private String location;
    
    private Map<String, String> mappedVersions = new HashMap<String, String>();
    
    public Project() {
        this.mappedVersions.put("Enterprise 7.1", "7.11.0.Final-redhat-00003");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = mappedVersions.getOrDefault(version, version);
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
