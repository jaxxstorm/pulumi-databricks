// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DbfsFileState extends com.pulumi.resources.ResourceArgs {

    public static final DbfsFileState Empty = new DbfsFileState();

    @Import(name="contentBase64")
    private @Nullable Output<String> contentBase64;

    public Optional<Output<String>> contentBase64() {
        return Optional.ofNullable(this.contentBase64);
    }

    /**
     * Path, but with `dbfs:` prefix
     * 
     */
    @Import(name="dbfsPath")
    private @Nullable Output<String> dbfsPath;

    /**
     * @return Path, but with `dbfs:` prefix
     * 
     */
    public Optional<Output<String>> dbfsPath() {
        return Optional.ofNullable(this.dbfsPath);
    }

    /**
     * The file size of the file that is being tracked by this resource in bytes.
     * 
     */
    @Import(name="fileSize")
    private @Nullable Output<Integer> fileSize;

    /**
     * @return The file size of the file that is being tracked by this resource in bytes.
     * 
     */
    public Optional<Output<Integer>> fileSize() {
        return Optional.ofNullable(this.fileSize);
    }

    @Import(name="md5")
    private @Nullable Output<String> md5;

    public Optional<Output<String>> md5() {
        return Optional.ofNullable(this.md5);
    }

    /**
     * The path of the file in which you wish to save.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path of the file in which you wish to save.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The full absolute path to the file. Conflicts with `content_base64`.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The full absolute path to the file. Conflicts with `content_base64`.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private DbfsFileState() {}

    private DbfsFileState(DbfsFileState $) {
        this.contentBase64 = $.contentBase64;
        this.dbfsPath = $.dbfsPath;
        this.fileSize = $.fileSize;
        this.md5 = $.md5;
        this.path = $.path;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DbfsFileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DbfsFileState $;

        public Builder() {
            $ = new DbfsFileState();
        }

        public Builder(DbfsFileState defaults) {
            $ = new DbfsFileState(Objects.requireNonNull(defaults));
        }

        public Builder contentBase64(@Nullable Output<String> contentBase64) {
            $.contentBase64 = contentBase64;
            return this;
        }

        public Builder contentBase64(String contentBase64) {
            return contentBase64(Output.of(contentBase64));
        }

        /**
         * @param dbfsPath Path, but with `dbfs:` prefix
         * 
         * @return builder
         * 
         */
        public Builder dbfsPath(@Nullable Output<String> dbfsPath) {
            $.dbfsPath = dbfsPath;
            return this;
        }

        /**
         * @param dbfsPath Path, but with `dbfs:` prefix
         * 
         * @return builder
         * 
         */
        public Builder dbfsPath(String dbfsPath) {
            return dbfsPath(Output.of(dbfsPath));
        }

        /**
         * @param fileSize The file size of the file that is being tracked by this resource in bytes.
         * 
         * @return builder
         * 
         */
        public Builder fileSize(@Nullable Output<Integer> fileSize) {
            $.fileSize = fileSize;
            return this;
        }

        /**
         * @param fileSize The file size of the file that is being tracked by this resource in bytes.
         * 
         * @return builder
         * 
         */
        public Builder fileSize(Integer fileSize) {
            return fileSize(Output.of(fileSize));
        }

        public Builder md5(@Nullable Output<String> md5) {
            $.md5 = md5;
            return this;
        }

        public Builder md5(String md5) {
            return md5(Output.of(md5));
        }

        /**
         * @param path The path of the file in which you wish to save.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path of the file in which you wish to save.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param source The full absolute path to the file. Conflicts with `content_base64`.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The full absolute path to the file. Conflicts with `content_base64`.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public DbfsFileState build() {
            return $;
        }
    }

}
