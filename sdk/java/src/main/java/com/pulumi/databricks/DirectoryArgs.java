// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DirectoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DirectoryArgs Empty = new DirectoryArgs();

    @Import(name="deleteRecursive")
    private @Nullable Output<Boolean> deleteRecursive;

    public Optional<Output<Boolean>> deleteRecursive() {
        return Optional.ofNullable(this.deleteRecursive);
    }

    /**
     * Unique identifier for a DIRECTORY
     * 
     */
    @Import(name="objectId")
    private @Nullable Output<Integer> objectId;

    /**
     * @return Unique identifier for a DIRECTORY
     * 
     */
    public Optional<Output<Integer>> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * The absolute path of the directory, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The absolute path of the directory, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private DirectoryArgs() {}

    private DirectoryArgs(DirectoryArgs $) {
        this.deleteRecursive = $.deleteRecursive;
        this.objectId = $.objectId;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DirectoryArgs $;

        public Builder() {
            $ = new DirectoryArgs();
        }

        public Builder(DirectoryArgs defaults) {
            $ = new DirectoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteRecursive(@Nullable Output<Boolean> deleteRecursive) {
            $.deleteRecursive = deleteRecursive;
            return this;
        }

        public Builder deleteRecursive(Boolean deleteRecursive) {
            return deleteRecursive(Output.of(deleteRecursive));
        }

        /**
         * @param objectId Unique identifier for a DIRECTORY
         * 
         * @return builder
         * 
         */
        public Builder objectId(@Nullable Output<Integer> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId Unique identifier for a DIRECTORY
         * 
         * @return builder
         * 
         */
        public Builder objectId(Integer objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param path The absolute path of the directory, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The absolute path of the directory, beginning with &#34;/&#34;, e.g. &#34;/Demo&#34;.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public DirectoryArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
