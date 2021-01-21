package com.vvsk.examples.maven.plugin;

@Mojo(name="validate")
public class SimpleMojo extends AbstractMojo{

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    MavenProject project;

    public void execute() throws MojoExecutionException, MojoFailureException {
    List<Dependency> dependencies = project.getDependencies();
    long numDependencies = dependencies.stream().count();          
    getLog().info("Number of dependencies: " + numDependencies);
}

}