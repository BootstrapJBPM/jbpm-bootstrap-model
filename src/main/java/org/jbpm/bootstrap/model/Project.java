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
        this.mappedVersions.put("Enterprise 7.2", "7.14.0.Final-redhat-00002");
        this.mappedVersions.put("Enterprise 7.2.1", "7.14.0.Final-redhat-00004");
        this.mappedVersions.put("Enterprise 7.3", "7.18.0.Final-redhat-00002");
        this.mappedVersions.put("Enterprise 7.3.1", "7.18.0.Final-redhat-00004");
        this.mappedVersions.put("Enterprise 7.4", "7.23.0.Final-redhat-00002");
        this.mappedVersions.put("Enterprise 7.4.1", "7.23.0.Final-redhat-00003");
        this.mappedVersions.put("Enterprise 7.5.0", "7.26.0.Final-redhat-00005");
        this.mappedVersions.put("Enterprise 7.5.1", "7.26.0.Final-redhat-00006");
        this.mappedVersions.put("Enterprise 7.6.0", "7.30.0.Final-redhat-00003");
        this.mappedVersions.put("Enterprise 7.7.0", "7.33.0.Final-redhat-00002");
        this.mappedVersions.put("Enterprise 7.8.0", "7.39.0.Final-redhat-00005");
        this.mappedVersions.put("Enterprise 7.8.1", "7.39.0.Final-redhat-00007");
        this.mappedVersions.put("Enterprise 7.9.0", "7.44.0.Final-redhat-00003");
        this.mappedVersions.put("Enterprise 7.10.0", "7.48.0.Final-redhat-00004");
        this.mappedVersions.put("Enterprise 7.10.1", "7.48.0.Final-redhat-00006");
        this.mappedVersions.put("Enterprise 7.11.0", "7.52.0.Final-redhat-00007");
        this.mappedVersions.put("Enterprise 7.11.1", "7.52.0.Final-redhat-00008");
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
        return "Project [name=" + name + ", version=" + version + ", options=" + options + ", capabilities="
                + capabilities + ", location=" + location + "]";
    }

}
