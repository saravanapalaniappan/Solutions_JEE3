package com.htc.financials;

import java.io.Serializable;

public class Project implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String projectId;
    private String projectName;
    private String projectHead;
    private int noOfResources;

    public Project() {
    }

    /**
     * Get Project Id
     * @return
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Set Project Id
     * @param projectId
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * Get project name
     * @return
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Set project name
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * Get Project Head
     * @return
     */
    public String getProjectHead() {
        return projectHead;
    }

    /**
     * Set Project Head
     * @param projectHead
     */
    public void setProjectHead(String projectHead) {
        this.projectHead = projectHead;
    }

    /**
     * Get no.of.resources
     * @return
     */
    public int getNoOfResources() {
        return noOfResources;
    }

    /**
     * Set no.of.resources
     * @param noOfResources
     */
    public void setNoOfResources(int noOfResources) {
        this.noOfResources = noOfResources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (noOfResources != project.noOfResources) return false;
        if (!projectId.equals(project.projectId)) return false;
        if (!projectName.equals(project.projectName)) return false;
        return projectHead.equals(project.projectHead);

    }

    @Override
    public int hashCode() {
        int result = projectId.hashCode();
        result = 31 * result + projectName.hashCode();
        result = 31 * result + projectHead.hashCode();
        result = 31 * result + noOfResources;
        return result;
    }

    @Override
    public String toString() {
        return "Project{" +
                "Project Id='" + projectId + '\'' +
                ", Project Name='" + projectName + '\'' +
                ", Project Head='" + projectHead + '\'' +
                ", No.Of.Resources=" + noOfResources +
                '}';
    }
}