package org.lukas.envspecificmavenplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Copies only environment-specific configuration files into the final artifact.
 */
@Mojo(name = "copy", defaultPhase = LifecyclePhase.PROCESS_RESOURCES)
public class IncludeEnvSpecificConfigMojo extends AbstractMojo {
    @Parameter(property = "sourceDir", required = true)
    private String sourceDir;
    @Parameter(property = "env", required = true)
    private String env;
    
    public void execute() {
        getLog().info(
                "Source dir: '%s', env: '%s'".formatted(sourceDir, env)
        );
    }
}
