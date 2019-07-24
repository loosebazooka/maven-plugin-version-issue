package com.loosebazooka.test;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;


@Mojo(name = "whatever")
public class Whatever extends AbstractMojo {

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    System.out.println("hello... whatever");
  }

}
