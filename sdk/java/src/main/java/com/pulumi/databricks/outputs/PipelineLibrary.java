// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.PipelineLibraryMaven;
import com.pulumi.databricks.outputs.PipelineLibraryNotebook;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineLibrary {
    private @Nullable String jar;
    private @Nullable PipelineLibraryMaven maven;
    private @Nullable PipelineLibraryNotebook notebook;
    private @Nullable String whl;

    private PipelineLibrary() {}
    public Optional<String> jar() {
        return Optional.ofNullable(this.jar);
    }
    public Optional<PipelineLibraryMaven> maven() {
        return Optional.ofNullable(this.maven);
    }
    public Optional<PipelineLibraryNotebook> notebook() {
        return Optional.ofNullable(this.notebook);
    }
    public Optional<String> whl() {
        return Optional.ofNullable(this.whl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineLibrary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String jar;
        private @Nullable PipelineLibraryMaven maven;
        private @Nullable PipelineLibraryNotebook notebook;
        private @Nullable String whl;
        public Builder() {}
        public Builder(PipelineLibrary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jar = defaults.jar;
    	      this.maven = defaults.maven;
    	      this.notebook = defaults.notebook;
    	      this.whl = defaults.whl;
        }

        @CustomType.Setter
        public Builder jar(@Nullable String jar) {
            this.jar = jar;
            return this;
        }
        @CustomType.Setter
        public Builder maven(@Nullable PipelineLibraryMaven maven) {
            this.maven = maven;
            return this;
        }
        @CustomType.Setter
        public Builder notebook(@Nullable PipelineLibraryNotebook notebook) {
            this.notebook = notebook;
            return this;
        }
        @CustomType.Setter
        public Builder whl(@Nullable String whl) {
            this.whl = whl;
            return this;
        }
        public PipelineLibrary build() {
            final var o = new PipelineLibrary();
            o.jar = jar;
            o.maven = maven;
            o.notebook = notebook;
            o.whl = whl;
            return o;
        }
    }
}
