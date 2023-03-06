package org.lukas.envspecificmavenplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Copies only environment-specific configuration files into the final artifact.
 */
@Mojo(name = "copy")
public class IncludeEnvSpecificConfigMojo extends AbstractMojo {
    public void execute() {
        getLog().info("Hellooooooooo");
    }
}
