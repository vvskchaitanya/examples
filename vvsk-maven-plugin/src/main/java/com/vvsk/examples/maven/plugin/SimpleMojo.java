package com.vvsk.examples.maven.plugin;

@Mojo(name="validate")
public class SimpleMojo extends AbstractMojo{

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    MavenProject project;

    public void execute() throws MojoExecutionException, MojoFailureException {
    
    }

}