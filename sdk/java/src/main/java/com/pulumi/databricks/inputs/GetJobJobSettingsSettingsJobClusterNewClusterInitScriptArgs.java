// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfsArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFileArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcsArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3Args;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs Empty = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs();

    @Import(name="dbfs")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfsArgs> dbfs;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfsArgs>> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    @Import(name="file")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFileArgs> file;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="gcs")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcsArgs> gcs;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcsArgs>> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    @Import(name="s3")
    private @Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3Args> s3;

    public Optional<Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs() {}

    private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs $) {
        this.dbfs = $.dbfs;
        this.file = $.file;
        this.gcs = $.gcs;
        this.s3 = $.s3;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs();
        }

        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs defaults) {
            $ = new GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs(Objects.requireNonNull(defaults));
        }

        public Builder dbfs(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfsArgs> dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        public Builder dbfs(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptDbfsArgs dbfs) {
            return dbfs(Output.of(dbfs));
        }

        public Builder file(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFileArgs> file) {
            $.file = file;
            return this;
        }

        public Builder file(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptFileArgs file) {
            return file(Output.of(file));
        }

        public Builder gcs(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcsArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder gcs(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptGcsArgs gcs) {
            return gcs(Output.of(gcs));
        }

        public Builder s3(@Nullable Output<GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(GetJobJobSettingsSettingsJobClusterNewClusterInitScriptS3Args s3) {
            return s3(Output.of(s3));
        }

        public GetJobJobSettingsSettingsJobClusterNewClusterInitScriptArgs build() {
            return $;
        }
    }

}
