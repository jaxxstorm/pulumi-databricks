// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.ClusterLibraryCran;
import com.pulumi.databricks.outputs.ClusterLibraryMaven;
import com.pulumi.databricks.outputs.ClusterLibraryPypi;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterLibrary {
    private @Nullable ClusterLibraryCran cran;
    private @Nullable String egg;
    private @Nullable String jar;
    private @Nullable ClusterLibraryMaven maven;
    private @Nullable ClusterLibraryPypi pypi;
    private @Nullable String whl;

    private ClusterLibrary() {}
    public Optional<ClusterLibraryCran> cran() {
        return Optional.ofNullable(this.cran);
    }
    public Optional<String> egg() {
        return Optional.ofNullable(this.egg);
    }
    public Optional<String> jar() {
        return Optional.ofNullable(this.jar);
    }
    public Optional<ClusterLibraryMaven> maven() {
        return Optional.ofNullable(this.maven);
    }
    public Optional<ClusterLibraryPypi> pypi() {
        return Optional.ofNullable(this.pypi);
    }
    public Optional<String> whl() {
        return Optional.ofNullable(this.whl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLibrary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterLibraryCran cran;
        private @Nullable String egg;
        private @Nullable String jar;
        private @Nullable ClusterLibraryMaven maven;
        private @Nullable ClusterLibraryPypi pypi;
        private @Nullable String whl;
        public Builder() {}
        public Builder(ClusterLibrary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cran = defaults.cran;
    	      this.egg = defaults.egg;
    	      this.jar = defaults.jar;
    	      this.maven = defaults.maven;
    	      this.pypi = defaults.pypi;
    	      this.whl = defaults.whl;
        }

        @CustomType.Setter
        public Builder cran(@Nullable ClusterLibraryCran cran) {
            this.cran = cran;
            return this;
        }
        @CustomType.Setter
        public Builder egg(@Nullable String egg) {
            this.egg = egg;
            return this;
        }
        @CustomType.Setter
        public Builder jar(@Nullable String jar) {
            this.jar = jar;
            return this;
        }
        @CustomType.Setter
        public Builder maven(@Nullable ClusterLibraryMaven maven) {
            this.maven = maven;
            return this;
        }
        @CustomType.Setter
        public Builder pypi(@Nullable ClusterLibraryPypi pypi) {
            this.pypi = pypi;
            return this;
        }
        @CustomType.Setter
        public Builder whl(@Nullable String whl) {
            this.whl = whl;
            return this;
        }
        public ClusterLibrary build() {
            final var o = new ClusterLibrary();
            o.cran = cran;
            o.egg = egg;
            o.jar = jar;
            o.maven = maven;
            o.pypi = pypi;
            o.whl = whl;
            return o;
        }
    }
}
