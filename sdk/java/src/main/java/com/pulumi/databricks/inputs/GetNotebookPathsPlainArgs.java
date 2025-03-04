// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetNotebookPathsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotebookPathsPlainArgs Empty = new GetNotebookPathsPlainArgs();

    /**
     * Path to workspace directory
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return Path to workspace directory
     * 
     */
    public String path() {
        return this.path;
    }

    /**
     * Either or recursively walk given path
     * 
     */
    @Import(name="recursive", required=true)
    private Boolean recursive;

    /**
     * @return Either or recursively walk given path
     * 
     */
    public Boolean recursive() {
        return this.recursive;
    }

    private GetNotebookPathsPlainArgs() {}

    private GetNotebookPathsPlainArgs(GetNotebookPathsPlainArgs $) {
        this.path = $.path;
        this.recursive = $.recursive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotebookPathsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotebookPathsPlainArgs $;

        public Builder() {
            $ = new GetNotebookPathsPlainArgs();
        }

        public Builder(GetNotebookPathsPlainArgs defaults) {
            $ = new GetNotebookPathsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path Path to workspace directory
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        /**
         * @param recursive Either or recursively walk given path
         * 
         * @return builder
         * 
         */
        public Builder recursive(Boolean recursive) {
            $.recursive = recursive;
            return this;
        }

        public GetNotebookPathsPlainArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.recursive = Objects.requireNonNull($.recursive, "expected parameter 'recursive' to be non-null");
            return $;
        }
    }

}
