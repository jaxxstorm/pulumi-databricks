// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsGitSource extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsGitSource Empty = new GetJobJobSettingsSettingsGitSource();

    @Import(name="branch")
    private @Nullable String branch;

    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }

    @Import(name="commit")
    private @Nullable String commit;

    public Optional<String> commit() {
        return Optional.ofNullable(this.commit);
    }

    @Import(name="provider")
    private @Nullable String provider;

    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }

    @Import(name="tag")
    private @Nullable String tag;

    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private GetJobJobSettingsSettingsGitSource() {}

    private GetJobJobSettingsSettingsGitSource(GetJobJobSettingsSettingsGitSource $) {
        this.branch = $.branch;
        this.commit = $.commit;
        this.provider = $.provider;
        this.tag = $.tag;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsGitSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsGitSource $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsGitSource();
        }

        public Builder(GetJobJobSettingsSettingsGitSource defaults) {
            $ = new GetJobJobSettingsSettingsGitSource(Objects.requireNonNull(defaults));
        }

        public Builder branch(@Nullable String branch) {
            $.branch = branch;
            return this;
        }

        public Builder commit(@Nullable String commit) {
            $.commit = commit;
            return this;
        }

        public Builder provider(@Nullable String provider) {
            $.provider = provider;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            $.tag = tag;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public GetJobJobSettingsSettingsGitSource build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
