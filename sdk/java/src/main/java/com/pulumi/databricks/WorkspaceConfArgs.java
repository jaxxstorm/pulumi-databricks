// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceConfArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceConfArgs Empty = new WorkspaceConfArgs();

    /**
     * Key-value map of strings that represent workspace configuration. Upon resource deletion, properties that start with `enable` or `enforce` will be reset to `false` value, regardless of initial default one.
     * 
     */
    @Import(name="customConfig")
    private @Nullable Output<Map<String,Object>> customConfig;

    /**
     * @return Key-value map of strings that represent workspace configuration. Upon resource deletion, properties that start with `enable` or `enforce` will be reset to `false` value, regardless of initial default one.
     * 
     */
    public Optional<Output<Map<String,Object>>> customConfig() {
        return Optional.ofNullable(this.customConfig);
    }

    private WorkspaceConfArgs() {}

    private WorkspaceConfArgs(WorkspaceConfArgs $) {
        this.customConfig = $.customConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceConfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceConfArgs $;

        public Builder() {
            $ = new WorkspaceConfArgs();
        }

        public Builder(WorkspaceConfArgs defaults) {
            $ = new WorkspaceConfArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customConfig Key-value map of strings that represent workspace configuration. Upon resource deletion, properties that start with `enable` or `enforce` will be reset to `false` value, regardless of initial default one.
         * 
         * @return builder
         * 
         */
        public Builder customConfig(@Nullable Output<Map<String,Object>> customConfig) {
            $.customConfig = customConfig;
            return this;
        }

        /**
         * @param customConfig Key-value map of strings that represent workspace configuration. Upon resource deletion, properties that start with `enable` or `enforce` will be reset to `false` value, regardless of initial default one.
         * 
         * @return builder
         * 
         */
        public Builder customConfig(Map<String,Object> customConfig) {
            return customConfig(Output.of(customConfig));
        }

        public WorkspaceConfArgs build() {
            return $;
        }
    }

}
